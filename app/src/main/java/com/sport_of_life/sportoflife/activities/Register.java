package com.sport_of_life.sportoflife.activities;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.helpers.InputDogrulama;
import com.sport_of_life.sportoflife.sql.DatabaseHelper;
import com.sport_of_life.sportoflife.model.User;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private final AppCompatActivity activity = Register.this;

    private TextInputLayout layoutAllRegister;

    private TextInputLayout layoutKullaniciAdi;
    private TextInputLayout layoutEmail;
    private TextInputLayout layoutSifre;
    private TextInputLayout layoutSifreTekrar;
    private TextInputLayout layoutAd;
    private TextInputLayout layoutSoyad;
    private TextInputLayout layoutDogumTarihi;

    private TextInputEditText editTextKullaniciAdi;
    private TextInputEditText editTextEmail;
    private TextInputEditText editTextSifre;
    private TextInputEditText editTextSifreTekrar;
    private TextInputEditText editTextAd;
    private TextInputEditText editTextSoyad;
    private TextInputEditText editTextDogumTarihi;

    private AppCompatButton buttonKaydol;

    private InputDogrulama inputDogrulama;
    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews() {

       // layoutAllRegister = (TextInputLayout) findViewById(R.id.layoutAllRegiter);

        layoutKullaniciAdi = (TextInputLayout) findViewById(R.id.layoutKullaniciAdi);
        layoutEmail = (TextInputLayout) findViewById(R.id.layoutEmail);
        layoutSifre = (TextInputLayout) findViewById(R.id.layoutSifre);
        layoutSifreTekrar = (TextInputLayout) findViewById(R.id.layoutSifreTekrar);
        layoutAd = (TextInputLayout) findViewById(R.id.layoutAd);
        layoutSoyad = (TextInputLayout) findViewById(R.id.layoutSoyad);
        layoutDogumTarihi = (TextInputLayout) findViewById(R.id.layoutDogumTarihi);

        editTextKullaniciAdi = (TextInputEditText) findViewById(R.id.editTextKullaniciAdi);
        editTextEmail = (TextInputEditText) findViewById(R.id.editTextEmail);
        editTextSifre = (TextInputEditText) findViewById(R.id.editTextSifre);
        editTextSifreTekrar = (TextInputEditText) findViewById(R.id.editTextSifreTekrar);
        editTextAd = (TextInputEditText) findViewById(R.id.editTextAd);
        editTextSoyad = (TextInputEditText) findViewById(R.id.editTextSoyad);
        editTextDogumTarihi = (TextInputEditText) findViewById(R.id.editTextDogumTarihi);

        buttonKaydol = (AppCompatButton) findViewById(R.id.buttonKaydol);
    }

    private void initListeners() {
        buttonKaydol.setOnClickListener(this);
    }

    private void initObjects() {
        inputDogrulama = new InputDogrulama(activity);
        databaseHelper = new DatabaseHelper(activity);
        user = new User();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.buttonKaydol:
                postDataToSQLite();
        }
    }

    private void postDataToSQLite() {
        if (!inputDogrulama.isInputEditTextFilled(editTextKullaniciAdi, layoutKullaniciAdi, "Kullanıcı Adı")) {
            return;
        }
        if (!inputDogrulama.isInputEditTextFilled(editTextAd, layoutAd, "Ad")) {
            return;
        }
        if (!inputDogrulama.isInputEditTextFilled(editTextSoyad, layoutSoyad, "Soyad")) {
            return;
        }
        if (!inputDogrulama.isInputEditTextFilled(editTextDogumTarihi, layoutDogumTarihi, "Doğum Tarihi")) {
            return;
        }
        if (!inputDogrulama.isInputEditTextMatches(editTextSifre, editTextSifreTekrar,
                layoutSifreTekrar, "Şifre Eşleşmedi.")){
            return;
        }

        if (!databaseHelper.checkUser(editTextEmail.getText().toString().trim())) {

            user.setKullaniciAdi(editTextKullaniciAdi.getText().toString().trim());
            user.setAd(editTextAd.getText().toString().trim());
            user.setSoyad(editTextSoyad.getText().toString().trim());
            user.setEmail(editTextEmail.getText().toString().trim());
            user.setDogumTarihi(editTextDogumTarihi.getText().toString().trim());
            user.setSifre(editTextSifre.getText().toString().trim());

            databaseHelper.addUser(user);

            Toast.makeText(getApplicationContext(), "Kayıt Başarılı", Toast.LENGTH_LONG).show();

            emptyInputEditText();

        } else {
            Toast.makeText(getApplicationContext(), "E-posta zaten bulunmaktadır", Toast.LENGTH_LONG).show();
        }


    }

    private void emptyInputEditText() {
        editTextKullaniciAdi.setText(null);
        editTextAd.setText(null);
        editTextSoyad.setText(null);
        editTextEmail.setText(null);
        editTextDogumTarihi.setText(null);
        editTextSifre.setText(null);
        editTextSifreTekrar.setText(null);
    }

}
