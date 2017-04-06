package com.kunyuhan.robot.androidtest;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class OtherActivity extends LauncherActivity {

    String [] names = {"设置的参数","查看星际兵种"};
    Class<?>[] clazzs = {PreferenceActivityTest.class, ExpandableListActivityTset.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
    }
    public Intent intentForPosition(int position)
    {
        return new Intent(OtherActivity.this,clazzs[position]);
    }
}
