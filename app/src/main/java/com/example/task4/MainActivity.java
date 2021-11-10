package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();

        displayToast("onRestart called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayToast("onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        displayToast("onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        displayToast("onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        displayToast("onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        displayToast("onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        displayToast("onDestroy called");
    }

    private void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}