package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi;
    Button tampil;
    TextView hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = findViewById(R.id.input_alas);
        tinggi = findViewById(R.id.input_tinggi);
        tampil = findViewById(R.id.btn_hitung);
        hitung = findViewById(R.id.output_hitung);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();

                rumus(Integer.parseInt(alas1), Integer.parseInt(tinggi1));
            }
        });
    }

    private void rumus(int alas, int tinggi){

        double hasil = 0.5 * alas * tinggi;
        hitung.setText(String.valueOf(hasil));
    }
}