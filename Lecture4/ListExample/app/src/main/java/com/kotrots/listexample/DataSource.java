package com.kotrots.listexample;

import java.util.ArrayList;

/**
 * Created by Kostas on 03/11/2015.
 */
public class DataSource {

    public ArrayList<String> getListItems(){
        ArrayList<String> items = new ArrayList<>();

        items.add("Kostas");
        items.add("Tasos");
        items.add("Maria");
        items.add("Stella");
        items.add("Nikos");

        return items;
    }
}
