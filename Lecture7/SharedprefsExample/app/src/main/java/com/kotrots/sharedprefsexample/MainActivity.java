package com.kotrots.sharedprefsexample;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edTxt;
    TextView txtVw;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt = (EditText) findViewById(R.id.editText);
        txtVw = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);

        SharedPreferences preferences = getSharedPreferences("MYPREFS", 0);
        txtVw.setText(preferences.getString("myText", "I dont have any text"));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", 0);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("myText", edTxt.getText().toString());
                editor.commit();
            }
        });
    }
}
