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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ImageButton pressThis;
        final TextView mainText;
        TextView score;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_game);

        mainText = findViewById(R.id.textView);
        pressThis = findViewById(R.id.imageButton);
        score = findViewById(R.id.editText);

        pressThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ActionBar.LayoutParams param = new ActionBar.LayoutParams( 10 , 10 , 10);
               // ((ViewGroup.MarginLayoutParams)pressThis.getLayoutParams()).topMargin += 30;
                float y = pressThis.getY();
                y+=40;
                pressThis.setY(y);
                float x = pressThis.getX();
                x+=-50;
                pressThis.setX(x);
                mainText.setText("");
                //pressThis.setLayoutParams(param);
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
