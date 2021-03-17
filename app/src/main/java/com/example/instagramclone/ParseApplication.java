package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4YpVvN2265wnSYPUtS4HJumW0bQiFIfHhrrnbFvs")
                .clientKey("jyYOMeM7v3fOalzzr6HBRrh1reHoSabOIlnIb8Bn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
