package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainActivity extends AppCompatActivity {


    public void logIn(View view){
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Username", usernameEditText.getText().toString());
        String uName = usernameEditText.getText().toString();
        String pass =  passwordEditText.getText().toString();
        try {
            Class.forName("com.mysql.jdbc.driver");
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB","root","Mysql@1928");
            if(cn!=null){
                Log.i("Username", "Connected....");
            }else {
                Log.i("Try Again", "Try Again....");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
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