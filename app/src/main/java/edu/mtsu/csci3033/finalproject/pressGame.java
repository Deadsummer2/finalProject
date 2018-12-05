package edu.mtsu.csci3033.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class pressGame extends AppCompatActivity {
    //initialising global variables

    double multiplier = 1;
    double currentScore = 1;
    int count = 1;
    long displayScore = 0;
    boolean twoAreUp = false;
    float Y, X;
    float Y2, X2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //initialising android screen elements
        final ImageButton pressThis;
        final ImageButton pressThis2;
        final TextView mainText;
        final TextView finalScore;
        //https://stackoverflow.com/questions/26538421/how-do-i-play-sound-on-button-click-in-android-studio
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.balloonpopping);
       // final TextView score, multiplierDisplay;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_game);
        //linking elements by id
        finalScore = findViewById(R.id.textView2);
        mainText = findViewById(R.id.textView);
        pressThis = findViewById(R.id.imageButton);
        pressThis2 = findViewById(R.id.imageButton2);

        //https://stackoverflow.com/questions/26370993/how-to-get-image-resource
        Integer imageResource1 = (Integer)pressThis.getTag();
        Integer imageResource12 = (Integer)pressThis.getTag();

        //on button press this will run
        pressThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mp.start();
                if (twoAreUp)
                    pressThis2.setVisibility(View.VISIBLE);
                else
                    twoAreUp = true;
                //multiplier that will be applied to currentScore every button press
                multiplier += .10;
                //calculate the score then convert to long
                currentScore = 10 + ( currentScore * multiplier);
                displayScore = (long)currentScore;
                //button will stay active for 8 seconds, after which it will become invisible and final message will display
                    pressThis.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            pressThis.setVisibility(View.INVISIBLE);
                            pressThis2.setVisibility(View.INVISIBLE);
                            mainText.setText("Time has run out!");
                            finalScore.setText("Final Score: " + String.valueOf(displayScore));
                            mainText.setBackgroundColor(8109494);
                        }
                    }, 8000);
                //calculating x and y values
                double randomXMult = Math.random() * 1000;
                double randomYMult = Math.random() * 1700;
                double y = 1 * randomYMult/* * posNegMult*/;
                Y = (float)y;
                pressThis.setY(Y);
                double x = 1 * randomXMult /* * posNegMult*/;
                X = (float)x;
                pressThis.setX(X);
                //after press the initial text will disappear
                mainText.setText("");
                mainText.setBackgroundColor(000000);
                //display the users score
                finalScore.setText(String.valueOf(displayScore));
                pressThis.setImageResource(R.drawable.balloon_2);
            }
        });
        pressThis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mp.start();
                //multiplier that will be applied to currentScore every button press
                multiplier += .10;
                //calculate the score then convert to long
                currentScore = 10 + ( currentScore * multiplier);
                displayScore = (long)currentScore;

                //calculating x and y values
                double randomXMult = Math.random() * 1000;
                double randomYMult = Math.random() * 1700;
                double y = 1 * randomYMult/* * posNegMult*/;
                double x = 1 * randomXMult /* * posNegMult*/;
                X2 = (float)x;
                Y2 = (float)y;
                if(X == X2 || Y == Y2){
                    X2 = (float)x;
                    Y2 = (float)y;}
                else {
                    pressThis.setY(Y2);
                    pressThis.setX(X2);
                }
                //display the users score
                finalScore.setText(String.valueOf(displayScore));
                pressThis.setImageResource(R.drawable.balloon_2);

            }
        });


    }

    //the functions that set up the menu to go back to the main screen
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pgm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mainMenu:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
