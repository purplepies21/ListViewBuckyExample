package com.example.ash.listviewbuckyexample;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods= {"apples","tuna","venison","porkchop","sandwiches","frozen bananas"};

        ListAdapter buckysAdapter= new CustomAdapter(this, foods);
        ListView ashsListView= (ListView) findViewById(R.id.ashListView);
        ashsListView.setAdapter(buckysAdapter);

        ashsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String food=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
            }
        });
    }

}
