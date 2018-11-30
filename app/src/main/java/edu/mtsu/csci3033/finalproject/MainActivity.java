package edu.mtsu.csci3033.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tappin(View view) {
        Intent intent = new Intent(this, pressGame.class);
        //EditText editText = (EditText) findViewById((R.id.edit))
        startActivity(intent);
    }

/*    public void TicTacToe(View view) {
        Intent intent = new Intent(this, TicTacToe.class);
        //EditText editText = (EditText) findViewById((R.id.edit))
        startActivity(intent);
    }

    public void Connect4(View view) {
        Intent intent = new Intent(this, Connect4.class);
        //EditText editText = (EditText) findViewById((R.id.edit))
        startActivity(intent);
    }*/
}


