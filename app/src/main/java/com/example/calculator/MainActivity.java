package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etFirstValue ,etSecondValue ;
    TextView tvAns;
    Button add , sub , mul , div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int first,second ,ans;

                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first + second;
                tvAns.setText("Answer = "+ans);

            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int first,second ,ans;

                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first - second;
                tvAns.setText("Answer = "+ans);

            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int first,second ,ans;

                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first * second;
                tvAns.setText("Answer = "+ans);

            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int first,second ,ans;

                first = Integer.parseInt(etFirstValue.getText().toString());
                second = Integer.parseInt(etSecondValue.getText().toString());
                ans = first /  second;
                tvAns.setText("Answer = "+ans);

            }
        });
    }
}
