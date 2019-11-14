package com.sport_of_life.sportoflife.activities.listview.programlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.listview.Adapter;
import com.sport_of_life.sportoflife.activities.listview.Program;

import java.util.ArrayList;
import java.util.List;

public class ListViewG extends AppCompatActivity {
    private android.widget.ListView lvProgram;
    private Adapter adapter;
    private List<Program> mProgramList;
    private EditText textResultG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvProgram = (android.widget.ListView)findViewById(R.id.listview_program);
        textResultG = (EditText) findViewById(R.id.result);
        textResultG.setText(R.string.obezite2);

        mProgramList = new ArrayList<>();
        mProgramList.add(new Program(1, "Sevgili Spor Sever", "Kütle Endeksi Sonucunuz:(Oldukça Kilolu) Aşağıdaki Program Size Uygun Olarak Hazırlanmıştır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(2, "Full Vücut Çalışması", "Bu Programda Sırasıyla Bütün Vücudu Çalıştıracak Hareketler Esas Alınmıştır", "Haydi Başlayalım!"));
        mProgramList.add(new Program(3, "Isınma", "Koşu Bandı", "20 Dk Koşu Hızlı"));
        mProgramList.add(new Program(4, "Isınma", "Bisiklet", "20 Dk Normal Tempo"));
        mProgramList.add(new Program(5, "Isınma", "Merdiven Climb", "20 Dk Merdiven Aletiyle Orta Tempo"));
        mProgramList.add(new Program(6,"Leg Curl", "10 kilo ağırlık ile Curl Makinesine geçiyoruz", "2x15 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(7,"Seated Leg Extention", "10 kilo ağırlık ile bacak çalışması için alete geçiyoruz", "2x10 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(8, "Çıkış Isınması", "Koşu Bandı", "10 Dk Koşu Yavaş"));

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
