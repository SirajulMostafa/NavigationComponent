package com.mostafa.navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private  NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        NavHostFragment navHostFragment =
//                (NavHostFragment) supportFragmentManager.findFragmentById(R.id.nav_host_fragment);
//        NavController navController = navHostFragment.getNavController();

//        navController = Navigation.findNavController(this,R.id.);
//        NavigationUI.setupActionBarWithNavController(this,navController);
        NavHostFragment navHostFragment = (NavHostFragment)  getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
       // NavController navController = navHostFragment.getNavController();
        navController = navHostFragment.getNavController();
        NavigationUI.setupActionBarWithNavController(this,navController);


    }
    //for back button navigation
    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }
}