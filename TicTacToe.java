package edu.mtsu.csci3033.finalproject;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.media.MediaPlayer;
import java.util.Random;
import android.content.Intent;
import static edu.mtsu.csci3033.finalproject.R.id.board;
import static java.lang.Thread.sleep;

public class TicTacToe extends AppCompatActivity {
    private BoardView boardView;
    private GameEngine gameEngine;
    private int tracku = 0;
    private int trackb = 0;
    public Button changeTheme;
    public RelativeLayout back;
    public String[] colors = {"#FFFFFF", "#FFFF00", "#FFC0CB", "#FFD700", "#A52A2A"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        MediaPlayer click = MediaPlayer.create(TicTacToe.this, R.raw.ding);
        back = (RelativeLayout) findViewById(R.id.activity_ttt);
        boardView = (BoardView) findViewById(board);
        gameEngine = new GameEngine();
        boardView.setGameEngine(gameEngine);
        boardView.setMainActivity(this);
        changeTheme = (Button) findViewById(R.id.change_theme);
        changeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i = r.nextInt(5 - 0);
                back.setBackgroundColor(Color.parseColor(colors[i]));
            }
        });

        click.start();
        try {
            sleep(1000);
        } catch (Exception e) {
        }
        click.stop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_new_game) {
            newGame();
        }
        if (item.getItemId() == R.id.Home) {
            switch (item.getItemId()) {
                case R.id.Home:
                    startActivity(new Intent(this, MainActivity.class));
                    return true;

                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void gameEnded(char c) {
        String msg = (c == 'T') ? "Game Ended in a Tie" : "Game Over " + c + " wins!!";
        if (c == 'X') {
            tracku += 1;
            Toast.makeText(TicTacToe.this, tracku + " = Score = " + trackb, Toast.LENGTH_SHORT).show();
        } else if (c == 'O') {
            trackb += 1;
            Toast.makeText(TicTacToe.this, tracku + " = Score = " + trackb, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(TicTacToe.this, tracku + " = Score = " + trackb, Toast.LENGTH_SHORT).show();
        }

        new AlertDialog.Builder(this).setTitle("Tic Tac Toe").
                setMessage(msg).
                setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        newGame();
                    }

                }).show();
    }

    public void newGame() {
        gameEngine.newGame();
        boardView.invalidate();
        MediaPlayer ding = MediaPlayer.create(TicTacToe.this, R.raw.ding);
        ding.setVolume(1, 1);
        ding.start();
        try {
            sleep(1000);
        } catch (Exception e) {
        }
        ding.stop();
    }
}







