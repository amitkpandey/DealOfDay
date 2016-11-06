package com.example.hppc.dealofday;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String data = getIntent().getExtras().getString("keyName");

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        if(data.equals("amazon"))
            webView.loadUrl("http://www.amazon.in/gp/goldbox/ref=nav_cs_gb");
        else
            webView.loadUrl("https://www.flipkart.com/offers-list/deals-of-the-day?screen=dynamic&pk=contentTheme%3DDOTD_widgetType%3DdealCard&wid=2.dealCard.OMU&otracker=hp_omu_Deals+of+the+Day_0");
    }
}
