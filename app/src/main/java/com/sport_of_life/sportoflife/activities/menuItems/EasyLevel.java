package com.sport_of_life.sportoflife.activities.menuItems;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewBir;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewDort;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewIki;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewUc;


public class EasyLevel extends Fragment {

    Button btnEasyOmuz;
    Button btnEasySirt;
    Button btnEasyGogus;
    Button btnEasyOnArkaKol;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_easy_level, container, false);
        btnEasyGogus = (Button) view.findViewById(R.id.easyGogus);
        btnEasyOmuz = (Button) view.findViewById(R.id.easyOmuz);
        btnEasySirt = (Button) view.findViewById(R.id.easySirt);
        btnEasyOnArkaKol = (Button) view.findViewById(R.id.easyOnarkakol);

        btnEasyGogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(),ListViewBir.class);
                startActivity(intent1);
            }
        });
        btnEasyOmuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(),ListViewIki.class);
                startActivity(intent2);
            }
        });
        btnEasySirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity(),ListViewUc.class);
                startActivity(intent3);
            }
        });
        btnEasyOnArkaKol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity(),ListViewDort.class);
                startActivity(intent4);
            }
        });
        return view;
    }
}


