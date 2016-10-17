package com.an.example4;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // in case to make this block of code work, you have to make changes in AndroidManifest for B Activity attributes
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){ // Checks the orientation of the screen if it's portrait
            startActivity(new Intent(B.this, Main.class)); // starts Main activity

            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
