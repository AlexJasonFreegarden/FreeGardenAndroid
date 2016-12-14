package com.henallux.freegarden.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.henallux.freegarden.R;

public class NewUserGoalActivity extends AppCompatActivity {

    @Override
    protected void    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_goal);
    }

    public void findGardenNewGoal(View v) {
        Intent explicitIntent = new Intent(this, NewAccountActivity.class);
        final Intent msg = explicitIntent.putExtra("msg", "Données trop classes");
        startActivityForResult(explicitIntent, 1);
    }

    public void registerNewGarden(View v)
    {
        Intent explicitIntent = new Intent(this, GardenRegisterActivity.class);
        startActivity(explicitIntent);
    }
}
