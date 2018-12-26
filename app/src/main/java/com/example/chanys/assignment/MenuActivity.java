package com.example.chanys.assignment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE = "com.example.chanys.assignment.MESSAGE1";
    private Integer SelectedSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent(); //Who called me?
    }

    public void SelectBadminton(View view) {
        Intent intent = new Intent(this, SportActivity.class);
        SelectedSport = 1;
        intent.putExtra(TAG_MESSAGE, Integer.toString(SelectedSport));
        startActivity(intent);
    }

    public void SelectSquash(View view) {
        Intent intent = new Intent(this, SportActivity.class);
        SelectedSport = 2;
        intent.putExtra(TAG_MESSAGE, Integer.toString(SelectedSport));
        startActivity(intent);
    }

    public void SelectPingPong(View view) {
        Intent intent = new Intent(this, SportActivity.class);
        SelectedSport = 3;
        intent.putExtra(TAG_MESSAGE, Integer.toString(SelectedSport));
        startActivity(intent);
    }

    public void SelectTennis(View view) {
        Intent intent = new Intent(this, SportActivity.class);
        SelectedSport = 4;
        intent.putExtra(TAG_MESSAGE, Integer.toString(SelectedSport));
        startActivity(intent);
    }
}
