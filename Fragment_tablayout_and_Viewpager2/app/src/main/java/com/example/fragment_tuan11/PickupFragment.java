package com.example.fragment_tuan11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragment_tuan11.databinding.FragmentDeliveryBinding;
import com.example.fragment_tuan11.databinding.FragmentPickupBinding;

public class PickupFragment extends Fragment {
    FragmentPickupBinding binding;

    public PickupFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPickupBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
