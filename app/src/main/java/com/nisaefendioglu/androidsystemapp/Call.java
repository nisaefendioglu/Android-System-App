package com.nisaefendioglu.androidsystemapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class Call extends Fragment {
    View view;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    TextView textView;
    ImageButton call;
    static int PERMISSION_CODE= 100;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.call, container, false);
        define();
        return view;


    }

    void define () {
        one = view.findViewById(R.id.one);
        two = view.findViewById(R.id.two);
        three = view.findViewById(R.id.three);
        four = view.findViewById(R.id.four);
        five = view.findViewById(R.id.five);
        six = view.findViewById(R.id.six);
        seven = view.findViewById(R.id.seven);
        eight = view.findViewById(R.id.eight);
        nine = view.findViewById(R.id.nine);
        zero = view.findViewById(R.id.zero);
        call = view.findViewById(R.id.call);

        textView = view.findViewById(R.id.textView);

        one.setOnClickListener(v -> textView.setText(textView.getText() + "1"));
        two.setOnClickListener(v -> textView.setText(textView.getText() + "2"));
        three.setOnClickListener(v -> textView.setText(textView.getText() + "3"));
        four.setOnClickListener(v -> textView.setText(textView.getText() + "4"));
        five.setOnClickListener(v -> textView.setText(textView.getText() + "5"));
        six.setOnClickListener(v -> textView.setText(textView.getText() + "6"));
        seven.setOnClickListener(v -> textView.setText(textView.getText() + "7"));
        eight.setOnClickListener(v -> textView.setText(textView.getText() + "8"));
        nine.setOnClickListener(v -> textView.setText(textView.getText() + "9"));
        zero.setOnClickListener(v -> textView.setText(textView.getText() + "0"));

        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CALL_PHONE},PERMISSION_CODE);

        }

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + textView.getText().toString()));
                startActivity(intent);
            }
        });


    }

}
