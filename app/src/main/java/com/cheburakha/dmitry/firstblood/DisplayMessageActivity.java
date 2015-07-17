package com.cheburakha.dmitry.firstblood;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message and its scale from the intent
        Intent intent = getIntent();

        //declaring strings using the equation with getStringExtra methods
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);   //for message itself
        String scale = intent.getStringExtra(MyActivity.EXTRA_SCALE);       //for its scale

        // Create the text view
        TextView textView = new TextView(this);         //calling for constructor
        textView.setTextSize(Integer.parseInt(scale));  //extracting message's font size in int from string "scale"
        textView.setText(message);                      //setting "message" string as a text for textView

        // Set the text view as the activity layout
        setContentView(textView);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // If your minSdkVersion is 11 or higher, instead use:
        // getActionBar().setDisplayHomeAsUpEnabled(true);
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
}
