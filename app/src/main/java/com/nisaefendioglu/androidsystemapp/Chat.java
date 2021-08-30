package com.nisaefendioglu.androidsystemapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class Chat extends Fragment {
    View view;
    ListView chatList;
    final ArrayList<ChatList> chatListArrayList = new ArrayList<>();

    public static Fragment create() {
        return new Chat();    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.chatlist, container, false);

        chatList = view.findViewById(R.id.chatList);
        chatListArrayList.add(new ChatList("Nisa","Hello!!",R.drawable.user));
        chatListArrayList.add(new ChatList("Mehmet","How are you?",R.drawable.user));
        chatListArrayList.add(new ChatList("Halise","Ok.",R.drawable.user));
        chatListArrayList.add(new ChatList("Hülya","Call me",R.drawable.user));
        chatListArrayList.add(new ChatList("Ahmet","Fine",R.drawable.user));
        chatListArrayList.add(new ChatList("Çağla","hahah",R.drawable.user));
        chatListArrayList.add(new ChatList("Pelin","Yeah",R.drawable.user));
        chatListArrayList.add(new ChatList("Murat","I dont know",R.drawable.user));
        chatListArrayList.add(new ChatList("Aslı","See you later",R.drawable.user));


        ChatAdapter chatAdapter = new ChatAdapter(getActivity(), chatListArrayList);
        if (chatList != null) {
            chatList.setAdapter(chatAdapter);
        }

        return view;


    }


}
