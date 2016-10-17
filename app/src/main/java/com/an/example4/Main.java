package com.an.example4;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test 2 github

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // in case to make this block of code work, you have to make changes in AndroidManifest for Main Activity attributes
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) { // Checks the orientation of the screen if it's landscape

            startActivity(new Intent(Main.this, B.class)); // starts B activity

            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        }
    }


}
