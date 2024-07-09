package test.com.mvp;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import test.com.mvp.modal.Post;

public interface PostApi {

    @GET("/posts")
    Observable<List<Post>> getPosts();
}
