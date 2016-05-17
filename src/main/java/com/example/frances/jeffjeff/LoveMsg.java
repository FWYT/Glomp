package com.example.frances.jeffjeff;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by Frances on 5/13/2016.
 */
public class LoveMsg extends AppCompatActivity implements View.OnClickListener {

    Button next;
    String[] m = {"I love you cause you make me smile everyday",
                  "I love you cause you're so corny",
                  "I love you cause you put in so much effort into me",
                  "I love you cause your massages are heavenly",
                  "I love you cause I love seeing you smile",
                  "I love you cause you take me to so many amazing dates <3",
                  "I love you cause I feel comfortable telling you anything",
                  "I love you cause you encourage me to be better",
                  "I love you cause holding your hand makes me all warm and fuzzy inside",
                  "I love you cause being wrapped in your arms feels so comfortable",
                  "I love you cause we take lots of pictures together and looking at them makes me happy",
                  "I love you cause you're so adorable",
                  "I love you cause you talk to me everyday",
                  "I love you cause you take care of me so much",
                  "I love you cause I love you <3",
                  "I love hugging you ><",
                  "I think about you every minute of every day",
                  "I love cooking yummy foods for you <3",
                  "I love it when you kiss me before leaving for work",
                  "I love it when you kiss my forehead",
                  "I love that you make me happy whenever I get upset",
                  "I love all the pictures of us",
                  "I love how you're such a sweet talker",
                  "YOU'RE SO HANDSOME ><",
                  "I love going on trips with you :3",
                  "Cuddling with you feels so comfortable",
                  "I love that you appreciate me",
                  "I love thinking about presents to give you",
                  "I can't wait to see you again",
                  "I always get butterflies in my stomach when thinking of you",
                  "I'm so happy I'm with you",
                  "I'm the luckiest girl in the world cause you're my boyfriend",
                  "Skyping you is the happiest part of everyday",
                  "I love being next to you",
                  "I love kissing you and making you smile",
                  "I love it when you touch my face",
                  "I love tickling you :D", "I love that you like to try new things", "I love hugging you the minute you come back from work", "I love playing pool with you"};


    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lovemsg);

        msg = (TextView)findViewById(R.id.msg);
        Random r = new Random();
        int i = r.nextInt((m.length-1) + 1);
        msg.setText(m[i]);

       next = (Button)findViewById(R.id.next);
       next.setOnClickListener(this);
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
            case (R.id.next):
                finish();
                startActivity(getIntent());
                break;
        }
    }
}


