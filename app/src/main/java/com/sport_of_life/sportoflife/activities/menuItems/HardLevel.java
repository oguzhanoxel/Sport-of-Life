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
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewDokuz;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewDort;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewIki;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewOn;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewOnBir;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewOnIki;
import com.sport_of_life.sportoflife.activities.listview.buttonlist.ListViewUc;

public class HardLevel extends Fragment {

    Button btnHardOmuz;
    Button btnHardSirt;
    Button btnHardGogus;
    Button btnHardOnArkaKol;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hard_level, container, false);

        btnHardOmuz = (Button) view.findViewById(R.id.hardOmuz);
        btnHardSirt = (Button) view.findViewById(R.id.hardSirt);
        btnHardGogus = (Button) view.findViewById(R.id.hardGogus);
        btnHardOnArkaKol = (Button) view.findViewById(R.id.hardOnarkakol);

        btnHardOmuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(getActivity(),ListViewDokuz.class);
                startActivity(intent9);
            }
        });
        btnHardSirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(getActivity(),ListViewOn.class);
                startActivity(intent10);
            }
        });
        btnHardGogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(getActivity(),ListViewOnBir.class);
                startActivity(intent11);
            }
        });
        btnHardOnArkaKol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(getActivity(),ListViewOnIki.class);
                startActivity(intent12);
            }
        });
        return view;
    }

}
