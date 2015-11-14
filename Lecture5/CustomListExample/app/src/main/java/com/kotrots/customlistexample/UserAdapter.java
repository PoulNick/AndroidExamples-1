package com.kotrots.customlistexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kostas on 05/11/2015.
 */
public class UserAdapter extends BaseAdapter {

    Context context;
    ArrayList<User> users;

    public UserAdapter(Context context, ArrayList<User> users){
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return users.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_layout, null);
        }

        TextView txtVw_name = (TextView) convertView.findViewById(R.id.txtVw_name);
        TextView txtVw_email = (TextView) convertView.findViewById(R.id.txtVw_email);

        User user_pos = users.get(position);

        txtVw_name.setText(user_pos.getName());
        txtVw_email.setText(user_pos.getEmail());

        return convertView;
    }
}
