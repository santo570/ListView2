package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewID);

        String[] countryNames = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textviewID,countryNames);
        listView.setAdapter(adapter);
    }
}
