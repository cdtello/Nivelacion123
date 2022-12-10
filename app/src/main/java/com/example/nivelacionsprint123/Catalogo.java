package com.example.nivelacionsprint123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.nivelacionsprint123.Adaptadores.ProductoAdapter;
import com.example.nivelacionsprint123.Entidades.Producto;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProductos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();
        //**** Creacion de producots
        Producto producto1 = new Producto("Producto1", "Desc1", 1000, R.drawable.dragon);
        Producto producto2 = new Producto("Producto2", "Desc2", 2000, R.drawable.dragon);
        Producto producto3 = new Producto("Producto3", "Desc3", 3000, R.drawable.dragon);
        Producto producto4 = new Producto("Producto4", "Desc4", 4000, R.drawable.dragon);
        Producto producto5 = new Producto("Producto5", "Desc5", 5000, R.drawable.dragon);
        Producto producto6 = new Producto("Producto6", "Desc6", 6000, R.drawable.dragon);
        Producto producto7 = new Producto("Producto7", "Desc7", 7000, R.drawable.dragon);
        Producto producto8 = new Producto("Producto8", "Desc8", 8000, R.drawable.dragon);
        Producto producto9 = new Producto("Producto9", "Desc9", 9000, R.drawable.dragon);

        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);
        arrayProductos.add(producto7);
        arrayProductos.add(producto8);
        arrayProductos.add(producto9);

        //***** ***** *****
        productoAdapter = new ProductoAdapter(this, arrayProductos);
        listViewProductos.setAdapter(productoAdapter);
    }
}