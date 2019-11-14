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

public class ListViewF extends AppCompatActivity {
    private android.widget.ListView lvProgram;
    private Adapter adapter;
    private List<Program> mProgramList;
    private EditText textResultF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvProgram = (android.widget.ListView)findViewById(R.id.listview_program);
        textResultF = (EditText) findViewById(R.id.result);
        textResultF.setText(R.string.obezite1);

        mProgramList = new ArrayList<>();
        mProgramList.add(new Program(1, "Sevgili Spor Sever", "Kütle Endeksi Sonucunuz:(Kilolu) Aşağıdaki Program Size Uygun Olarak Hazırlanmıştır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(2, "Full Vücut Çalışması", "Bu Programda Sırasıyla Bütün Vücudu Çalıştıracak Hareketler Esas Alınmıştır", "Haydi Başlayalım!"));
        mProgramList.add(new Program(3, "Isınma", "Koşu Bandı", "20 Dk Koşu Hızlı"));
        mProgramList.add(new Program(4, "Isınma", "Bisiklet", "20 Dk Normal Tempo"));
        mProgramList.add(new Program(5, "Isınma", "Merdiven Climb", "20 Dk Merdiven Aletiyle Orta Tempo"));
        mProgramList.add(new Program(6, "Göğüs Decline Press", "Ağırlıksız olarak Sehpaya geçiyoruz", "2x10 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(7, "Dumbell Biceps", "5 er kilo dumbell ile ön kol çalışması", "2x10 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(8, "Dumbell Triceps", "5 er kilo dumbell ile arka kol çalışması", "2x15 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(9, "Machine Fly", "Fly Center", "2x10 1x15"));
        mProgramList.add(new Program(10,"Dips", "Dips Center", "2x10"));
        mProgramList.add(new Program(11,"Çıkış Isınması", "Koşu Bandı", "10 Dk Koşu Hızlı"));
        mProgramList.add(new Program(12,"Çıkış Isınması", "Bisiklet", "10 Dk Normal Tempo"));

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
