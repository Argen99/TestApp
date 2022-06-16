package com.geektech.testapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.testapp.Math;
import com.geektech.testapp.R;
import com.geektech.testapp.databinding.FragmentAddBinding;


public class AddFragment extends Fragment {

    private FragmentAddBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initClickers();
    }
    private void initClickers() {
        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String a = binding.num1.getText().toString();
                String b = binding.num2.getText().toString();
                String result = math.add(a, b);
                binding.result.setText(result);
            }
        });
    }
}