package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView Sname, Saddress, Sbirthday, Smajor, Sfromschool;
    String show_name, show_address, show_birthday, show_major, show_fromSchool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Sname = (TextView)findViewById(R.id.showName);
        Saddress = (TextView)findViewById(R.id.showAddress);
        Sbirthday = (TextView)findViewById(R.id.showBirthday);
        Smajor = (TextView)findViewById(R.id.showMajor);
        Sfromschool = (TextView)findViewById(R.id.showFromSchool);

        Bundle b = getIntent().getExtras();

        show_name = b.getString("parse_name");
        show_address = b.getString("parse_address");
        show_birthday = b.getString("parse_birthday");
        show_major = b.getString("parse_major");
        show_fromSchool = b.getString("parse_formSchool");

        Sname.setText(""+show_name);
        Saddress.setText(""+show_address); ;
        Sbirthday.setText(""+show_birthday);
        Smajor.setText(""+show_major);
        Sfromschool.setText(""+show_fromSchool);

        Button kembali = (Button) findViewById(R.id.back);
        kembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(ShowActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}