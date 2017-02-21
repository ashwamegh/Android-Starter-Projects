package shashank.github.io.numbershapes;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class Number {
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){
            int x=1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + x;
            }
            if (triangularNumber == number){
                return true;
            }
            else{ return false; }
        }

    }


    public void testNumber(View view) {

        String message = "";
        EditText numberInput = (EditText) findViewById(R.id.number_input);


        if (numberInput.getText().toString().isEmpty()) {
            message = "Please enter a number";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

        }
          else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(numberInput.getText().toString());

            if (myNumber.isSquare() && myNumber.isTriangular()) {
                Toast.makeText(this, myNumber.number + " is both Sqaure & Triangular number!", Toast.LENGTH_LONG).show();
            } else if (myNumber.isSquare()) {
                Toast.makeText(this, myNumber.number + " is a Sqaure number!", Toast.LENGTH_LONG).show();

            } else if (myNumber.isTriangular()) {
                Toast.makeText(this, myNumber.number + " is a Triangular number!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, myNumber.number + " is neither Triangular nor a Square number!", Toast.LENGTH_SHORT).show();
            }
          }
    }


}
