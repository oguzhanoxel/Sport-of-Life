package com.sport_of_life.sportoflife.activities.listview.programlist;

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

public class ListViewB extends AppCompatActivity {
    private android.widget.ListView lvProgram;
    private Adapter adapter;
    private List<Program> mProgramList;
    private EditText textResultB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvProgram = (android.widget.ListView)findViewById(R.id.listview_program);
        textResultB = (EditText) findViewById(R.id.result);
        textResultB.setText(R.string.yuksekZayif);

        mProgramList = new ArrayList<>();
        mProgramList.add(new Program(1, "Sevgili Spor Sever", "Kütle Endeksi Sonucunuz:(Aşırı Zayıflık) Göre Aşağıdaki Program Size Uygun Olarak Hazırlanmıştır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(2, "Full Vücut Çalışması", "Bu Programda Sırasıyla Bütün Vücudu Çalıştıracak Hareketler Esas Alınmıştır", "Haydi Başlayalım!"));
        mProgramList.add(new Program(3, "Isınma", "Koşu Bandı", "10 Dk Yavaş Tempo"));
        mProgramList.add(new Program(4, "Seated flex", "Yatar Sehpa'da oturup ellerimizi havaya kaldırıyor ve indiriyoruz", "1x15 1x10 Toplam 2 Set"));
        mProgramList.add(new Program(5, "Dumbell Biceps", "5 er kilo dumbell ile ön kol çalışması", "2x10 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(6, "Dumbell Triceps", "5 er kilo dumbell ile arka kol çalışması", "2x15 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(7, "Row Machine", "10 kilo ağırlık ile Row Makinesine geçiyoruz", "2x15 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(8, "Seated Leg Extention", "10 kilo ağırlık ile bacak çalışması için alete geçiyoruz", "2x10 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(9, "Dips", "Dips Center", "2x15 Toplam 2 Set"));
        mProgramList.add(new Program(10,"Çıkış Koşusu", "Koşu Bandı", "15 Dk Yavaş Tempo"));

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
