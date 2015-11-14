package com.kotrots.addtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_add;
    EditText edTxt_num1;
    EditText edTxt_num2;
    EditText edTxt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = (Button) findViewById(R.id.btn_add);
        edTxt_num1 = (EditText) findViewById(R.id.edTxt_num1);
        edTxt_num2 = (EditText) findViewById(R.id.edTxt_num2);
        edTxt_result = (EditText) findViewById(R.id.edTxt_result);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String strnum1 = edTxt_num1.getText().toString();
//                String strnum2 = edTxt_num2.getText().toString();

                double num1 = Double.valueOf(edTxt_num1.getText().toString());
                double num2 = Double.valueOf(edTxt_num2.getText().toString());

                double result = num1 + num2;

//                String strResult = String.valueOf(result);

                edTxt_result.setText(String.valueOf(result));
            }
        });
    }
}
