package com.example.thelargest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1,et2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= findViewById(R.id.TextView);
        et1 = findViewById(R.id.editTextNumber2);
        et2 = findViewById(R.id.editTextNumber3);
        b1 = findViewById(R.id.button);
        tv1.setText("");
        b1.setOnClickListener(view ->{
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());
            if(n1>n2)
                tv1.setText(String.valueOf(n1));
            else
                tv1.setText(String.valueOf(n2));
        });
    }
}