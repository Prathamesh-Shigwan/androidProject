package com.example.stree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.stree.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());


        binding.Bottomnavview.setOnItemSelectedListener(item -> {

            switch(item.getItemId()){

                case R.id.Home_menu:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.Item_menu:
                    replaceFragment(new ItemsFragment());
                    break;
                case R.id.user_menu:
                    replaceFragment(new UserFragment());
                    break;
            }

            return true;
        });

    }

    private  void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();


    }

}