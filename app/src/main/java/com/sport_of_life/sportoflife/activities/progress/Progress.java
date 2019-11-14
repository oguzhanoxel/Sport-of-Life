package com.sport_of_life.sportoflife.activities.progress;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.sport_of_life.sportoflife.R;

public class Progress extends Fragment {

    ProgressBar prg;
    Button button3, button4, button5, button6;

    public Progress() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress, container, false);
        prg = (ProgressBar)view.findViewById(R.id.progressBar3);
        button3 = (Button)view.findViewById(R.id.button3);
        button4 = (Button)view.findViewById(R.id.button4);
        button5 = (Button)view.findViewById(R.id.button5);
        button6 = (Button)view.findViewById(R.id.button6);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(25);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(50);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(75);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prg.setProgress(100);
                Toast.makeText(getActivity(), "BAŞARIYLA TAMAMLANDI!", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
