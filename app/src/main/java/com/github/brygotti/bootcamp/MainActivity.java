package com.github.brygotti.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessageCallback(View view) {
        Intent launchGreeting = new Intent(this, GreetingActivity.class);
        String name = ((EditText) findViewById(R.id.yourName)).getText().toString();
        launchGreeting.putExtra("name", name); //Optional parameters
        startActivity(launchGreeting);
    }
}