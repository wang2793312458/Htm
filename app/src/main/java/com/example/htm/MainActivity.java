package com.example.htm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWeb_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeb_main = (WebView) findViewById(R.id.web_main);
        mWeb_main.loadUrl("file:///android_asset/UserAgreement.htm");
    }
}
