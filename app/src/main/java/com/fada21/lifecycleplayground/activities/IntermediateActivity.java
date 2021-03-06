package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.IntermediateFragment;

/**
 * Created by fada21 on 18/10/15.
 */
public class IntermediateActivity extends StandardActivity implements View.OnClickListener {

    @Override
    protected Fragment getFragment() {
        return new IntermediateFragment();
    }

    @Override
    public void onClick(View v) {
        final Intent intent;
        switch (v.getId()) {
            case R.id.btn_single_task:
                intent = new Intent(this, SingleTaskActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_reorder:
                intent = new Intent(this, ReorderedToFrontActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            case R.id.btn_single_top:
                intent = new Intent(this, IntermediateActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                break;
            case R.id.btn_intermediate_standard:
                intent = new Intent(this, IntermediateActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_back:
                onBackPressed();
                break;
            default:
        }
    }
}
