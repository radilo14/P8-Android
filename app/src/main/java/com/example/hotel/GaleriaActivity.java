package com.example.hotel;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class GaleriaActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView _f1,_f2,_f3,_f4,_f5,_f6,_f7,_f8,_f9,_f10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        _f1 = findViewById(R.id.foto1);
        _f2 = findViewById(R.id.foto2);
        _f3 = findViewById(R.id.foto3);
        _f4 = findViewById(R.id.foto4);
        _f5 = findViewById(R.id.foto5);
        _f6 = findViewById(R.id.foto6);
        _f7 = findViewById(R.id.foto7);
        _f8 = findViewById(R.id.foto8);
        _f9 = findViewById(R.id.foto9);
        _f10 = findViewById(R.id.foto10);


        _f1.setOnClickListener(this);
        _f2.setOnClickListener(this);
        _f3.setOnClickListener(this);
        _f4.setOnClickListener(this);
        _f5.setOnClickListener(this);
        _f6.setOnClickListener(this);
        _f7.setOnClickListener(this);
        _f8.setOnClickListener(this);
        _f9.setOnClickListener(this);
        _f10.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        int id = view.getId();
        AlertDialog.Builder builder = new AlertDialog.Builder(GaleriaActivity.this);
        View v = View.inflate(GaleriaActivity.this,R.layout.activity_foto,null);
        ImageView foto = v.findViewById(R.id.foto);
        builder.setView(v);
        builder.setNeutralButton("Cerrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog;
        switch (id) {
            //sigue este ejemplo para las demas fotos
            case R.id.foto1:
                foto.setImageResource(R.drawable.ic_foto1);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto2:
                foto.setImageResource(R.drawable.ic_foto2);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto3:
                foto.setImageResource(R.drawable.ic_foto3);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto4:
                foto.setImageResource(R.drawable.ic_foto4);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto5:
                foto.setImageResource(R.drawable.ic_foto5);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto6:
                foto.setImageResource(R.drawable.ic_foto6);
                alertDialog=builder.create();
                alertDialog.show();
                break;
        
            case R.id.foto7:
                foto.setImageResource(R.drawable.ic_foto7);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto8:
                foto.setImageResource(R.drawable.ic_foto8);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto9:
                foto.setImageResource(R.drawable.ic_foto9);
                alertDialog=builder.create();
                alertDialog.show();
                break;
            case R.id.foto10:
                foto.setImageResource(R.drawable.ic_foto10);
                alertDialog=builder.create();
                alertDialog.show();
                break;
        }

    }
}