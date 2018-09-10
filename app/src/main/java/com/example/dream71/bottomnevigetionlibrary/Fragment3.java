package com.example.dream71.bottomnevigetionlibrary;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Fragment3 extends Fragment {


    @BindView(R.id.text)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1 , container , false);
        ButterKnife.bind(this , view);
        textView.setText("Fragment 3");
        return view;
    }
}
