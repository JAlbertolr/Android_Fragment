package com.example.interfaces1;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void boton7(View view){
        NavController navController= Navigation.findNavController(this,R.id.fragmentContainerView2);
        navController.navigate(R.id.FirstFragment);
    }
    public void boton8(View view){
        NavController navController= Navigation.findNavController(this,R.id.fragmentContainerView2);
        navController.navigate(R.id.SecondFragment);
    }
}