package com.example.themgpradio.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.themgpradio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PodcastFragment extends Fragment {
    WebView webView;


    public PodcastFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_podcast, container, false);

        webView = v.findViewById(R.id.podcast);

        webView.loadUrl("https://themgpradio.com/podcast/");

        // Enable Javascript
        WebSettings webSettings =  webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());

        return v;
    }



}