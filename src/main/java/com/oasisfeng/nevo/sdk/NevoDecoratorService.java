package com.oasisfeng.nevo.sdk;

import android.content.Context;

import android.service.notification.StatusBarNotification;
import androidx.annotation.Keep;

public abstract class NevoDecoratorService {
	/** Valid constant values for {@link android.app.Notification#EXTRA_TEMPLATE} */
	public static final String TEMPLATE_BIG_TEXT	= "android.app.Notification$BigTextStyle";
	public static final String TEMPLATE_INBOX		= "android.app.Notification$InboxStyle";
	public static final String TEMPLATE_BIG_PICTURE	= "android.app.Notification$BigPictureStyle";
	public static final String TEMPLATE_MEDIA		= "android.app.Notification$MediaStyle";
	public static final String TEMPLATE_MESSAGING	= "android.app.Notification$MessagingStyle";

	private static volatile Context appContext;

	protected static Context getAppContext() {
		return appContext;
	}

	public static void setAppContext(Context context) {
		appContext = context;
	}

	public void callApply(final StatusBarNotification sbn) {
		apply(sbn);
	}
	
	@Keep protected void apply(final StatusBarNotification evolving) {}
}