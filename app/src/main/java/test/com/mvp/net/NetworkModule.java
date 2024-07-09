package test.com.mvp.net;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import test.com.mvp.PostApi;

public class NetworkModule {

    public PostApi providePostAPI() {

        Retrofit retrofit = provideRetrofitInterface();
        return retrofit.create(PostApi.class);
    }

    public Retrofit provideRetrofitInterface() {
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build();
    }
}
