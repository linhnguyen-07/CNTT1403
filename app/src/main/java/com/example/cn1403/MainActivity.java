package com.example.cn1403;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        Button bt_1 = (Button) findViewById(R.id.bt_1);
        bt_1.setOnClickListener(new View.OnClickListener() {*/
            @Override
           /* public void onClick(View view) {*/
  //              EditText et_1 = (EditText) findViewById(R.id.et_1);
//                TextView tv_1 = (TextView) findViewById(R.id.tv_1);
//                String aaa = et_1.getText().toString();
//                tv_1.setText(aaa);

                /*EditText et = (EditText) findViewById(R.id.et_1);
                String aaa = et.getText().toString();
               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.putExtra("name_String", aaa);
               startActivity(intent);*/
            protected void onCreate(Bundle savedInstanceState){
               super.onCreate(savedInstanceState);
               setContentView(R.layout.listview);

               ListView lv = (ListView) findViewById(R.id.lv);
                ArrayList<String> data = new ArrayList<>();
                data.add("linh");
                data.add("xinh");
                data.add("dep");
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
                lv.setAdapter(arrayAdapter);



          /*  }
        });*/
    }
}