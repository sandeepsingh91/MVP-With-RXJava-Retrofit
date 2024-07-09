package test.com.mvp.splash;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import test.com.mvp.PostApi;
import test.com.mvp.R;
import test.com.mvp.base.BasePresenter;
import test.com.mvp.modal.Post;
import test.com.mvp.net.NetworkModule;

public class SplashPresenter extends BasePresenter {

    SplashView mSplashView;
    PostApi postApi;
    //  private Disposable subscription;

    SplashPresenter(SplashView splashView) {
        mSplashView = splashView;
    }

    @Override
    public void onViewCreated() {
        mSplashView.updateImage(R.mipmap.ic_launcher_round);

        postApi = new NetworkModule().providePostAPI();

        loadPosts();
    }


    @Override
    public void onViewDestroyed() {

    }

    public void loadPosts() {
        postApi.getPosts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                // .doOnTerminate()
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Post> posts) {

                        mSplashView.updatePosts(posts);

                    }

                    @Override
                    public void onError(Throwable e) {
                        mSplashView.showError("unknown_error");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
