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

public class ListViewE extends AppCompatActivity {
    private android.widget.ListView lvProgram;
    private Adapter adapter;
    private List<Program> mProgramList;
    private EditText textResultE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvProgram = (android.widget.ListView)findViewById(R.id.listview_program);
        textResultE = (EditText) findViewById(R.id.result);
        textResultE.setText(R.string.kilolu);

        mProgramList = new ArrayList<>();
        mProgramList.add(new Program(1, "Sevgili Spor Sever", "Kütle Endeksi Sonucunuz:(Bir Miktar Kilolu) Aşağıdaki Program Size Uygun Olarak Hazırlanmıştır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(2, "Full Vücut Çalışması", "Bu Programda Sırasıyla Bütün Vücudu Çalıştıracak Hareketler Esas Alınmıştır", "Haydi Başlayalım!"));
        mProgramList.add(new Program(3, "Sevgili Spor Sever", "Kütle Endeksi Sonucunuz(Normal) Aşağıdaki Program Size Uygun Olarak Hazırlanmıştır", "Uygularken Dikkatli Olalım! Spor Hayattır! :)"));
        mProgramList.add(new Program(4, "Full Vücut Çalışması", "Bu Programda Sırasıyla Bütün Vücudu Çalıştıracak Hareketler Esas Alınmıştır", "Haydi Başlayalım!"));
        mProgramList.add(new Program(5, "Isınma", "Koşu Bandı", "10 Dk Koşu Hızlı"));
        mProgramList.add(new Program(6, "Isınma", "Bisiklet", "10 Dk Normal Tempo"));
        mProgramList.add(new Program(7, "Isınma", "Merdiven Climb", "10 Dk Merdiven Aletiyle Orta Tempo"));
        mProgramList.add(new Program(8, "Göğüs Incline Press", "Ağırlıksız olarak Sehpaya geçiyoruz", "2x10 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(9, "Göğüs Decline Press", "Ağırlıksız olarak Sehpaya geçiyoruz", "2x10 1x10 Toplam 3 Set"));
        mProgramList.add(new Program(10,"Triceps Lying Z Bar", "Z bar ile arka kol çalışması", "2x15 1x20 Toplam 3 Set"));
        mProgramList.add(new Program(11,"Seated Cable Row", "10 kilo ağırlık ile Row Makinesine geçiyoruz , Kablolar aşağıda olacak", "2x15 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(12,"Leg Curl", "10 kilo ağırlık ile Curl Makinesine geçiyoruz", "2x15 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(13,"Seated Leg Extention", "10 kilo ağırlık ile bacak çalışması için alete geçiyoruz", "2x10 1x15 Toplam 3 Set"));
        mProgramList.add(new Program(14,"Dips", "Dips Center", "3x15 Toplam 3 Set"));
        mProgramList.add(new Program(15,"Çıkış Koşusu", "Koşu Bandı", "15 Dk Hızlı Tempo"));

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
