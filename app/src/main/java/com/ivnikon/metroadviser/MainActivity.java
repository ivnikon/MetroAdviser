package com.ivnikon.metroadviser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] Stations;
    ListView StationsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stations=getResources().getStringArray(R.array.Line_1);
        StationsList=(ListView)findViewById(R.id.StationsListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Stations);
        StationsList.setAdapter(adapter);
        StationsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DescriptionActivity.class);
                intent.putExtra(DescriptionActivity.EXTRA_POSITION,position);
                startActivity(intent);
            }
        });
    }
}
