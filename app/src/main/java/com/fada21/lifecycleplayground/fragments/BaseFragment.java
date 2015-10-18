package com.fada21.lifecycleplayground.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fada21.lifecycleplayground.LifecycleLogger;

/**
 * Created by fada21 on 18/10/15.
 */
abstract class BaseFragment extends Fragment {

    final LifecycleLogger logger = new LifecycleLogger(this);

    protected BaseFragment() {
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onStart() {
        super.onStart();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onResume() {
        super.onResume();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onPause() {
        super.onPause();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
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
    public void onStop() {
        super.onStop();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }


    @Override
    public void onDetach() {
        super.onDetach();
        logger.logEvent(new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

}
