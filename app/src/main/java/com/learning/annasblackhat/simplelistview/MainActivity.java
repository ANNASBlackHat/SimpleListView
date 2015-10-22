package com.learning.annasblackhat.simplelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] ukm = {"AMIKOM COMPUTER CLUB","KOMUNITAS MUSIK AMIKOM", "MAYAPALA","AMIKOM GAME DEVELOPER",
            "POTRAIT","UKI JASTIS","AMIKOM MUSIC ORGANISATION", "HMJTI", "HIMSI", "AMIKOM COMPUTER CLUB",
            "KOMUNITAS MUSIK AMIKOM", "MAYAPALA","AMIKOM GAME DEVELOPER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        //menset adapter untuk listView
        list.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,ukm));

        //menambahkan Action ketika list nya di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Anda mengklik : "+ukm[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondLayout.class);
                intent.putExtra("parameter",ukm[position]);
                startActivity(intent);
            }
        });

    }

}
