package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText txt= findViewById(R.id.input);
        TextView prnt= findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t;
                if(txt.getText().toString().length()==0)
                    t="0";
                else
                    t= txt.getText().toString();

                float d=Float.parseFloat(t);
                double ans = 2.20462 *d;
                prnt.setText("The Corresponding Value in Pound is: "+ans);
            }
        });
    }
}