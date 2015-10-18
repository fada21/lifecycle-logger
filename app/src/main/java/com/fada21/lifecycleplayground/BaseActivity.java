package com.fada21.lifecycleplayground;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

/**
 * Created by fada21 on 18/10/15.
 */
public class BaseActivity extends AppCompatActivity {

    final LifecycleLogger logger = new LifecycleLogger(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        setTitle(getClass().getSimpleName());
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }
}
