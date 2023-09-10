package com.example.l02_guiinterations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titleTextview, totalTextview;
    EditText pennyInput, nickelInput, dimeInput, quarterInput;
    Button submitButton;
    double total = 0.0;
    int pennyCount = 0;
    int nickelCount = 0;
    int dimeCount = 0;
    int quarterCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleTextview = findViewById(R.id.title_textview);
        totalTextview = findViewById(R.id.total_textview);
        pennyInput = findViewById(R.id.penny_edittext);
        nickelInput = findViewById(R.id.nickel_edittext);
        dimeInput = findViewById(R.id.dime_edittext);
        quarterInput = findViewById(R.id.quarter_edittext);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pennyCount = Integer.parseInt(pennyInput.getText().toString());
                nickelCount = Integer.parseInt(nickelInput.getText().toString());
                dimeCount = Integer.parseInt(dimeInput.getText().toString());
                quarterCount = Integer.parseInt(quarterInput.getText().toString());

                total = 0.01 * ((pennyCount * 1.0) + (nickelCount * 5.0) + (dimeCount * 10.0) + (quarterCount * 25.0) );
                totalTextview.setText("Total: $" + total);
            }
        });
    }
}