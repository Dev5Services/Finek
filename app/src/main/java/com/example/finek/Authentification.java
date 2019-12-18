package com.example.finek;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class Authentification extends AppCompatActivity {
    //TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_authentification);
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,Register.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}
/*
        Toast.makeText(getApplicationContext(), "Authentification", Toast.LENGTH_LONG).show();


        textView1 = findViewById(R.id.inscription);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });

    }
}*/