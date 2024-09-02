package com.khair.bannertemplete;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

public class MainActivity extends AppCompatActivity {
    private NativeBannerAd mNativeBannerAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NativeBannerAd();


    }
   /////==============================================================
   public void NativeBannerAd(){

       mNativeBannerAd = new NativeBannerAd(this, "YOUR_PLACEMENT_ID");
       NativeAdListener nativeAdListener = new NativeAdListener() {
           @Override
           public void onMediaDownloaded(Ad ad) {

           }

           @Override
           public void onError(Ad ad, AdError adError) {

           }

           @Override
           public void onAdLoaded(Ad ad) {
               View adView = NativeBannerAdView.render(MainActivity.this, mNativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
               LinearLayout nativeBannerAdContainer = (LinearLayout) findViewById(R.id.native_banner_ad_container);
               // Add the Native Banner Ad View to your ad container
               nativeBannerAdContainer.addView(adView);
           }

           @Override
           public void onAdClicked(Ad ad) {

           }

           @Override
           public void onLoggingImpression(Ad ad) {

           }
       };


       // Initiate a request to load an ad.
       mNativeBannerAd.loadAd(
               mNativeBannerAd.buildLoadAdConfig()
                       .withAdListener(nativeAdListener)
                       .build());

   }



   ///=========================================================


}