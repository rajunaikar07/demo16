package com.example.demo16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=findViewById(R.id.simplelist);

        List<String> list=new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Papaya");
        list.add("Mongo");
        ArrayAdapter arrad = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
       listview.setAdapter(arrad);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                if(i==0)
                {
                    startActivity(new Intent(MainActivity.this,Banana_Activity.class));
                }else if(i==1)
                {
                    startActivity(new Intent(MainActivity.this,Apple_Activity.class));
                }else if(i==2)
                {
                    startActivity(new Intent(MainActivity.this,Papaya_Activity.class));
                }else if(i==3)
                {
                    startActivity(new Intent(MainActivity.this,Mongo_Activity.class));
                }

            }
        });


    }


}
