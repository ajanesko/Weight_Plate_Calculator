package com.example.weightplatecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText input1;

    private TextView weight_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.weight_input1);

        Button weight_calculate = findViewById(R.id.weight_calculate);

        weight_result = findViewById(R.id.weight_result);

        weight_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeCalculations();
            }
        });
    }

    private void makeCalculations() {
        double n = Double.valueOf(input1.getText().toString());

        double result = n * 2;

        weight_result.setText("The result is: " + result);
    }

}