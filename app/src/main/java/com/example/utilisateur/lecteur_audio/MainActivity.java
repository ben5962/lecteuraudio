package com.example.utilisateur.lecteur_audio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.os.Handler;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public TextView songName;
    private MediaPlayer lecteur_mp3;
    private Handler myHandler = new Handler();
    private ImageButton playButton, pauseButton;
    public static int oneTimeOnly = 0;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            songName = (TextView)findViewById(R.id.textViewNomChanson);
            playButton = (ImageButton)findViewById(R.id.imageButtonPlay);
            pauseButton = (ImageButton)findViewById(R.id.imageButtonPause);
            songName.setText("song.mp3");
            lecteur_mp3 = MediaPlayer.create(this,R.raw.song);
            pauseButton.setEnabled(false);
                                                        }

         public void play(View view){
                Toast.makeText(getApplicationContext(),"Playing sound",Toast.LENGTH_SHORT).show();
                lecteur_mp3.start();
                pauseButton.setEnabled(true);
                playButton.setEnabled(false);
                                    }

        public void pause(View view){
            Toast.makeText(getApplicationContext(), "pausing sound", Toast.LENGTH_SHORT).show();
            lecteur_mp3.pause();
            pauseButton.setEnabled(false);
            playButton.setEnabled(true);
                                    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
                                                       }

           @Override
        public boolean onOptionsItemSelected(MenuItem item) {
          // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {  return true;
                                            }

            return super.onOptionsItemSelected(item);
                                                            }
                                                                }
