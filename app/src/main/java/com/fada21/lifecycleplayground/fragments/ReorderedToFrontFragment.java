package com.fada21.lifecycleplayground.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fada21.lifecycleplayground.R;

/**
 * Created by fada21 on 18/10/15.
 */
public class ReorderedToFrontFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_reordered_to_front, container, false);
    }

}
