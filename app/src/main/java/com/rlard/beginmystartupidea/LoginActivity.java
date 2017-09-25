package com.rlard.beginmystartupidea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);


        Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_LONG).show();

        Toast.makeText(LoginActivity.this,"Hello",Toast.LENGTH_LONG).show();
    
    }

}
