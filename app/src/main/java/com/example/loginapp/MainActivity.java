package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Username", usernameEditText.getText().toString());
        String uName = usernameEditText.getText().toString();
        String pass =  passwordEditText.getText().toString();
        Log.i("Password", passwordEditText.getText().toString());
        if(uName .equals("Sibu") && pass.equals("Test")){
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this,usernameEditText.getText().toString() , Toast.LENGTH_SHORT).show();
        Toast.makeText(this,passwordEditText.getText().toString() , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}