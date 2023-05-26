package com.example.demooptiontranslation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Translate = "";
    String wordClicked="";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        // providing title for the ActionBar
        actionBar.setTitle("Demo Option translation");

        tv = findViewById(R.id.textView);
        // providing subtitle for the ActionBar
//        actionBar.setSubtitle("   Design a custom Action Bar");

        // adding icon in the ActionBar
//        actionBar.setIcon(R.drawable.app_logo);

        // methods to display the icon in the ActionBar
//        actionBar.setDisplayUseLogoEnabled(true);
//        actionBar.setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
            Toast.makeText(MainActivity.this, "Translated to English", Toast.LENGTH_LONG).show();
                Translate = "Hello";
                tv.setText(Translate);
                return true; //menu item successfully handled
            }
        else if(item.getItemId() == R.id.italianSelection) {
            Toast.makeText(MainActivity.this, "Translated to Italian", Toast.LENGTH_LONG).show();
            Translate = "Cya";
                tv.setText(Translate);
                return true; //menu item successfully handled
            }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }

}



