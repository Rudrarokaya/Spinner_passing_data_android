package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private EditText ETONE, ETTWO;
    private Button btnOperations;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETONE = findViewById(R.id.et_one);
        ETTWO = findViewById(R.id.et_two);
        btnOperations = findViewById(R.id.btn_operations);
        spinner = findViewById(R.id.operations);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value1, value2;
                if (position == 0) {
                    value1 = ETONE.getText().toString();
                    value2 = ETTWO.getText().toString();
                    //result = value1 + value2;
                    Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("value1", value1);
                    bundle.putString("value2", value2);
                    bundle.putInt("position", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else if (position == 1) {
                     value1 = ETONE.getText().toString();
                     value2 = ETTWO.getText().toString();
                     //result = value1 * value2;
                    Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("value1", value1);
                    bundle.putString("value2", value2);
                    bundle.putInt("position", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (position == 2){
                     value1 = ETONE.getText().toString();
                     value2 = ETTWO.getText().toString();
                     //result = value1 - value2;
                    Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("value1", value1);
                    bundle.putString("value2", value2);
                    bundle.putInt("position", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                     value1 = ETONE.getText().toString();
                     value2 = ETTWO.getText().toString();
                    // result = value1 % value2;
                    Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("value1", value1);
                    bundle.putString("value2", value2);
                    bundle.putInt("position", position);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}