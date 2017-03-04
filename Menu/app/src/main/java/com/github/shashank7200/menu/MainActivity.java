package com.github.shashank7200.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        final String TAG ="printToLogs Method";
        // Find first menu item TextView and print the text to the logs
        TextView firstText =  (TextView) findViewById(R.id.menu_item_1);
        Log.d(TAG, firstText.getText().toString());
        // Find second menu item TextView and print the text to the logs
        TextView secondText = (TextView) findViewById(R.id.menu_item_2);
        Log.d(TAG, secondText.getText().toString());
        // Find third menu item TextView and print the text to the logs

        TextView thirdText = (TextView) findViewById(R.id.menu_item_3);
        Log.d(TAG, thirdText.getText().toString());
    }
}
