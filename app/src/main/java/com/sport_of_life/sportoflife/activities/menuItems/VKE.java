package com.sport_of_life.sportoflife.activities.menuItems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewA;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewB;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewC;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewD;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewE;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewF;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewG;
import com.sport_of_life.sportoflife.activities.listview.programlist.ListViewH;

public class VKE extends Fragment {
    EditText height;
    EditText weight;
    Button calcVKE;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vke, container, false);
        height = (EditText) view.findViewById(R.id.height);
        weight = (EditText) view.findViewById(R.id.weight);
        calcVKE = (Button) view.findViewById(R.id.calcBtn);
        calcVKE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            calculateBMI(v);
            }
        });
        return view;
    }

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float vke = weightValue / (heightValue * heightValue);

            displayVKE(vke);
        }
    }

    private void displayVKE(float vke) {
        String vkeLabel = "";

        if (Float.compare(vke, 15f) <= 0) {
            //vkeLabel = getString(R.string.tehlikeliZayif);
            Intent intentA = new Intent(getActivity(), ListViewA.class);
            startActivity(intentA);
        } else if (Float.compare(vke, 15f) > 0  &&  Float.compare(vke, 16f) <= 0) {
            //vkeLabel = getString(R.string.yuksekZayif);
            Intent intentB = new Intent(getActivity(),ListViewB.class);
            startActivity(intentB);
        } else if (Float.compare(vke, 16f) > 0  &&  Float.compare(vke, 18.5f) <= 0) {
            //vkeLabel = getString(R.string.oldukcaZayif);
            Intent intentC = new Intent(getActivity(),ListViewC.class);
            startActivity(intentC);
        } else if (Float.compare(vke, 18.5f) > 0  &&  Float.compare(vke, 25f) <= 0) {
            //vkeLabel = getString(R.string.normal);
            Intent intentD = new Intent(getActivity(),ListViewD.class);
            startActivity(intentD);
        } else if (Float.compare(vke, 25f) > 0  &&  Float.compare(vke, 30f) <= 0) {
            //vkeLabel = getString(R.string.kilolu);
            Intent intentE = new Intent(getActivity(),ListViewE.class);
            startActivity(intentE);
        } else if (Float.compare(vke, 30f) > 0  &&  Float.compare(vke, 35f) <= 0) {
            //vkeLabel = getString(R.string.obezite1);
            Intent intentF = new Intent(getActivity(),ListViewF.class);
            startActivity(intentF);
        } else if (Float.compare(vke, 35f) > 0  &&  Float.compare(vke, 40f) <= 0) {
            //vkeLabel = getString(R.string.obezite2);
            Intent intentG = new Intent(getActivity(),ListViewG.class);
            startActivity(intentG);
        } else {
            //vkeLabel = getString(R.string.obezite3);
            Intent intentH = new Intent(getActivity(),ListViewH.class);
            startActivity(intentH);
        }

    }

}
