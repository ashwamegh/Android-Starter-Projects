package com.example.ashwamegh.currencyconverter;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mDollarField;
    Button mConvertButton;

    public void currencyConverter(View view){
        mDollarField = (EditText) findViewById(R.id.dollarField);

        Double dollarAmount = Double.parseDouble(mDollarField.getText().toString());
        Double rupeeAmount = dollarAmount * 64;
        String covertedCurrency = rupeeAmount.toString();
        Toast.makeText(getApplicationContext(), "Your Dollar's rupee amount is INR "+covertedCurrency+" today.",Toast.LENGTH_LONG).show();
        Log.i("rupeeValue", covertedCurrency);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
