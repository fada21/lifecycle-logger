package com.fada21.lifecycleplayground;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LifecycleLogger {

    public static final String TAG_ACTIVITY = "LIFECYCLE_EVENT_ACTIVITY";
    public static final String TAG_FRAGMENT = "LIFECYCLE_EVENT_FRAGMENT";

    private final Object objectWithLifecycle;

    final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

    LifecycleLogger(Object objectWithLifecycle) {
        this.objectWithLifecycle = objectWithLifecycle;
    }


    void logEvent(final String event) {
        final String tag;
        if (objectWithLifecycle instanceof Activity) {
            tag = TAG_ACTIVITY;
        } else if (objectWithLifecycle instanceof android.app.Fragment || objectWithLifecycle instanceof Fragment) {
            tag = TAG_FRAGMENT;
        } else {
            throw new IllegalStateException("Logger works only with Activities or Fragments");
        }
        String simpleName = objectWithLifecycle.getClass().getSimpleName();
        String now = sdf.format(new Date());
        String obj = Integer.toHexString(objectWithLifecycle.hashCode());
        Log.d(tag, String.format("%s[%s] @ %s - %s()", simpleName, obj, now, event));
    }

}
