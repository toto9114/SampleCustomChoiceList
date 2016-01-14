package com.example.tacademy.samplecustomchoicelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        initData();
    }

    public void initData(){
        for(int i =0; i<20; i++){
            myAdapter.add("item"+ i);
        }
    }
}
