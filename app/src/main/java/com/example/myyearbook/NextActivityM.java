package com.example.myyearbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class NextActivityM extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_next_m);

        Button bt = (Button) findViewById(R.id.buttonShare);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                //This shared link sends the recipient to a webpage with all the information about Jiraiya
                String body = "https://naruto.fandom.com/wiki/Jiraiya";
                String sub = "All You Need to Know About Jiraiya";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                myIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });
    }
    }






    
























