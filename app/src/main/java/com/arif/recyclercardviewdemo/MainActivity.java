package com.arif.recyclercardviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    MyAdapter myAdapter;
    private String[] title, desc;
    private int[] images = {R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain, R.drawable.bangladesh, R.drawable.bhutan, R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = getResources().getStringArray(R.array.country_names);
        desc = getResources().getStringArray(R.array.country_des);
        recyclerView = findViewById(R.id.recyclerViewId);

        myAdapter = new MyAdapter(getApplicationContext(),images,title,desc);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }
}