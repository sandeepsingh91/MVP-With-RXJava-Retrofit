package test.com.mvp.splash;

import java.util.List;

import test.com.mvp.base.BaseView;
import test.com.mvp.modal.Post;

public interface SplashView extends BaseView {

    void updateImage(int resId);

    void updatePosts(List<Post> posts);

    void showError(String error);
}
