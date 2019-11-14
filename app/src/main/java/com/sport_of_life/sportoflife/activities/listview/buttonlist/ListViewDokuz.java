package com.sport_of_life.sportoflife.activities.listview.buttonlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.listview.Adapter;
import com.sport_of_life.sportoflife.activities.listview.Program;

import java.util.ArrayList;
import java.util.List;

public class ListViewDokuz extends AppCompatActivity {
    private android.widget.ListView lvProgram;
    private Adapter adapter;
    private List<Program> mProgramList;
    private EditText textResultA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvProgram = (android.widget.ListView)findViewById(R.id.listview_program);
        textResultA = (EditText) findViewById(R.id.result);
        textResultA.setVisibility(View.INVISIBLE);

        mProgramList = new ArrayList<>();
        mProgramList.add(new Program(1, "Sevgili Spor Sever", "Aşağıdaki Program Size Zor Seviye Omuz Çalışmasını Uygun Olarak Sunmaktadır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(2, "Isınma", "Koşu Bandı", "15 Dk Hızlı Tempo"));
        mProgramList.add(new Program(3, "Machine Shoulder Press", "Press Makinası", "2x20 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(4, "Dumbell Front Raise", "5x2 10x2 Dumbell", "2x20 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(5, "Dumbell Side Lateral Raise", "5x2 10x2 Dumbell", "2x20 1x13 Toplam 3 Set"));
        mProgramList.add(new Program(6, "Dumbell Shrughs", "10x2 Dumbell", "2x20 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(7, "Barbell Upright-row", "Long Barbell", "2x20 1x25 Toplam 3 Set"));
        mProgramList.add(new Program(8,"Çıkış Isınması", "Koşu Bandı", "15 Dk Hızlı Tempo"));

        adapter = new Adapter(getApplicationContext(), mProgramList);
        lvProgram.setAdapter(adapter);

        lvProgram.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Hareket sırası =" + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
