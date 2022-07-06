package com.example.assignment12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        Button zero = (Button) findViewById(R.id.button_zero);
        zero.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        if(mCount % 2 == 0){
            System.out.println("Here");
            view.setBackgroundColor(getResources().getColor(R.color.even));
        } else {
            view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        }
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_button_toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showZero(View view) {
        mCount = 0;
        view.setBackgroundColor(getResources().getColor(R.color.grey));
        mShowCount.setText(Integer.toString(mCount));
    }
}