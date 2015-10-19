package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;

import com.fada21.lifecycleplayground.R;

/**
 * Created by fada21 on 18/10/15.
 */
public class HomeActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        final Intent intent;
        switch (v.getId()) {
            case R.id.btn_regular:
                intent = new Intent(this, StandardActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_retained:
                intent = new Intent(this, WithRetainedFragmentActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_reorder:
                intent = new Intent(this, ReorderedToFrontActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                break;
            case R.id.btn_single_task:
                intent = new Intent(this, SingleTaskActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_config_change:
                intent = new Intent(this, ConfChangeHandledActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_for_result:
                intent = new Intent(this, ForResultActivity.class);
                startActivityForResult(intent, ForResultActivity.CODE);
                break;
            default:
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case ForResultActivity.CODE:
                if (resultCode == RESULT_OK) {
                    final String returnMsg = data.getExtras().getString(ForResultActivity.MSG);
                    logger.logEvent(returnMsg);
                } else {
                    logger.logEvent("CANCELLED");
                }
                break;
        }
    }
}
