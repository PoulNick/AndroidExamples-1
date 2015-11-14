package com.kotrots.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edTxt_num1;
    EditText edTxt_num2;
    EditText edTxt_res;

    Button btn_add;
    Button btn_min;
    Button btn_mul;
    Button btn_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt_num1 = (EditText) findViewById(R.id.edTxt_num1);
        edTxt_num2 = (EditText) findViewById(R.id.edTxt_num2);
        edTxt_res = (EditText) findViewById(R.id.edTxt_res);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        btn_min = (Button) findViewById(R.id.btn_min);
        btn_min.setOnClickListener(this);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double result = 0;
        double num1 = Double.valueOf(edTxt_num1.getText().toString());
        double num2 = Double.valueOf(edTxt_num2.getText().toString());

        if(v.getId() == R.id.btn_add){
            result = num1 + num2;
        }
        else if (v.getId() == R.id.btn_min) {
            result = num1 - num2;
        }
        else if (v.getId() == R.id.btn_mul) {
            result = num1 * num2;
        }
        else if (v.getId() == R.id.btn_div) {
            result = num1 - num2;
        }

        edTxt_res.setText(String.valueOf(result));

    }
}
