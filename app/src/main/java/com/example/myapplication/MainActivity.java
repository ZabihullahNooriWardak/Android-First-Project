package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disabled(View v){

        EditText input = findViewById(R.id.userInput);
      TextView txtView = findViewById(R.id.textView2);
      txtView.setText("Your Name is  : "+input.getText()+"😂😅");

        Toast.makeText(this, "This is a toast message", Toast.LENGTH_SHORT).show();


//        View button = findViewById(R.id.button2);
//        Button b = (Button) button;
//        b.setText("new disable");
       /* v.setEnabled(false);
        Button b= (Button) v;
        b.setText("disabled");*/
    }
}