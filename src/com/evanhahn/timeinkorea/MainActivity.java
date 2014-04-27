package com.evanhahn.timeinkorea;

import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	@SuppressLint("SetJavaScriptEnabled")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		WebView webView = (WebView) findViewById(R.id.web_view);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/page/index.html");
	}

}