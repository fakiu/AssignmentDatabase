package com.example.chanys.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BookingActivity extends AppCompatActivity {

    TextView CourttextView;
    TextView TelephonetextView;
    TextView AddresstextView;
    private Integer SelectedSport = 0;
    private Integer WhichCourt = 0;
    private Integer Combine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Intent intent = getIntent(); //Who called me?
        if(intent.hasExtra(com.example.chanys.assignment.SportActivity.TAG_MESSAGE2)) {
            Combine = Integer.parseInt(intent.getStringExtra(com.example.chanys.assignment.SportActivity.TAG_MESSAGE2));
        }

        int temp;
        while (true){
            temp = Combine / 10;
            SelectedSport++;
            if (temp < 10){
                break;
            }
        }
        WhichCourt = temp;

        CourttextView = findViewById(R.id.courtTextView);
        TelephonetextView = findViewById(R.id.telephoneTextView);
        AddresstextView = findViewById(R.id.addressTextView);
    }

    @Override
    protected void onResume(){
        super.onResume();

        if (SelectedSport == 1){ //Badminton
            if (WhichCourt == 1) { //Court 1
                CourttextView.setText("Court number 1 for badminton");
                TelephonetextView.setText("Court 1 telephone");
                AddresstextView.setText("Court 1 address");
            }
            else if (WhichCourt == 2) { //Court 2
                CourttextView.setText("Court number 2 for badminton");
                TelephonetextView.setText("Court 2 telephone");
                AddresstextView.setText("Court 2 address");
            }
            else { //Court 3
                CourttextView.setText("Court number 3 for badminton");
                TelephonetextView.setText("Court 3 telephone");
                AddresstextView.setText("Court 3 address");
            }
        }
        else if (SelectedSport == 2) { //Squash
            if (WhichCourt == 1) { //Court 1
                CourttextView.setText("Court number 1 for Squash");
                TelephonetextView.setText("Court 1 telephone");
                AddresstextView.setText("Court 1 address");
            }
            else if (WhichCourt == 2) { //Court 2
                CourttextView.setText("Court number 2 for Squash");
                TelephonetextView.setText("Court 2 telephone");
                AddresstextView.setText("Court 2 address");
            }
            else { //Court 3
                CourttextView.setText("Court number 3 for Squash");
                TelephonetextView.setText("Court 3 telephone");
                AddresstextView.setText("Court 3 address");
            }
        }
        else if (SelectedSport == 3) { //Ping Pong
            if (WhichCourt == 1) { //Court 1
                CourttextView.setText("Court number 1 for Ping Pong");
                TelephonetextView.setText("Court 1 telephone");
                AddresstextView.setText("Court 1 address");
            }
            else if (WhichCourt == 2) { //Court 2
                CourttextView.setText("Court number 2 for Ping Pong");
                TelephonetextView.setText("Court 2 telephone");
                AddresstextView.setText("Court 2 address");
            }
            else { //Court 3
                CourttextView.setText("Court number 3 for Ping Pong");
                TelephonetextView.setText("Court 3 telephone");
                AddresstextView.setText("Court 3 address");
            }
        }
        else { //Tennis
            if (WhichCourt == 1) { //Court 1
                CourttextView.setText("Court number 1 for Tennis");
                TelephonetextView.setText("Court 1 telephone");
                AddresstextView.setText("Court 1 address");
            }
            else if (WhichCourt == 2) { //Court 2
                CourttextView.setText("Court number 2 for Tennis");
                TelephonetextView.setText("Court 2 telephone");
                AddresstextView.setText("Court 2 address");
            }
            else { //Court 3
                CourttextView.setText("Court number 3 for Tennis");
                TelephonetextView.setText("Court 3 telephone");
                AddresstextView.setText("Court 3 address");
            }
        }
    }

    public void SelectedBook(View view) {
        Intent intent = new Intent(this, BookingConfirmationActivity.class);
        startActivity(intent);
    }
}
