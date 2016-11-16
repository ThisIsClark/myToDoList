package com.example.liuclark.mytodolist;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    subFragment topLeftFragment;
    subFragment topRightFragment;
    subFragment bottomLeftFragment;
    subFragment bottomRightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        topLeftFragment = (subFragment) fm.findFragmentById(R.id.top_left_fragment);
        topRightFragment = (subFragment) fm.findFragmentById(R.id.top_right_fragment);
        bottomLeftFragment = (subFragment) fm.findFragmentById(R.id.bottom_left_fragment);
        bottomRightFragment = (subFragment) fm.findFragmentById(R.id.bottom_right_fragment);

        topLeftFragment.setTitle("top_left");
        topRightFragment.setTitle("top_right");
        bottomLeftFragment.setTitle("bottom_left");
        bottomRightFragment.setTitle("bottom_right");
    }

}
