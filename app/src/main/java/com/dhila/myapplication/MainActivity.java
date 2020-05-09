package com.dhila.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

class formmahasiswa extends AppCompatActivity {

    Button bsimpan;
    EditText enim, enama, etempatlahir, etanggallahir, prodi, eagama;
    TextView thasil;
    RadioGroup rgjk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formmahasiswa);

        // inisialisasi
        bsimpan = (Button) findViewById(R.id.simpan);
        enim = (EditText) findViewById(R.id.isinim);
        enama = (EditText) findViewById(R.id.isinama);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.jk);
        prodi = (EditText) findViewById(R.id.isiprodi);
        eagama  = (EditText) findViewById(R.id.isiagama);
        etempatlahir = (EditText) findViewById(R.id.tempatlahir);
        etanggallahir = (EditText) findViewById(R.id.tanggallahir);

        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnim = String.valueOf(enim.getText().toString());
                String inputnama = String.valueOf(enama.getText().toString());
                String inputagama = String.valueOf(eagama.getText().toString());
                String inputprodi = String.valueOf(prodi.getText().toString());
                String inputtempatlahir = String.valueOf(etempatlahir.getText().toString());
                String inputtanggallahir = String.valueOf(etanggallahir.getText().toString());

                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputjk = String.valueOf(jk.getText().toString());

                thasil.setText("\n" + "NIM\t\t\t\t\t\t\t\t\t\t\t: " + inputnim + "\n" +
                        "Nama\t\t\t\t\t\t\t\t\t\t: " + inputnama + "\n" +
                        "Jenis Kelamin\t\t: " + inputjk + "\n" +
                        "Program Studi\t\t\t\t\t\t\t\t\t\t: " + inputagama +"\n" +
                        "Agama\t\t\t\t\t\t\t\t\t: " + inputprodi+ "\n"+
                        "Jenis Kelamin\t\t: " + inputtempatlahir + "\n" +
                        "Tanggal Lahir\t\t\t: " + inputtanggallahir + "\n");
            }
        });

    }
}