package com.github.shashank7200.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.*;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private int numberOfCoffees = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when Plus(+) button is pressed.
     * @param view
     */
    public void increment(View view){
        numberOfCoffees++;
        display(numberOfCoffees);
    }

    /**
     * This method is called when Minus(-) button is pressed.
     * @param view
     */

    public void decrement(View view){
        numberOfCoffees--;
        display(numberOfCoffees);
    }

    /**
     * This method is called when ORDER button is pressed
     * @param view
     */
    public void submitOrder(View view){

        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }

    /**
     * This method updates the Quantity of Coffees being Ordered.
     * @param number
     */
    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }

    /**
     * This method displays the price of total coffee ordered.
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en","in")).format(number));
    }
}
