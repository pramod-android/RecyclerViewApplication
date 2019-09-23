package com.felix.recyclerviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;



    String[] items={"item1","item2","item3","item4","item5","item6","item7","item8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView)findViewById(R.id.recyclerView);


//        //Linear
//        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        //Grid
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(layoutManager);


        MyAdapter myAdapter=new MyAdapter(items,MainActivity.this);

        recyclerView.setAdapter(myAdapter);



    }
}
