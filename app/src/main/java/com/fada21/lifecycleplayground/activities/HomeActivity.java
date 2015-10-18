package com.fada21.lifecycleplayground.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.fada21.lifecycleplayground.R;

/**
 * Created by fada21 on 18/10/15.
 */
public class HomeActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

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
        switch (v.getId()) {
            case R.id.btn_regular:
                startActivity(new Intent(this, StandardActivity.class));
                break;
            case R.id.btn_retained:
                startActivity(new Intent(this, WithRetainedFragmentActivity.class));
                break;
            case R.id.btn_single_task:
                startActivity(new Intent(this, SingleTaskActivity.class));
                break;
            default:
        }
    }
}
