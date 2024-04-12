package com.example.fragment_tuan11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragment_tuan11.databinding.FragmentCancelBinding;
import com.example.fragment_tuan11.databinding.FragmentNeworderBinding;

public class CancelFragment extends Fragment {
    FragmentCancelBinding binding;

    public CancelFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCancelBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
