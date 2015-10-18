package com.fada21.lifecycleplayground.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.StandardFragment;

/**
 * Created by fada21 on 18/10/15.
 */
public class StandardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_standard;
    }


    private void setupFragment() {
        final Fragment fragment = getFragment();
        final String tag = fragment.getClass().getSimpleName();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content, fragment, tag)
                .commit();
    }

    protected Fragment getFragment() {
        return new StandardFragment();
    }
}
