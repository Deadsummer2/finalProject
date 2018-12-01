package edu.mtsu.csci3033.finalproject;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class pressGame extends AppCompatActivity {
    double timer = 3.0;
    double multiplier = 1;
    int currentScore = 0;
    int count = 0;
    double timerMax = 3.0;
    int posNegMult = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ImageButton pressThis;
        final TextView mainText;
        final TextView score, multiplierDisplay;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_game);

        mainText = findViewById(R.id.textView);
        pressThis = findViewById(R.id.imageButton);
        score = findViewById(R.id.editText);
        multiplierDisplay = findViewById(R.id.editText2);

/*        final float startY = pressThis.getY();
        final float startX = pressThis.getX();*/

        pressThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count%3 == 0 && (Math.random()*count)%2 == 0)
                {
                    posNegMult *= -1;
                }
                if(timer >= timerMax){
                    timer -= .1;
                    multiplier += .1;
                }
                double randomXYMult = Math.random() * 50;
                //float y = pressThis.getY();
                double y = 1 * randomXYMult * posNegMult;
                float Y = (float)y;
                pressThis.setY(Y);
                //double x = pressThis.getX();
                double x = 1 * randomXYMult * posNegMult;
                float X = (float)x;
                pressThis.setX(X);
                mainText.setText("");
                //score.setText(currentScore);
                //multiplierDisplay.setText(Double.toString(multiplier));
            }
        });


    }

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
