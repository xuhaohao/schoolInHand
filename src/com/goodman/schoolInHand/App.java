package com.goodman.schoolInHand;

import com.goodman.schoolInHand.util.ImageCacheUtil;

import android.app.Application;


public class App extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		ImageCacheUtil.init(this);
	}
}

