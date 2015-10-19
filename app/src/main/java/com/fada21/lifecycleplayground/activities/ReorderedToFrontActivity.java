package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.ReorderedToFrontFragment;

/**
 * Created by fada21 on 19/10/15.
 */
public class ReorderedToFrontActivity extends StandardActivity implements View.OnClickListener {

    @Override
    protected Fragment getFragment() {
        return new ReorderedToFrontFragment();
    }

    @Override
    public void onClick(View v) {
        final Intent intent;
        switch (v.getId()) {
            case R.id.btn_reorder:
                intent = new Intent(this, ReorderedToFrontActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            case R.id.btn_intermediate_standard:
                intent = new Intent(this, IntermediateActivity.class);
                startActivity(intent);
                break;
            default:
        }
    }
}