package com.kotrots.readsometext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edTxt;
    Button btn;
    TextView txtVw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt = (EditText) findViewById(R.id.edTxt);
        btn = (Button) findViewById(R.id.btn);
        txtVw = (TextView) findViewById(R.id.txtVw);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edTxt.getText().toString();

                Log.d("MyLogs", text);

                txtVw.setText(text);
            }
        });


    }
}
