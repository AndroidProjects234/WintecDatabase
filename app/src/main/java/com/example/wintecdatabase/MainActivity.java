package com.example.wintecdatabase;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SqliteDBHelper dbHelper;
    String name;
    int id;
    TextView one,two,three,four;
    ArrayList<String> list1;
    ArrayList<String>list2;
    ArrayAdapter adapter1,adapter2;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1=new ArrayList<String>();
        list2=new ArrayList<>();
       listView=(ListView) findViewById(R.id.list);
       dbHelper=new SqliteDBHelper(this,null,null,1);
        dbHelper.addCourses();
        dbHelper.addNetworkSem1();
        dbHelper.addNetworkSem2();
        dbHelper.addNetworkSem3();
        dbHelper.addNetworkSem4();
        dbHelper.addNetworkSem5();
        dbHelper.addNetworkSem6();
        dbHelper.addDBSem1();
        dbHelper.addDBSem2();
        dbHelper.addDBSem3();
        dbHelper.addDBSem4();
        dbHelper.addDBSem5();
        dbHelper.addDBSem6();
        dbHelper.addWEBSem1();
        dbHelper.addWEBSem2();
        dbHelper.addWEBSem3();
        dbHelper.addWEBSem4();
        dbHelper.addWEBSem5();
        dbHelper.addWEBSem6();
        dbHelper.addSoftwareSem1();
        dbHelper.addSoftwareSem2();
        dbHelper.addSoftwareSem3();
        dbHelper.addSoftwareSem4();
        dbHelper.addSoftwareSem5();
        dbHelper.addSoftwareSem6();
       /* Cursor c=dbHelper.databaseToString();
        c.moveToNext();
        while (!c.isAfterLast()){
            list1.add(c.getString(c.getColumnIndex(SqliteDBHelper.COLUMN_ID)));
         list2.add(c.getString(c.getColumnIndex(SqliteDBHelper.MODULE_TITLE)));
            c.moveToNext();
        }
        int s=list2.size();
        Toast.makeText(this,""+s,Toast.LENGTH_LONG).show();

        adapter1=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list2);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        listView.setAdapter(adapter1);*/

    }
}
