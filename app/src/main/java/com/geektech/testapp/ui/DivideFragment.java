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
import com.geektech.testapp.databinding.FragmentDivideBinding;


public class DivideFragment extends Fragment {

    private FragmentDivideBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDivideBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initClickers();

    }

    private void initClickers() {
        binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String a = binding.dvNum1.getText().toString();
                String b = binding.dvNum2.getText().toString();
                String result = math.divide(a, b);
                binding.dvResult.setText(result);
            }
        });
    }
}