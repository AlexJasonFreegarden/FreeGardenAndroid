package com.henallux.freegarden.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.henallux.freegarden.R;

public class MainActivity extends AppCompatActivity
{
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newAccount(View v)
    {
        Intent explicitIntent = new Intent(this, TestActivity.class);
        final Intent msg = explicitIntent.putExtra("msg", "Données trop classes");
        startActivityForResult(explicitIntent, 1);
    }
}
