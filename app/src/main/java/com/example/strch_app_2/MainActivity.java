package com.example.strch_app_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener()
        {
            @Override
            public void  onNavigationItemReselected(@NonNull MenuItem item)
            {
                switch (item.getItemId()) {
                    case R.id.action_human_body:
                        Toast.makeText(MainActivity.this, "Human Body", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.action_custom_workout:
                        Toast.makeText(MainActivity.this, "Custom Workout", Toast.LENGTH_SHORT).show();
                        setContentView(R.layout.activity_custom_workout);
                        break;
                    case R.id.action_reports:
                        Toast.makeText(MainActivity.this, "Report", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}
