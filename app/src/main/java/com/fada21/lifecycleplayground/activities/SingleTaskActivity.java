package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.SingleTaskFragment;

/**
 * Created by fada21 on 18/10/15.
 */
public class SingleTaskActivity extends StandardActivity implements View.OnClickListener {

    @Override
    protected Fragment getFragment() {
        return new SingleTaskFragment();
    }

    @Override
    public void onClick(View v) {
        final Intent intent;
        switch (v.getId()) {
            case R.id.btn_single_task:
                intent = new Intent(this, SingleTaskActivity.class);
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
