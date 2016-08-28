package com.example.intentdemo.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    // Creating an empty activity and this is like our MAIN method in java
    @Override // Allows us to manipulate the onCreate() function the way we want it to
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // This is a line that calls the constructor from the parent class
        setContentView(R.layout.activity_first); // Calls the layout file and places it on the screen (design)
        initializeButtonActivity();
    }

    public void initializeButtonActivity() {
        final Button btnListener = (Button) findViewById(R.id.btnListener); // We created a button object by casting instead of using the keyword "new"
        btnListener.setOnClickListener(new View.OnClickListener() { // Sets the OnClickListener() to the button created
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class); // Intent located here to go there
                startActivity(i);
            }
        }); // Close the parenthesis from the listener above, and the statement with a semi-colon
    }

    public void loadXMLClick(View view) {
        Intent i = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(i);
    }

    public void loadSite(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.google.ca"));
        startActivity(i);
    }
}