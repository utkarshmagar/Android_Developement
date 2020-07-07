package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float num1, num2;
    private float result;
    private TextView res, creditional;
    private EditText ed1, ed2;
    private Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.FirstNo);
        ed2 = findViewById(R.id.SecondNo);
        res = findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        creditional = findViewById(R.id.made_by);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(ed1.getText().toString());
                num2 = Float.parseFloat(ed2.getText().toString());
                result = num1 + num2;
                res.setText(String.valueOf(result));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                num2 = Float.parseFloat(ed2.getText().toString());
                result = num1 - num2;
                res.setText(String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                num2 = Float.parseFloat(ed2.getText().toString());
                result = num1 * num2;
                res.setText(String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                num2 = Float.parseFloat(ed2.getText().toString());
                result = num1 / num2;
                res.setText(String.valueOf(result));
            }
        });
    }
}
