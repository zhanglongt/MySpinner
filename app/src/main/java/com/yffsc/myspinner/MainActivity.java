package com.yffsc.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    XCDropDownListView dropDownListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropDownListView = (XCDropDownListView)findViewById(R.id.drop_down_list_view);
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i< 6;i++){
            list.add("下拉列表项"+(i+1));
        }
        dropDownListView.setItemsData(list);

    }
}
