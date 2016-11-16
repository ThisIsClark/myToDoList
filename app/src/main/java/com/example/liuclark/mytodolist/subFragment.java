package com.example.liuclark.mytodolist;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by liuclark on 2016/11/15.
 */

public class subFragment extends Fragment {

    TextView subTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.subfragment, container, false);
        subTitle = (TextView) view.findViewById(R.id.fragment_title);
        return view;
    }

    public void setTitle(String title) {
        subTitle.setText(title);
    }
}
