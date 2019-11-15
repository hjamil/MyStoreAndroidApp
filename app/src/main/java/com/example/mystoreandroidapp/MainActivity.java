package com.example.mystoreandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // hide the title
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load webview
        WebView myWebView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = myWebView.getSettings();
        //enable html5 and javascript app
        webSettings.setJavaScriptEnabled(true);
        webSettings .setDomStorageEnabled(true);

        //Javascript interface
        //TODO: this doesn't work yet
        //TODO: I am trying get toast to work
        myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");

        // load the web application
        myWebView.loadUrl("http://10.0.2.2:4200/");
//        myWebView.loadUrl("https://www.google.com");
    }
}
