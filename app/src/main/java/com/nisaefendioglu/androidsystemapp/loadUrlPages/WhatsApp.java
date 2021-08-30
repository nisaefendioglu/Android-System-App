package com.nisaefendioglu.androidsystemapp.loadUrlPages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.nisaefendioglu.androidsystemapp.R;

public class WhatsApp extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.internet, container, false);
        WebView webView = view.findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();

        webView.loadUrl("https://web.whatsapp.com/");
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        return view;
    }
}
