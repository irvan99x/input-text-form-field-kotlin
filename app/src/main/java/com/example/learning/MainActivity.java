package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String Iname, Iaddress, Ibirthday, Imajor, IfromSchool;
    EditText Inputname, Inputaddress, Inputbirthday, Inputmajor, Inputfromschool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputname = (EditText)findViewById(R.id.name);
        Inputaddress = (EditText)findViewById(R.id.address);
        Inputbirthday = (EditText)findViewById(R.id.birthday);
        Inputmajor = (EditText)findViewById(R.id.major);
        Inputfromschool = (EditText)findViewById(R.id.fromSchool);

        Button submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(v -> {
            Iname = Inputname.getText().toString();
            Iaddress = Inputaddress.getText().toString();
            Ibirthday = Inputbirthday.getText().toString();
            Imajor = Inputmajor.getText().toString();
            IfromSchool = Inputfromschool.getText().toString();
            Intent i;
            i = new Intent(MainActivity.this, ShowActivity.class);
            Bundle b = new Bundle();
            b.putString("parse_name",Iname);
            b.putString("parse_address",Iaddress);
            b.putString("parse_birthday",Ibirthday);
            b.putString("parse_major",Imajor);
            b.putString("parse_formSchool",IfromSchool);
            i.putExtras(b);
            startActivity(i);
        });
    }
}