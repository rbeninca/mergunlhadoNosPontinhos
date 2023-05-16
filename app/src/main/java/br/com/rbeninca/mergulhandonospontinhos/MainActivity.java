package br.com.rbeninca.mergulhandonospontinhos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Letra> alfabetoBraile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Carrega letras Braile
        alfabetoBraile = new ArrayList<Letra>();
        alfabetoBraile.add(new Letra("a", new int[]{1}));
        alfabetoBraile.add(new Letra("b", new int[]{1,2}));
        alfabetoBraile.add(new Letra("c", new int[]{1,4}));
        alfabetoBraile.add(new Letra("d", new int[]{1,4,5}));
        alfabetoBraile.add(new Letra("e", new int[]{1,5}));
        alfabetoBraile.add(new Letra("f", new int[]{1,2,4}));
        alfabetoBraile.add(new Letra("g", new int[]{1,2,4,5}));
        alfabetoBraile.add(new Letra("h", new int[]{1,2,5}));
        alfabetoBraile.add(new Letra("i", new int[]{2,4}));
        alfabetoBraile.add(new Letra("j", new int[]{2,4,5}));
        alfabetoBraile.add(new Letra("k", new int[]{1,3}));
        alfabetoBraile.add(new Letra("l", new int[]{1,2,3}));
        alfabetoBraile.add(new Letra("m", new int[]{1,3,4}));
        alfabetoBraile.add(new Letra("n", new int[]{1,3,4,5}));
        alfabetoBraile.add(new Letra("o", new int[]{1,3,5}));
        alfabetoBraile.add(new Letra("p", new int[]{1,2,3,4}));
        alfabetoBraile.add(new Letra("q", new int[]{1,2,3,4,5}));
        alfabetoBraile.add(new Letra("r", new int[]{1,2,3,5}));
        alfabetoBraile.add(new Letra("s", new int[]{2,3,4}));
        alfabetoBraile.add(new Letra("t", new int[]{2,3,4,5}));
        alfabetoBraile.add(new Letra("u", new int[]{1,3,6}));
        alfabetoBraile.add(new Letra("v", new int[]{1,2,3,6}));
        alfabetoBraile.add(new Letra("x", new int[]{1,3,4,6}));
        alfabetoBraile.add(new Letra("y", new int[]{1,3,4,5,6}));
        alfabetoBraile.add(new Letra("z", new int[]{1,3,5,6}));
        alfabetoBraile.add(new Letra("ç", new int[]{1,2,4,6}));
        alfabetoBraile.add(new Letra("á", new int[]{1,6}));
        alfabetoBraile.add(new Letra("é", new int[]{1,2,6}));
        alfabetoBraile.add(new Letra("í", new int[]{2,4,6}));
        alfabetoBraile.add(new Letra("ó", new int[]{1,3,6}));
        alfabetoBraile.add(new Letra("ú", new int[]{2,3,6}));
        alfabetoBraile.add(new Letra("â", new int[]{1,2,3,6}));
        alfabetoBraile.add(new Letra("ê", new int[]{1,3,4,6}));
        alfabetoBraile.add(new Letra("ô", new int[]{1,2,4,5,6}));
        alfabetoBraile.add(new Letra("ã", new int[]{1,2,3,4,6}));
        alfabetoBraile.add(new Letra("õ", new int[]{1,2,3,5,6}));
        alfabetoBraile.add(new Letra("à", new int[]{1,2,3,4,5,6}));
        alfabetoBraile.add(new Letra("ü", new int[]{1,2,3,5,6}));
        alfabetoBraile.add(new Letra("í", new int[]{2,4,6}));
        alfabetoBraile.add(new Letra("!", new int[]{2,3,4,6}));
        alfabetoBraile.add(new Letra("?", new int[]{2,3,4,5,6}));
        alfabetoBraile.add(new Letra(":", new int[]{2,3,5,6}));
        alfabetoBraile.add(new Letra(";", new int[]{2,3,4,5}));
        alfabetoBraile.add(new Letra(",", new int[]{2,3}));
        alfabetoBraile.add(new Letra(".", new int[]{2,3,5}));
        alfabetoBraile.add(new Letra("-", new int[]{3,6}));
        alfabetoBraile.add(new Letra("(", new int[]{2,3,4,5,6}));
        alfabetoBraile.add(new Letra(")", new int[]{2,3,4,5,6}));
        alfabetoBraile.add(new Letra(" ", new int[]{7}));



    }
}