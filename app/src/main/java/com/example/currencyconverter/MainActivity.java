package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertCurrency(View view) {

        Log.i("Info", "Converted!");

        EditText editText= (EditText) findViewById(R.id.editText);

        String amountInDollars= editText.getText().toString();

        double amountInDollarsDouble= Double.parseDouble(amountInDollars);

        double amountInRsDouble= amountInDollarsDouble * 71.43;

        String amountInRsString = String.format("%.2f", amountInRsDouble);

        Toast.makeText(this, "$" + amountInDollars + "that is Rs." + amountInRsString , Toast.LENGTH_SHORT).show();





        Log.i("Info", editText.getText().toString());

        Log.i("Amount in Dollars:", amountInRsString);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
