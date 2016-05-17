package com.example.frances.jeffjeff;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Frances on 5/13/2016.
 */
public class Date extends AppCompatActivity implements View.OnClickListener {

    Button next;
    TextView date;

    String[] m = {"Hiking!", "Swimming!", "Find a new bakery and try cakes!", "Pool! I need to get as good as master JeffJeff!", "Look up a new recipe, grocery shop, and cook!",
                  "Watch an opera! ...Even though I know you don't like it ><", "Do a new programming project!", "Picnic! I've never been on a picnic before :D", "DDR so I can see your mad skills and cry",
                  "Shopping!", "Plan a future trip!", "Go to a concert!", "Go to a show!", "Explore a new area!", "Shaved Ice! *drool*", "Beach!", "I wanna learn glass blowing :3", "Stay home and let me suck your dick all day!",
                  "Go to the library! I'll make you like books ><", "Walk around and see what we find!", "Not run over a deer!", "Movies at Stafford! Comfy chaiirrsssssss", "Horseback riding!", "Find a new restaurant to try!",
                  "Work out!", "Amusement park!", "Museums!!", "Archery! I've always wanted to try that :D", "Volunteer somewhere!", "Go to a petshop :3", "Boaord games!", "Massage! :D",
                  "Flea Market! I've never been to one :D", "Biking!", "Watch funny youtube videos!", "Lay in bed all day!", "Mini golf! Universal Studios was really fun ^^", "Go on a road trip!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        next = (Button)findViewById(R.id.nextDate);
        next.setOnClickListener(this);

        date = (TextView)findViewById(R.id.dateIdea);
        Random r = new Random();
        int i = r.nextInt((m.length-1) + 1);
        date.setText(m[i]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case (R.id.nextDate):
                finish();
                startActivity(getIntent());
                break;
        }
    }
}
