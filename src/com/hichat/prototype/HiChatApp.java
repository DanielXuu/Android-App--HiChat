package com.hichat.prototype;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class HiChatApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class HiChatApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this, "KGCcYEQdO6NBulDJPbhLEqozWLwvLBGWzkEmtP1w",
				"NstAS3lcnhnTJ6KXBWn9ru2agzAya8XD2b8EO4FX");

	}
}
