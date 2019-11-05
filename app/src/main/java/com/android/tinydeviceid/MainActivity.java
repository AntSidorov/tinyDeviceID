package com.android.tinydeviceid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity{

    TextView DeviceID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String ANDROID_ID = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        DeviceID = (TextView) findViewById(R.id.DeviceID);
        DeviceID.setText(ANDROID_ID);
    }
}