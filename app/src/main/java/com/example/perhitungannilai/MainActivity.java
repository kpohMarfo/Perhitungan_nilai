package com.example.perhitungannilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText ednama, edtugas, eduts, eduas, edakhir, edhuruf;
    Button bthitung;
    Double vtugas;
    Double vuts;
    Double vuas;
    Double vakhir;
    String vnama,vhuruf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama =(EditText)findViewById(R.id.ednama);
        edtugas =(EditText)findViewById(R.id.edtugas);
        eduts =(EditText)findViewById(R.id.eduts);
        eduas =(EditText)findViewById(R.id.eduas);
        edakhir =(EditText)findViewById(R.id.edakhir);
        edhuruf =(EditText)findViewById(R.id.edhuruf);
        bthitung =(Button) findViewById(R.id.bthitung);

    }

    public void hitung(View view) {
        vtugas =Double.parseDouble(edtugas.getText().toString());
        vuts =Double.parseDouble(eduts.getText().toString());
        vuas =Double.parseDouble(eduas.getText().toString());

        vakhir = (0.50 * vtugas) + (0.25 * vuts) + (0.25 * vuas);

        if (vakhir >= 95.00 && vakhir <=100){
            vhuruf="A+";
        }
        else if (vakhir >= 90.00 && vakhir <=94.99){
            vhuruf="A";
        }
        else if (vakhir >= 85.00 && vakhir <=89.99){
            vhuruf="B+";
        }
        else if (vakhir >= 80.00 && vakhir <=84.99){
            vhuruf="B";
        }
        else if (vakhir >= 75.00 && vakhir <=79.99){
            vhuruf="C+";
        }
        else if (vakhir >= 70.00 && vakhir <=74.99){
            vhuruf="C";
        }
        else if (vakhir >= 60 && vakhir <=69){
            vhuruf="D";
        }
        else{
            vhuruf="E";
        }

        edakhir.setText(""+vakhir);
        edhuruf.setText(""+vhuruf);


    }
}