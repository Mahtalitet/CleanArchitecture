package io.patrykpoborca.cleanarchitecture.network.base;

import java.util.concurrent.TimeUnit;

import io.patrykpoborca.cleanarchitecture.ui.MVPIC.models.UserProfile;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Patryk on 7/27/2015.
 */
public class Retrofit {

    OKHttp okHttp;
    public Retrofit(OKHttp okHttp) {
        this.okHttp = okHttp;
    }

    public String parseString(){
        return okHttp.rawResponse() + " Some Parsing Done";
    }

    public Observable<UserProfile> performRequest(String username, String password) {

        UserProfile userProfile = null;
        Observable<UserProfile> observable = Observable.just(userProfile)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .delay(3, TimeUnit.SECONDS);
        return observable;
    }
}
