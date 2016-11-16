package com.example.liuclark.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView topLeftText;
    TextView topRightText;
    TextView bottomLeftText;
    TextView bottomRightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topLeftText = (TextView)findViewById(R.id.top_left_textview);
        topRightText = (TextView)findViewById(R.id.top_right_textview);
        bottomLeftText = (TextView)findViewById(R.id.bottom_left_textview);
        bottomRightText = (TextView)findViewById(R.id.bottom_right_textview);

        topLeftText.setOnClickListener(this);
        topRightText.setOnClickListener(this);
        bottomLeftText.setOnClickListener(this);
        bottomRightText.setOnClickListener(this);

        topLeftText.setText(R.string.empty_todo_list);
        topRightText.setText(R.string.empty_todo_list);
        bottomLeftText.setText(R.string.empty_todo_list);
        bottomRightText.setText(R.string.empty_todo_list);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_left_textview:
                Toast.makeText(getApplicationContext(), "top left", Toast.LENGTH_SHORT).show();
                break;
            case R.id.top_right_textview:
                Toast.makeText(getApplicationContext(), "top right", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bottom_left_textview:
                Toast.makeText(getApplicationContext(), "bottom left", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bottom_right_textview:
                Toast.makeText(getApplicationContext(), "bottom right", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
