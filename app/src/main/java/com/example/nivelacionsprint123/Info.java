package com.example.nivelacionsprint123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nivelacionsprint123.Entidades.Producto;

public class Info extends AppCompatActivity {
    private Button btnInfo;
    private TextView textNameInfo, textDescriptionInfo, textIdInfo, textPriceInfo;
    private ImageView imgInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        textIdInfo = (TextView) findViewById(R.id.textIdInfo);
        textNameInfo = (TextView) findViewById(R.id.textNameInfo);
        textDescriptionInfo = (TextView) findViewById(R.id.textDescriptionInfo);
        textPriceInfo = (TextView) findViewById(R.id.textPriceInfo);
        imgInfo = (ImageView) findViewById(R.id.imgInfo);

        Intent intentIN = getIntent();
        Producto producto = new Producto(
                intentIN.getStringExtra("id"),
                intentIN.getStringExtra("name"),
                intentIN.getStringExtra("description"),
                intentIN.getStringExtra("price"),
                intentIN.getStringExtra("image")
        );
        textIdInfo.setText(producto.getId());
        textNameInfo.setText(producto.getName());
        textDescriptionInfo.setText(producto.getDescription());
        textPriceInfo.setText(producto.getPrice());
        imgInfo.setImageResource(Integer.parseInt(producto.getImage()));

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Catalogo.class);
                startActivity(intent);
            }
        });
    }
}