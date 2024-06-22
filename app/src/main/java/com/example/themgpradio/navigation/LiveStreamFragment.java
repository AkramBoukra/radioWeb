package com.example.themgpradio.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import static com.example.themgpradio.R.layout.fragment_live_stream;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiveStreamFragment extends Fragment {


    public LiveStreamFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        return inflater.inflate(fragment_live_stream, container, false);




    }

    }
