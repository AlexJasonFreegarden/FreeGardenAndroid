package com.henallux.freegarden.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.henallux.freegarden.R;


public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }

    public void signUp(View v)
    {
        Intent explicitIntent = new Intent(this, NewUserGoalActivity.class);
        startActivity(explicitIntent);
    }
}
