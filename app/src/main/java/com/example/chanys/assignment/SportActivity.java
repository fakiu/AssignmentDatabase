package com.example.chanys.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SportActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE2 = "com.example.chanys.assignment.MESSAGE2";
    TextView textView;
    private Integer SelectedSport;
    private Integer WhichCourt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        textView = findViewById(R.id.SportTextView);

        Intent intent = getIntent(); //Who called me?
        if(intent.hasExtra(com.example.chanys.assignment.MenuActivity.TAG_MESSAGE)) {
            SelectedSport = Integer.parseInt(intent.getStringExtra(com.example.chanys.assignment.MenuActivity.TAG_MESSAGE));
        }
    }

    @Override
    protected void onResume(){
        super.onResume();

        if (SelectedSport == 1){
            textView.setText("Badminton");
        }
        else if (SelectedSport == 2) {
            textView.setText("Squash");
        }
        else if (SelectedSport == 3) {
            textView.setText("Ping Pong");
        }
        else {
            textView.setText("Tennis");
        }
    }

    public void SelectCourtNumber1(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        WhichCourt = 1 + SelectedSport * 10;
        intent.putExtra(TAG_MESSAGE2, Integer.toString(WhichCourt));
        startActivity(intent);
    }

    public void SelectCourtNumber2(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        WhichCourt = 2 + SelectedSport * 10;
        intent.putExtra(TAG_MESSAGE2, Integer.toString(WhichCourt));
        startActivity(intent);
    }

    public void SelectCourtNumber3(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        WhichCourt = 3 + SelectedSport * 10;
        intent.putExtra(TAG_MESSAGE2, Integer.toString(WhichCourt));
        startActivity(intent);
    }
}
