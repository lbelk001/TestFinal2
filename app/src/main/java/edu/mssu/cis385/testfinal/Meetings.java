package edu.mssu.cis385.testfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Meetings extends AppCompatActivity {
    private ArrayList<String> meetings;
    private ArrayAdapter<String> meetingAdapter;
    private ListView meetingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetings);

        meetingsList = (ListView)findViewById(R.id.meetingsList);
        meetings = new ArrayList<String>();
        meetingAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meetings);
        meetingsList.setAdapter(meetingAdapter);

    }

    public void onAddMeeting(View view) {
        EditText etNewMeeting = (EditText) findViewById(R.id.etNewMeeting);
        String meetingText = etNewMeeting.getText().toString();
        meetingAdapter.add(meetingText);
        etNewMeeting.setText("");
    }
}