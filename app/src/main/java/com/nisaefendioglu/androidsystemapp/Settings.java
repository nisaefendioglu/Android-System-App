package com.nisaefendioglu.androidsystemapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Settings extends Fragment {
    View view;
    LinearLayout line1,line2,line3,line4,line5,line6,line7,line8,line9;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.settings, container, false);
        define();
        return view;
    }

    void define(){
        line1 = view.findViewById(R.id.line1);
        line2 = view.findViewById(R.id.line2);
        line3 = view.findViewById(R.id.line3);
        line4 = view.findViewById(R.id.line4);
        line5 = view.findViewById(R.id.line5);
        line6 = view.findViewById(R.id.line6);
        line7 = view.findViewById(R.id.line7);
        line8 = view.findViewById(R.id.line8);
        line9 = view.findViewById(R.id.line9);

    }
}
