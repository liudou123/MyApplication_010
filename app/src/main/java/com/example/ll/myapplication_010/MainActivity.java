package com.example.ll.myapplication_010;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdapter();
    }
    private void initView() {
        mlist = (ListView) findViewById(R.id.mlist);
    }
    private void initData() {

    }
    private void initAdapter() {
      MyAdapter adapter=new MyAdapter();
    }
}
