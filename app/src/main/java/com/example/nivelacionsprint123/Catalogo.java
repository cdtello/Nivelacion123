package com.example.nivelacionsprint123;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.nivelacionsprint123.Adaptadores.ProductoAdapter;
import com.example.nivelacionsprint123.DB.DBFirebase;
import com.example.nivelacionsprint123.Entidades.Producto;

import java.util.ArrayList;


public class Catalogo extends AppCompatActivity {
    private ListView listViewProductos;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProductos;
    private DBFirebase dbFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        dbFirebase = new DBFirebase();
        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProductos = new ArrayList<>();
        //***** Creación de Productos *****
       /*
        Producto producto1 = new Producto("Producto1", "Desc1", "1000", String.valueOf(R.drawable.dragon));
        Producto producto2 = new Producto("Producto2", "Desc2", "2000", String.valueOf(R.drawable.dragon));
        Producto producto3 = new Producto("Producto3", "Desc3", "3000", String.valueOf(R.drawable.dragon));
        Producto producto4 = new Producto("Producto4", "Desc4", "4000", String.valueOf(R.drawable.dragon));
        Producto producto5 = new Producto("Producto5", "Desc5", "5000", String.valueOf(R.drawable.dragon));
        Producto producto6 = new Producto("Producto6", "Desc6", "6000", String.valueOf(R.drawable.dragon));
        Producto producto7 = new Producto("Producto7", "Desc7", "7000", String.valueOf(R.drawable.dragon));
        Producto producto8 = new Producto("Producto8", "Desc8", "8000", String.valueOf(R.drawable.dragon));
        Producto producto9 = new Producto("Producto9", "Desc9", "9000", String.valueOf(R.drawable.dragon));

        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        arrayProductos.add(producto4);
        arrayProductos.add(producto5);
        arrayProductos.add(producto6);
        arrayProductos.add(producto7);
        arrayProductos.add(producto8);
        arrayProductos.add(producto9);
        */
        //***** ***** ***** ***** *****

        productoAdapter = new ProductoAdapter(this, arrayProductos);
        listViewProductos.setAdapter(productoAdapter);

        dbFirebase.getData(productoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.addItem:
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}