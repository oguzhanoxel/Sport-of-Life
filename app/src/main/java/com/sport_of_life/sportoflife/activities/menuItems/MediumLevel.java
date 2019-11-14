package com.sport_of_life.sportoflife.activities.menuItems;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewAlti;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewBes;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewBir;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewDort;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewIki;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewSekiz;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewUc;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewYedi;

public class MediumLevel extends Fragment {

    Button btnMediumOmuz;
    Button btnMediumSirt;
    Button btnMediumGogus;
    Button btnMediumOnArkaKol;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_medium_level, container, false);

        btnMediumOmuz = (Button) view.findViewById(R.id.mediumOmuz);
        btnMediumSirt = (Button) view.findViewById(R.id.mediumSirt);
        btnMediumGogus = (Button) view.findViewById(R.id.mediumGogus);
        btnMediumOnArkaKol = (Button) view.findViewById(R.id.mediumOnarkakol);

        btnMediumOmuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getActivity(),ListViewBes.class);
                startActivity(intent5);
            }
        });
        btnMediumSirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getActivity(),ListViewAlti.class);
                startActivity(intent6);
            }
        });
        btnMediumGogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getActivity(),ListViewYedi.class);
                startActivity(intent7);
            }
        });
        btnMediumOnArkaKol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(getActivity(),ListViewSekiz.class);
                startActivity(intent8);
            }
        });

        return view;
    }

}
