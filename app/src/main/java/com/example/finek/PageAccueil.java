package com.example.finek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class PageAccueil extends AppCompatActivity {

        private static int TIME_OUT = 4000; //Time to launch the another activity
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_page_accueil);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(getApplicationContext(), Authentification.class);
                    startActivity(i);
                    finish();
                }
            }, TIME_OUT);
        }

}