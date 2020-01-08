package com.example.androidfundamentals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R stands for resources, case sensitive
        // id means looking for a certain id, in this case button3) in resources
        Button myJavaButton = findViewById(R.id.button3);
        myJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Remember to alt+enter when prompt comes up to import relevant stuff
                Toast.makeText(getApplicationContext(),
                        "yeet", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
