package com.nisaefendioglu.androidsystemapp;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Facebook;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Github;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Instagram;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Linkedin;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Mail;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Maps;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Snapchat;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Spotify;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Twitter;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.WhatsApp;
import com.nisaefendioglu.androidsystemapp.loadUrlPages.Youtube;


public class Apps extends Fragment {
    Fragment fragment = null;
    View view;
    ImageButton call,internet,messages,music,gallery,youtube,snapchat,facebook,instagram,twitter,whatsapp,settings,maps,camera,github,linkedin,mail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.apps, container, false);
        define();
        actions();
        return view;
    }

    void define() {
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
    }

    void actions(){

        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Internet();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Call();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Chat();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Spotify();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Youtube();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        snapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Snapchat();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Facebook();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Instagram();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Twitter();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new WhatsApp();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Maps();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Github();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Linkedin();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new Mail();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                fragment = new Camera();
                FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();

            }
        });
    }
}
