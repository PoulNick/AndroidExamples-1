package com.kotrots.contextmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVw = (TextView) findViewById(R.id.txtVw);

        registerForContextMenu(txtVw);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.item1){
            Log.d("MyLogs", "You press item 1");
        }
        if(item.getItemId() == R.id.item2){
            Log.d("MyLogs", "You press item 2");
        }
        if(item.getItemId() == R.id.item3){
            Log.d("MyLogs", "You press item 3");

        }
        return super.onContextItemSelected(item);
    }
}
