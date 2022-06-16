package com.geektech.testapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.geektech.testapp.databinding.ActivityMainBinding;
import com.geektech.testapp.ui.AddFragment;
import com.geektech.testapp.ui.DivideFragment;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


}