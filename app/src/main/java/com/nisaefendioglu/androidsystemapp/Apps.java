package com.nisaefendioglu.androidsystemapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


public class Apps extends Fragment {

    View view;
    ImageButton call,internet,messages,music,gallery,youtube,snapchat,facebook,instagram,twitter,whatsapp,settings,maps,camera,github,linkedin,mail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.apps, container, false);

        internet = view.findViewById(R.id.internet);
        call = view.findViewById(R.id.call);
        messages = view.findViewById(R.id.messages);
        music = view.findViewById(R.id.music);
        gallery = view.findViewById(R.id.gallery);
        youtube = view.findViewById(R.id.youtube);
        snapchat = view.findViewById(R.id.snapchat);
        facebook = view.findViewById(R.id.facebook);
        instagram = view.findViewById(R.id.instagram);
        twitter = view.findViewById(R.id.twitter);
        whatsapp = view.findViewById(R.id.whatsapp);
        settings = view.findViewById(R.id.settings);
        maps = view.findViewById(R.id.maps);
        camera = view.findViewById(R.id.camera);
        github = view.findViewById(R.id.github);
        linkedin = view.findViewById(R.id.linkedin);
        mail = view.findViewById(R.id.mail);
        return view;
    }
}
