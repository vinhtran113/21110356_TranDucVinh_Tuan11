package com.example.fragment_tuan11;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragment_tuan11.databinding.FragmentDanhgiaBinding;

public class DanhGiaFragment extends Fragment {
    FragmentDanhgiaBinding binding;

    public DanhGiaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDanhgiaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
