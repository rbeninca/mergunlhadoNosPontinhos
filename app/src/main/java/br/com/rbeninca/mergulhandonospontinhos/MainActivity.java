package br.com.rbeninca.mergulhandonospontinhos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AlfabetoBraile alfabetoBraile;
    EditText editTextResposta;
    TextView tvPergunta;

    Letra letra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextResposta=findViewById(R.id.editTextResposta);
        tvPergunta=findViewById(R.id.textViewPergunta);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        alfabetoBraile=new AlfabetoBraile();
        sorteiaLetra();
    }

    public void sorteiaLetra(){
        //Sorteia uma letra do alfabetoBraile  e associa e atribui a this.letra
        this.letra = alfabetoBraile.getLetra(new Random().nextInt(alfabetoBraile.alfabetoBraile.size()));
        //Exibe a letra sorteada na tela
        tvPergunta.setText(this.letra.carater);
    }
    public boolean verificaAcerto(){

        //pega a resposta do usuário no campo edResposta e compara se os valores estam contindos em this.letra.pontosCela
        String resposta = editTextResposta.getText().toString();
        // realiza split da resposta separando cada caracter em um array de string
        String[] respostaSplit = resposta.split("");
        //cria um array de inteiros para armazenar os valores inteiros da resposta
        int[] respostaInt = new int[respostaSplit.length];
        //converte os valores do array de string para inteiros
        if (resposta.length()>1) {
            for (int i = 0; i < respostaSplit.length; i++) {
                respostaInt[i] = Integer.parseInt(respostaSplit[i]);
            }


            Letra letra1 = new Letra(letra.getCarater(), respostaInt);
            //compara se os valores da resposta estão contidos em this.letra.pontosBraille
            return alfabetoBraile.comparaBraile(letra1);
        }
        return false;
    }

    public void exibeResultado(boolean acertou){
        if( verificaAcerto()){
            fazBeepAcerto();
            sorteiaLetra();
        }else{
            fazBeepErro();
        }
    }

    public void fazBeepAcerto(){
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,150);
    }

    public void fazBeepErro() {
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT, 550);
    }
   //metodo que emite um sirene de erro
    public void fazSireneErro(){

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                exibeResultado(verificaAcerto());

                break;
        }
    }
}