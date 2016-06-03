package edu.ucsb.cs.cs185.project.cookey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by harshitha on 6/1/16.
 */
public class SettingsPage extends AppCompatActivity {


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_settings);

    }
}
