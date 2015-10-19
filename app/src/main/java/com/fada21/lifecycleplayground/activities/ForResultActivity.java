package com.fada21.lifecycleplayground.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.fada21.lifecycleplayground.R;
import com.fada21.lifecycleplayground.fragments.ForResultFragment;

/**
 * Created by fada21 on 19/10/15.
 */
public class ForResultActivity extends StandardActivity implements View.OnClickListener {

    public static final int CODE = 0x0000fada;
    public static final String MSG = "MSG";

    @Override
    protected Fragment getFragment() {
        return new ForResultFragment();
    }

    @Override
    public void onClick(View v) {
        final Intent data = new Intent();
        switch (v.getId()) {
            case R.id.btn_success:
                if (getParent() == null) {
                    data.putExtra(MSG, "SUCCESS");
                    setResult(Activity.RESULT_OK, data);
                } else {
                    getParent().setResult(Activity.RESULT_OK, data);
                }
                finish();
                break;
            case R.id.btn_cancel:
                if (getParent() == null) {
                    setResult(Activity.RESULT_CANCELED);
                } else {
                    getParent().setResult(Activity.RESULT_CANCELED);
                }
                finish();
                break;
            default:
        }
    }

}
