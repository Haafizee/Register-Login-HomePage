package com.perdatech.register_login_homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView tname, tcategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        tname = findViewById(R.id.name);
        tcategory = findViewById(R.id.category);
        String name = getIntent().getStringExtra("name");
        String category = getIntent().getStringExtra("category");
        tname.setText(name);
        tcategory.setText(category);


    }
}