package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.IntermediateFragment;

/**
 * Created by fada21 on 18/10/15.
 */
public class IntermediateActivity extends StandardActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment getFragment() {
        return new IntermediateFragment();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_single_task:
                startActivity(new Intent(this, SingleTaskActivity.class));
                break;
            case R.id.btn_back:
                onBackPressed();
                break;
            default:
        }
    }
}
