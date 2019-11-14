package com.sport_of_life.sportoflife.activities;

import android.content.Intent;
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

public class Login extends AppCompatActivity implements View.OnClickListener{
    private final AppCompatActivity activity = Login.this;

    private TextInputLayout layoutAllLogin;

    private TextInputLayout layoutKullaniciAdi;
    private TextInputLayout layoutSifre;

    private TextInputEditText editTextKullaniciAdi;
    private TextInputEditText editTextSifre;

    private AppCompatButton buttonGiris;
    private AppCompatButton buttonUyelik;

    private InputDogrulama inputDogrulama;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews() {

       // layoutAllLogin = (TextInputLayout) findViewById(R.id.layoutAllLogin);

        layoutKullaniciAdi = (TextInputLayout) findViewById(R.id.layoutKullaniciAdi);
        layoutSifre = (TextInputLayout) findViewById(R.id.layoutSifre);

        editTextKullaniciAdi = (TextInputEditText) findViewById(R.id.editTextKullaniciAdi);
        editTextSifre = (TextInputEditText) findViewById(R.id.editTextSifre);

        buttonGiris = (AppCompatButton) findViewById(R.id.buttonGiris);
        buttonUyelik = (AppCompatButton) findViewById(R.id.buttonUyelik);
    }

    private void initListeners(){
        buttonGiris.setOnClickListener(this);
        buttonUyelik.setOnClickListener(this);
    }

    private void initObjects(){
        databaseHelper = new DatabaseHelper(activity);
        inputDogrulama = new InputDogrulama(activity);
    }

    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonGiris:
                verifyFromSQLite();
                break;

            case R.id.buttonUyelik:
                Intent intentRegister = new Intent(getApplicationContext(), Register.class);
                startActivity(intentRegister);
                break;
        }
    }

    private void verifyFromSQLite() {
        if (!inputDogrulama.isInputEditTextFilled(editTextKullaniciAdi, layoutKullaniciAdi, "Kullanıcı Adı")){
            return;
        }
        if(!inputDogrulama.isInputEditTextFilled(editTextSifre, layoutSifre, "Şifre")){
            return;
        }

        if (databaseHelper.checkUser(editTextKullaniciAdi.getText().toString().trim(), editTextSifre.getText().toString().trim()))
        {
            Intent accountsIntent = new Intent(activity, MenuActivity.class);
            accountsIntent.putExtra("Kullanıcı Adı", editTextKullaniciAdi.getText().toString().trim());
            emptyInputEditText();
            startActivity(accountsIntent);
        } else {
            Toast.makeText(getApplicationContext(), "Kullanıcı Adı yada Şifre Yanlış", Toast.LENGTH_LONG).show();
        }
    }

    private void emptyInputEditText() {
        editTextKullaniciAdi.setText(null);
        editTextSifre.setText(null);
    }
}
