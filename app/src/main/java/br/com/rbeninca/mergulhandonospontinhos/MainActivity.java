package br.com.rbeninca.mergulhandonospontinhos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextResposta;
    TextView tvPergunta, tvCelaResposta;
    MergulhandoNosPontinhosManager manager;
    ListView listView;

    Letra letra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextResposta = findViewById(R.id.editTextResposta);
        tvPergunta = findViewById(R.id.textViewPergunta);
        tvCelaResposta = findViewById(R.id.textViewCelaResposta);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        listView = findViewById(R.id.listView);



        manager= new MergulhandoNosPontinhosManager();
        manager.iniciaJogo();
        carregaProximaLetra();

    }

    public void showListagem(){
        ArrayList list=new ArrayList();
        for (Letra l: manager.letrasSorteadas){
            list.add(l.getCarater());
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

    }

    public void carregaProximaLetra(){
        tvPergunta.setText(manager.getLetraAtual().getCarater());
        tvCelaResposta.setText(manager.letraAtual.getStringCela());
        showListagem();
    }


    //metodo que emite aplausos como som de acerto  tocando 1 segundo o som R.raw.aplausos
    public void fazBeepAcerto() {
        // Tocar som de aplausos quando acertar por 1 segundo (1000 milisegundos)
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.aplausos);

        // Set the playback speed to 2x
        PlaybackParams params = new PlaybackParams();
        params.setSpeed(4.0f);
        mediaPlayer.setPlaybackParams(params);

        mediaPlayer.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }, 1000); // Stop and release the MediaPlayer after 1 second
        //ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
        //toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,150);
    }

    public void fazBeepErro() {
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT, 550);
    }
   //metodo que emite um sirene de erro tocando 1 segundo o som R.raw.aplausos
    public void fazSireneErro(){

    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                if (manager.veriticaRespota(editTextResposta.getText().toString())){
                    fazBeepAcerto();
                    manager.proximaLetra();
                    carregaProximaLetra();
                    listView.invalidate();
                }else {
                    fazBeepErro();
                }

                break;
        }
    }
}