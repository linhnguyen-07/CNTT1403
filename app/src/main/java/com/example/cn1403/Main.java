package com.example.cn1403;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    ListView listView;

    // creating a String type array (fruitNames)
    // which contains names of different fruits' images
    String fruitNames[] = {"Banana", "Grape", "Guava", "Mango", "Orange", "Watermelon"};
    String fruitPrice[] = {"8888", "9999", "7777", "888", "56", "90"};

    // creating an Integer type array (fruitImageIds) which
    // contains IDs of different fruits' images
    int fruitImageIds[] = {R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

//        ListView lv = (ListView) findViewById(R.id.lv);
//        ArrayList<String> data = new ArrayList<>();
//        data.add("Lan");
//        data.add("Hồng");
//        data.add("Huệ");
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
//        lv.setAdapter(arrayAdapter);


        listView = findViewById(R.id.lv);

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        for (int i = 0; i < fruitNames.length; i++) {

            // creating an Object of HashMap class
            HashMap<String, Object> map = new HashMap<>();

            // Data entry in HashMap
            map.put("fruitName", fruitNames[i]);
            map.put("fruitImage", fruitImageIds[i]);
            map.put("fruitPrice", fruitPrice[i]);
            // adding the HashMap to the ArrayList
            list.add(map);
        }

        String[] from = {"fruitName", "fruitImage","fruitPrice"};

        // creating an integer type array(to) which contains
        // id of each View in each row of the list
        // and this array(form) is the fifth parameter of the SimpleAdapter
        int to[] = {R.id.textView_name, R.id.imageView, R.id.textView_price};

        // creating an Object of SimpleAdapter class and
        // passing all the required parameters
        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list, R.layout.item_layout_listview, from, to);

        // now setting the simpleAdapter to the ListView
        listView.setAdapter(simpleAdapter);
    }
}
