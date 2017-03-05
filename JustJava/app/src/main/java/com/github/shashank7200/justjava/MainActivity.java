package com.github.shashank7200.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int numberOfCoffees = 1;
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
        displayQuantity(numberOfCoffees);
    }

    /**
     * This method is called when Minus(-) button is pressed.
     * @param view
     */

    public void decrement(View view){
        numberOfCoffees--;
        displayQuantity(numberOfCoffees);
    }

    private int calculatePrice(){
        return numberOfCoffees *5;
    }
    /**
     * This method is called when ORDER button is pressed
     * @param view, responding to Order Button
     */
    public void submitOrder(View view){
        int orderPrice = calculatePrice();
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_check_box);
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_check_box);

        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        boolean hasChocolate = chocolateCheckBox.isChecked();

        String orderSummary = createOrderSummary(orderPrice,hasWhippedCream, hasChocolate);
        displayMessage(orderSummary);

    }

    /**
     *
     * @param orderPrice for the number of coffees ordered
     * @param hasWhippedCream specifies whether whipped Cream is added or not.
     * @param hasChocolate specifies whether Chocolate is selected or not.
     * @return the Order Summary.
     */
    private String createOrderSummary(int orderPrice, boolean hasWhippedCream , boolean hasChocolate) {


        String orderSummary  = "Name: Shashank Shekhar \nAdd whipped cream? "+hasWhippedCream+
                "\nAdd chocolate? "+hasChocolate+
                "\nQuantity: "+numberOfCoffees+
                "\nTotal: ₹ "+orderPrice+"\nThank You!";
        return orderSummary;
    }

    private void displayMessage(String priceMessage) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(priceMessage);
    }

    /**
     * This method updates the Quantity of Coffees being Ordered.
     * @param number
     */
    private void displayQuantity(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }

}
