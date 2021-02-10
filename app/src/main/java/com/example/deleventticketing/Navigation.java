package com.example.deleventticketing;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.navigation_dashboard:
                    fragment = new DashboardFragment();
                    break;

                case R.id.navigation_akun:
                    fragment = new AkunFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
            return true;
        }


    };
    public void card1(View view){
        Intent intent = new Intent(getApplicationContext(),Detail1.class);
        startActivity(intent);
    }
    public void card2(View view){
        Intent intent = new Intent(getApplicationContext(),Detail2.class);
        startActivity(intent);
    }
    public void card3(View view){
        Intent intent = new Intent(getApplicationContext(),Detail3.class);
        startActivity(intent);
    }
    public void card4(View view){
        Intent intent = new Intent(getApplicationContext(),Detail4.class);
        startActivity(intent);
    }
    public void card11(View view){
        Intent intent = new Intent(getApplicationContext(),Detail11.class);
        startActivity(intent);
    }
    public void card22(View view){
        Intent intent = new Intent(getApplicationContext(),Detail22.class);
        startActivity(intent);
    }
    public void card33(View view){
        Intent intent = new Intent(getApplicationContext(),Detail33.class);
        startActivity(intent);
    }
    public void card44(View view){
        Intent intent = new Intent(getApplicationContext(),Detail44.class);
        startActivity(intent);
    }

    public void Message(View view){
        Intent intent = new Intent(getApplicationContext(),Home.class);
        startActivity(intent);
    }

}
