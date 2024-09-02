package com.khair.bannertemplete;

import android.app.Application;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class MobileAd_in extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("0503e2ba-d308-4293-94ec-5f921156cf64");

    }
}
