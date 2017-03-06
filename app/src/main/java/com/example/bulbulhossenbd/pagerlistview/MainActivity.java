package com.example.bulbulhossenbd.pagerlistview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mContext = this;
        setContentView(R.layout.activity_main);
        ListView listview1 = new ListView(mContext);
        ListView listview2 = new ListView(mContext);
        ListView listview3 = new ListView(mContext);
        ListView listview4 = new ListView(mContext);
        ListView listview5 = new ListView(mContext);
        ListView listview6 = new ListView(mContext);
        ListView listview7 = new ListView(mContext);
        ListView listview8 = new ListView(mContext);
        ListView listview9 = new ListView(mContext);


        Vector<View> pages = new Vector<View>();

        pages.add(listview1);
        pages.add(listview2);
        pages.add(listview3);
        pages.add(listview4);
        pages.add(listview5);
        pages.add(listview6);
        pages.add(listview7);
        pages.add(listview8);
        pages.add(listview9);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext, "Hi Click", Toast.LENGTH_SHORT).show();
            }
        });

        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);
        CustomPagerAdapter adapter = new CustomPagerAdapter(mContext, pages);
        vp.setAdapter(adapter);

        listview1.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"One", "Two", "Four", "Five","Six","Seven","Eight","Nine","Ten"}));
        listview2.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"eleven", "twelve ", "thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"}));
        listview3.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"twenty-\n" +
                "twenty-\n" +
                "two", "twenty-\n" +
                "three", "twenty-\n" +
                "four", "twenty-\n" +
                "five","twenty-\n" +
                "six","twenty-\n" +
                "seven","twenty-\n" +
                "eight","twenty-\n" +
                "nine","thirty"}));
        listview4.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A4", "B3", "C3", "D3"}));
        listview5.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A5", "B3", "C3", "D3"}));
        listview6.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A6", "B3", "C3", "D3"}));
        listview7.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A7", "B3", "C3", "D3"}));
        listview8.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A8", "B3", "C3", "D3"}));
        listview9.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, new String[]{"A9", "B3", "C3", "D3"}));

    }
}