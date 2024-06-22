package com.example.themgpradio.navigation;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.themgpradio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebRadioFragment extends Fragment {
    private MediaPlayer nMediaPlayer;
    private ImageView nPlayIcon;
    public WebRadioFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmenté

        View v = inflater.inflate(R.layout.fragment_web_radio, container, false);



        nPlayIcon = v.findViewById(R.id.playIcon);
        nMediaPlayer = MediaPlayer.create(getContext(),R.raw.homestudio);

        nPlayIcon.setOnClickListener(v1 -> {
            if (!nMediaPlayer.isPlaying()) {
                nMediaPlayer.start();
                nPlayIcon.setImageResource(R.mipmap.pause);
            } else {
                nMediaPlayer.pause();
                nPlayIcon.setImageResource(R.mipmap.play);
            }

        });
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        nMediaPlayer.pause();
    }
}

