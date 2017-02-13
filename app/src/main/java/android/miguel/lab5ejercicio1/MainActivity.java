package android.miguel.lab5ejercicio1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickImatgenSimpsons(View v) {
        Animation animacio = AnimationUtils.loadAnimation(this, R.anim.girar);
        v.startAnimation(animacio);
        MediaPlayer so = null;
        switch (v.getId()) {
            case R.id.imageView:
                so = MediaPlayer.create(this, R.raw.ned_flanders_hola_holita_vecinito);
                break;
            case R.id.imageView2:
                so = MediaPlayer.create(this, R.raw.homer_simpson_hola_soy_yo);
                break;
            case R.id.imageView3:
                so = MediaPlayer.create(this, R.raw.eructo_de_barney_gumble);
                break;
            case R.id.imageView4:
                so = MediaPlayer.create(this, R.raw.los_simpsons_pican_pican_los_mosquitos);
                break;
            case R.id.imageView5:
                so = MediaPlayer.create(this, R.raw.los_simpsons_sr_burns_os_traigo_amor);
                break;
            case R.id.imageView6:
                so = MediaPlayer.create(this, R.raw.homer_simpson_quiero_mi_bocadillo);
        }

        so.start();

        // Alliberar el MediaPlayer quan acabi de reproduir la pista d'àudio
        so.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}
