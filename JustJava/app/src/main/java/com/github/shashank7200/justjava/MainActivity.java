package com.github.shashank7200.justjava;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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

        if (numberOfCoffees == 100){
            Toast.makeText(this, R.string.increment_toast_message,Toast.LENGTH_SHORT).show();
            return;
        }
        numberOfCoffees++;
        displayQuantity(numberOfCoffees);
    }

    /**
     * This method is called when Minus(-) button is pressed.
     * @param view
     */

    public void decrement(View view){

        if (numberOfCoffees == 1){
            Toast.makeText(this, R.string.decrement_toast_message,Toast.LENGTH_SHORT).show();
            return;
        }

        numberOfCoffees--;
        displayQuantity(numberOfCoffees);
    }

    private int calculatePrice(boolean addWhippedCream, boolean addChocolate){
        int basePrice = 5;

        if (addWhippedCream){
            if (addChocolate){
                basePrice = basePrice + 3;
            }
            else{
                basePrice = basePrice +1;
            }
        }
        else {
            if (addChocolate){
                basePrice = basePrice + 2;
            }
        }

        return  basePrice * numberOfCoffees ;
    }
    /**
     * This method is called when ORDER button is pressed
     * @param view, responding to Order Button
     */
    public void submitOrder(View view){
        EditText name = (EditText) findViewById(R.id.name_field);
        String nameString = name.getText().toString();

        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_check_box);
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_check_box);

        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        boolean hasChocolate = chocolateCheckBox.isChecked();

        int orderPrice = calculatePrice(hasWhippedCream, hasChocolate);


        String orderSummary = createOrderSummary(nameString, orderPrice ,hasWhippedCream, hasChocolate);

        /**
         * Intent which invokes an email app and passes Email Subject & messagae to populate intent data.
         */
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.mail_subject)+" "+nameString);
        intent.putExtra(Intent.EXTRA_TEXT, orderSummary);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

    /**
     *
     * @param orderPrice for the number of coffees ordered
     * @param hasWhippedCream specifies whether whipped Cream is added or not.
     * @param hasChocolate specifies whether Chocolate is selected or not.
     * @return the Order Summary.
     */
    private String createOrderSummary(String name, int orderPrice, boolean hasWhippedCream , boolean hasChocolate) {


        String orderSummary  = getString(R.string.order_summary_name,name)+"\n"+
                getString(R.string.whipped_cream_status,hasWhippedCream)+"\n"+
                getString(R.string.chocolate_status, hasChocolate)+"\n"+
                getString(R.string.order_quantity, numberOfCoffees)+"\n"+
                getString(R.string.total_price, orderPrice)+"\n"+
                getString(R.string.thank_you);

        return orderSummary;
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
