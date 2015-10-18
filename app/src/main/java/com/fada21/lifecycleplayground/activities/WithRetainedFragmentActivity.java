package com.fada21.lifecycleplayground.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.fada21.lifecycleplayground.fragments.RetainedFragment;

/**
 * Created by fada21 on 18/10/15.
 */
public class WithRetainedFragmentActivity extends StandardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRetainedFragment();
    }

    private void setupRetainedFragment() {
        final String retainedFragmentTag = RetainedFragment.class.getSimpleName();
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentByTag(retainedFragmentTag) == null) {
            final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            RetainedFragment retainedFragment = new RetainedFragment();
            retainedFragment.setRetainInstance(true);
            fragmentTransaction.add(retainedFragment, retainedFragmentTag);
            fragmentTransaction.commit();
        }
    }
}
