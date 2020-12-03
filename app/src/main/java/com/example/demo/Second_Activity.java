package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    private Button btnResult;
    private TextView tvDisplay;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        tvDisplay = findViewById(R.id.display);
        btnResult = findViewById(R.id.btn_display_result);

        Bundle bundle = getIntent().getExtras();
        int finalResult;
        int firstValue = 0, secondValue = 0;
        String first_value, second_value;
        int op_symbol = 0;
        if (bundle != null){
           try{
                first_value = bundle.getString("value1");
                firstValue = Integer.parseInt(first_value);
                second_value = bundle.getString("value2");
                secondValue = Integer.parseInt(second_value);
                op_symbol = bundle.getInt("position");
           }catch (NumberFormatException e){
               e.printStackTrace();
           }


            if (op_symbol == 0){
                finalResult = firstValue + secondValue;
                tvDisplay.setText(firstValue + " " + " + " + secondValue + " = " + finalResult);
                return;
            }
            else if (op_symbol == 1){
                finalResult = firstValue * secondValue;
                tvDisplay.setText(firstValue + " " + " * " + secondValue + " = " + finalResult);
                return;
            }
            else if(op_symbol == 2){
                finalResult = firstValue - secondValue;
                tvDisplay.setText(firstValue + " " + " - " + secondValue + " = " + finalResult);
                return;
            }
            else{
                finalResult = firstValue / secondValue;
                tvDisplay.setText(firstValue + " " + " / " + secondValue + " = " + finalResult);
                return;
            }
        }
    }
}