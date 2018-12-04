package edu.mtsu.csci3033.finalproject;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Connect4 extends AppCompatActivity {

    int[][] boardState = new int[7][6];
    int turn = 1;
    boolean gameOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_4);
        final Button res = findViewById(R.id.reset);
        final TextView theTitle = findViewById(R.id.textView);
        final Button row1 = findViewById(R.id.rowOne);
        final Button row2 = findViewById(R.id.rowTwo);
        final Button row3 = findViewById(R.id.rowThree);
        final Button row4 = findViewById(R.id.rowFour);
        final Button row5 = findViewById(R.id.rowFive);
        final Button row6 = findViewById(R.id.rowSix);
        final Button row7 = findViewById(R.id.rowSeven);
        //r1
        final ImageView p1 = findViewById(R.id.piece1);
        final ImageView p2 = findViewById(R.id.piece2);
        final ImageView p3 = findViewById(R.id.piece3);
        final ImageView p4 = findViewById(R.id.piece4);
        final ImageView p5 = findViewById(R.id.piece5);
        final ImageView p6 = findViewById(R.id.piece6);
        final ImageView p7 = findViewById(R.id.piece7);

        //r2
        final ImageView p8 = findViewById(R.id.piece8);
        final ImageView p9 = findViewById(R.id.piece9);
        final ImageView p10 = findViewById(R.id.piece10);
        final ImageView p11 = findViewById(R.id.piece11);
        final ImageView p12 = findViewById(R.id.piece12);
        final ImageView p13 = findViewById(R.id.piece13);
        final ImageView p14 = findViewById(R.id.piece14);

        //r3
        final ImageView p15 = findViewById(R.id.piece15);
        final ImageView p16 = findViewById(R.id.piece16);
        final ImageView p17 = findViewById(R.id.piece17);
        final ImageView p18 = findViewById(R.id.piece18);
        final ImageView p19 = findViewById(R.id.piece19);
        final ImageView p20 = findViewById(R.id.piece20);
        final ImageView p21 = findViewById(R.id.piece21);

        //r4
        final ImageView p22 = findViewById(R.id.piece22);
        final ImageView p23 = findViewById(R.id.piece23);
        final ImageView p24 = findViewById(R.id.piece24);
        final ImageView p25 = findViewById(R.id.piece25);
        final ImageView p26 = findViewById(R.id.piece26);
        final ImageView p27 = findViewById(R.id.piece27);
        final ImageView p28 = findViewById(R.id.piece28);

        //r5
        final ImageView p29 = findViewById(R.id.piece29);
        final ImageView p30 = findViewById(R.id.piece30);
        final ImageView p31 = findViewById(R.id.piece31);
        final ImageView p32 = findViewById(R.id.piece32);
        final ImageView p33 = findViewById(R.id.piece33);
        final ImageView p34 = findViewById(R.id.piece34);
        final ImageView p35 = findViewById(R.id.piece35);

        //r6
        final ImageView p36 = findViewById(R.id.piece36);
        final ImageView p37 = findViewById(R.id.piece37);
        final ImageView p38 = findViewById(R.id.piece38);
        final ImageView p39 = findViewById(R.id.piece39);
        final ImageView p40 = findViewById(R.id.piece40);
        final ImageView p41 = findViewById(R.id.piece41);
        final ImageView p42 = findViewById(R.id.piece42);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setVisibility(View.INVISIBLE);
                p2.setVisibility(View.INVISIBLE);
                p3.setVisibility(View.INVISIBLE);
                p4.setVisibility(View.INVISIBLE);
                p5.setVisibility(View.INVISIBLE);
                p6.setVisibility(View.INVISIBLE);
                p7.setVisibility(View.INVISIBLE);
                p8.setVisibility(View.INVISIBLE);
                p9.setVisibility(View.INVISIBLE);
                p10.setVisibility(View.INVISIBLE);
                p11.setVisibility(View.INVISIBLE);
                p12.setVisibility(View.INVISIBLE);
                p13.setVisibility(View.INVISIBLE);
                p14.setVisibility(View.INVISIBLE);
                p15.setVisibility(View.INVISIBLE);
                p16.setVisibility(View.INVISIBLE);
                p17.setVisibility(View.INVISIBLE);
                p18.setVisibility(View.INVISIBLE);
                p19.setVisibility(View.INVISIBLE);
                p20.setVisibility(View.INVISIBLE);
                p21.setVisibility(View.INVISIBLE);
                p22.setVisibility(View.INVISIBLE);
                p23.setVisibility(View.INVISIBLE);
                p24.setVisibility(View.INVISIBLE);
                p25.setVisibility(View.INVISIBLE);
                p26.setVisibility(View.INVISIBLE);
                p27.setVisibility(View.INVISIBLE);
                p28.setVisibility(View.INVISIBLE);
                p29.setVisibility(View.INVISIBLE);
                p30.setVisibility(View.INVISIBLE);
                p31.setVisibility(View.INVISIBLE);
                p32.setVisibility(View.INVISIBLE);
                p33.setVisibility(View.INVISIBLE);
                p34.setVisibility(View.INVISIBLE);
                p35.setVisibility(View.INVISIBLE);
                p36.setVisibility(View.INVISIBLE);
                p37.setVisibility(View.INVISIBLE);
                p38.setVisibility(View.INVISIBLE);
                p39.setVisibility(View.INVISIBLE);
                p40.setVisibility(View.INVISIBLE);
                p41.setVisibility(View.INVISIBLE);
                p42.setVisibility(View.INVISIBLE);
                theTitle.setText("Connect");
                for(int i = 0; i < 7; i++)
                {
                    for(int j = 0; j < 6; j++)
                    {
                        boardState[i][j] = 0;
                    }
                }

                gameOn = true;
            }

        });


        row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((gameOn) && (boardState[0][5] == 0)) {
                    if (boardState[0][0] == 0) {

                        if(turn == 1) {
                            boardState[0][0] = 1;
                            p1.setImageResource(R.drawable.red_one);
                            checkForWin(0, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][0] = 2;
                            p1.setImageResource(R.drawable.blue_one);
                            checkForWin(0,0, 2);
                        }
                        p1.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[0][1] == 0){

                        if(turn == 1) {
                            boardState[0][1] = 1;
                            p8.setImageResource(R.drawable.red_one);
                            checkForWin(0, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][1] = 2;
                            p8.setImageResource(R.drawable.blue_one);
                            checkForWin(0,1, 2);
                        }
                        p8.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[0][2] == 0){

                        if(turn == 1) {
                            boardState[0][2] = 1;
                            p15.setImageResource(R.drawable.red_one);
                            checkForWin(0, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][2] = 2;
                            p15.setImageResource(R.drawable.blue_one);
                            checkForWin(0,2, 2);
                        }
                        p15.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[0][3] == 0){

                        if(turn == 1) {
                            boardState[0][3] = 1;
                            p22.setImageResource(R.drawable.red_one);
                            checkForWin(0, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][3] = 2;
                            p22.setImageResource(R.drawable.blue_one);
                            checkForWin(0,3, 2);
                        }
                        p22.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[0][4] == 0){

                        if(turn == 1) {
                            boardState[0][4] = 1;
                            p29.setImageResource(R.drawable.red_one);
                            checkForWin(0, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][4] = 2;
                            p29.setImageResource(R.drawable.blue_one);
                            checkForWin(0,4, 2);
                        }
                        p29.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[0][5] == 0){

                        if(turn == 1) {
                            boardState[0][5] = 1;
                            p36.setImageResource(R.drawable.red_one);
                            checkForWin(0, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[0][5] = 2;
                            p36.setImageResource(R.drawable.blue_one);
                            checkForWin(0,5, 2);
                        }
                        p36.setVisibility(View.VISIBLE);
                    }

                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }


                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }

            }
        });
        row2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((gameOn) && (boardState[1][5] == 0)) {
                    if (boardState[1][0] == 0) {

                        if(turn == 1) {
                            boardState[1][0] = 1;
                            p2.setImageResource(R.drawable.red_one);
                            checkForWin(1, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][0] = 2;
                            p2.setImageResource(R.drawable.blue_one);
                            checkForWin(1,0, 2);
                        }
                        p2.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[1][1] == 0){

                        if(turn == 1) {
                            boardState[1][1] = 1;
                            p9.setImageResource(R.drawable.red_one);
                            checkForWin(1, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][1] = 2;
                            p9.setImageResource(R.drawable.blue_one);
                            checkForWin(1,1, 2);
                        }
                        p9.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[1][2] == 0){

                        if(turn == 1) {
                            boardState[1][2] = 1;
                            p16.setImageResource(R.drawable.red_one);
                            checkForWin(1, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][2] = 2;
                            p16.setImageResource(R.drawable.blue_one);
                            checkForWin(1,2, 2);
                        }
                        p16.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[1][3] == 0){

                        if(turn == 1) {
                            boardState[1][3] = 1;
                            p23.setImageResource(R.drawable.red_one);
                            checkForWin(1, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][3] = 2;
                            p23.setImageResource(R.drawable.blue_one);
                            checkForWin(1,3, 2);
                        }
                        p23.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[1][4] == 0){

                        if(turn == 1) {
                            boardState[1][4] = 1;
                            p30.setImageResource(R.drawable.red_one);
                            checkForWin(1, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][4] = 2;
                            p30.setImageResource(R.drawable.blue_one);
                            checkForWin(1,4, 2);
                        }
                        p30.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[1][5] == 0){

                        if(turn == 1) {
                            boardState[1][5] = 1;
                            p37.setImageResource(R.drawable.red_one);
                            checkForWin(1, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[1][5] = 2;
                            p37.setImageResource(R.drawable.blue_one);
                            checkForWin(1,5, 2);
                        }
                        p37.setVisibility(View.VISIBLE);
                    }

                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }

                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }
            }
        });

        row3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if((gameOn) && (boardState[2][5] == 0)) {
                        if (boardState[2][0] == 0) {

                            if(turn == 1) {
                                boardState[2][0] = 1;
                                p3.setImageResource(R.drawable.red_one);
                                checkForWin(2, 0, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][0] = 2;
                                p3.setImageResource(R.drawable.blue_one);
                                checkForWin(2,0, 2);
                            }
                            p3.setVisibility(View.VISIBLE);

                        }
                        else if(boardState[2][1] == 0){

                            if(turn == 1) {
                                boardState[2][1] = 1;
                                p10.setImageResource(R.drawable.red_one);
                                checkForWin(2, 1, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][1] = 2;
                                p10.setImageResource(R.drawable.blue_one);
                                checkForWin(2,1, 2);
                            }
                            p10.setVisibility(View.VISIBLE);
                        }
                        else if(boardState[2][2] == 0){

                            if(turn == 1) {
                                boardState[2][2] = 1;
                                p17.setImageResource(R.drawable.red_one);
                                checkForWin(2, 2, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][2] = 2;
                                p17.setImageResource(R.drawable.blue_one);
                                checkForWin(2,2, 2);
                            }
                            p17.setVisibility(View.VISIBLE);
                        }
                        else if(boardState[2][3] == 0){

                            if(turn == 1) {
                                boardState[2][3] = 1;
                                p24.setImageResource(R.drawable.red_one);
                                checkForWin(2, 3, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][3] = 2;
                                p24.setImageResource(R.drawable.blue_one);
                                checkForWin(2,3, 2);
                            }
                            p24.setVisibility(View.VISIBLE);
                        }
                        else if(boardState[2][4] == 0){

                            if(turn == 1) {
                                boardState[2][4] = 1;
                                p31.setImageResource(R.drawable.red_one);
                                checkForWin(2, 4, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][4] = 2;
                                p31.setImageResource(R.drawable.blue_one);
                                checkForWin(2,4, 2);
                            }
                            p31.setVisibility(View.VISIBLE);
                        }
                        else if(boardState[2][5] == 0){

                            if(turn == 1) {
                                boardState[2][5] = 1;
                                p38.setImageResource(R.drawable.red_one);
                                checkForWin(2, 5, 1);

                            }
                            else if(turn == 2) {
                                boardState[2][5] = 2;
                                p38.setImageResource(R.drawable.blue_one);
                                checkForWin(2,5, 2);
                            }
                            p38.setVisibility(View.VISIBLE);
                        }

                        if(gameOn == false)
                        {
                            theTitle.setText("Player " + turn + " won the game");
                        }

                        if(turn == 1)
                        {
                            turn = 2;
                        }
                        else
                        {
                            turn = 1;
                        }
                    }
            }
        });
        row4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((gameOn) && (boardState[3][5] == 0)) {
                    if (boardState[3][0] == 0) {

                        if(turn == 1) {
                            boardState[3][0] = 1;
                            p4.setImageResource(R.drawable.red_one);
                            checkForWin(3, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][0] = 2;
                            p4.setImageResource(R.drawable.blue_one);
                            checkForWin(3,0, 2);
                        }
                        p4.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[3][1] == 0){

                        if(turn == 1) {
                            boardState[3][1] = 1;
                            p11.setImageResource(R.drawable.red_one);
                            checkForWin(3, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][1] = 2;
                            p11.setImageResource(R.drawable.blue_one);
                            checkForWin(3,1, 2);
                        }
                        p11.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[3][2] == 0){

                        if(turn == 1) {
                            boardState[3][2] = 1;
                            p18.setImageResource(R.drawable.red_one);
                            checkForWin(3, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][2] = 2;
                            p18.setImageResource(R.drawable.blue_one);
                            checkForWin(3,2, 2);
                        }
                        p18.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[3][3] == 0){

                        if(turn == 1) {
                            boardState[3][3] = 1;
                            p25.setImageResource(R.drawable.red_one);
                            checkForWin(3, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][3] = 2;
                            p25.setImageResource(R.drawable.blue_one);
                            checkForWin(3,3, 2);
                        }
                        p25.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[3][4] == 0){

                        if(turn == 1) {
                            boardState[3][4] = 1;
                            p32.setImageResource(R.drawable.red_one);
                            checkForWin(3, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][4] = 2;
                            p32.setImageResource(R.drawable.blue_one);
                            checkForWin(3,4, 2);
                        }
                        p32.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[3][5] == 0){

                        if(turn == 1) {
                            boardState[3][5] = 1;
                            p39.setImageResource(R.drawable.red_one);
                            checkForWin(3, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[3][5] = 2;
                            p39.setImageResource(R.drawable.blue_one);
                            checkForWin(3,5, 2);
                        }
                        p39.setVisibility(View.VISIBLE);
                    }


                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }


                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }

            }
        });
        row5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((gameOn) && (boardState[4][5] == 0)) {
                    if (boardState[4][0] == 0) {

                        if(turn == 1) {
                            boardState[4][0] = 1;
                            p5.setImageResource(R.drawable.red_one);
                            checkForWin(4, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][0] = 2;
                            p5.setImageResource(R.drawable.blue_one);
                            checkForWin(4,0, 2);
                        }
                        p5.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[4][1] == 0){

                        if(turn == 1) {
                            boardState[4][1] = 1;
                            p12.setImageResource(R.drawable.red_one);
                            checkForWin(4, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][1] = 2;
                            p12.setImageResource(R.drawable.blue_one);
                            checkForWin(4,1, 2);
                        }
                        p12.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[4][2] == 0){

                        if(turn == 1) {
                            boardState[4][2] = 1;
                            p19.setImageResource(R.drawable.red_one);
                            checkForWin(4, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][2] = 2;
                            p19.setImageResource(R.drawable.blue_one);
                            checkForWin(4,2, 2);
                        }
                        p19.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[4][3] == 0){

                        if(turn == 1) {
                            boardState[4][3] = 1;
                            p26.setImageResource(R.drawable.red_one);
                            checkForWin(4, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][3] = 2;
                            p26.setImageResource(R.drawable.blue_one);
                            checkForWin(4,3, 2);
                        }
                        p26.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[4][4] == 0){

                        if(turn == 1) {
                            boardState[4][4] = 1;
                            p33.setImageResource(R.drawable.red_one);
                            checkForWin(4, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][4] = 2;
                            p33.setImageResource(R.drawable.blue_one);
                            checkForWin(4,4, 2);
                        }
                        p33.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[4][5] == 0){

                        if(turn == 1) {
                            boardState[4][5] = 1;
                            p40.setImageResource(R.drawable.red_one);
                            checkForWin(4, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[4][5] = 2;
                            p40.setImageResource(R.drawable.blue_one);
                            checkForWin(4,5, 2);
                        }
                        p40.setVisibility(View.VISIBLE);
                    }


                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }


                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }

            }
        });
        row6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((gameOn) && (boardState[5][5] == 0)) {
                    if (boardState[5][0] == 0) {

                        if(turn == 1) {
                            boardState[5][0] = 1;
                            p6.setImageResource(R.drawable.red_one);
                            checkForWin(5, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][0] = 2;
                            p6.setImageResource(R.drawable.blue_one);
                            checkForWin(5,0, 2);
                        }
                        p6.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[5][1] == 0){

                        if(turn == 1) {
                            boardState[5][1] = 1;
                            p13.setImageResource(R.drawable.red_one);
                            checkForWin(5, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][1] = 2;
                            p13.setImageResource(R.drawable.blue_one);
                            checkForWin(5,1, 2);
                        }
                        p13.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[5][2] == 0){

                        if(turn == 1) {
                            boardState[5][2] = 1;
                            p20.setImageResource(R.drawable.red_one);
                            checkForWin(5, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][2] = 2;
                            p20.setImageResource(R.drawable.blue_one);
                            checkForWin(5,2, 2);
                        }
                        p20.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[5][3] == 0){

                        if(turn == 1) {
                            boardState[5][3] = 1;
                            p27.setImageResource(R.drawable.red_one);
                            checkForWin(5, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][3] = 2;
                            p27.setImageResource(R.drawable.blue_one);
                            checkForWin(5,3, 2);
                        }
                        p27.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[5][4] == 0){

                        if(turn == 1) {
                            boardState[5][4] = 1;
                            p34.setImageResource(R.drawable.red_one);
                            checkForWin(5, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][4] = 2;
                            p34.setImageResource(R.drawable.blue_one);
                            checkForWin(5,4, 2);
                        }
                        p34.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[5][5] == 0){

                        if(turn == 1) {
                            boardState[5][5] = 1;
                            p41.setImageResource(R.drawable.red_one);
                            checkForWin(5, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[5][5] = 2;
                            p41.setImageResource(R.drawable.blue_one);
                            checkForWin(5,5, 2);
                        }
                        p41.setVisibility(View.VISIBLE);
                    }


                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }



                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }

            }
        });
        row7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((gameOn) && (boardState[6][5] == 0)) {
                    if (boardState[6][0] == 0) {

                        if(turn == 1) {
                            boardState[6][0] = 1;
                            p7.setImageResource(R.drawable.red_one);
                            checkForWin(6, 0, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][0] = 2;
                            p7.setImageResource(R.drawable.blue_one);
                            checkForWin(6,0, 2);
                        }
                        p7.setVisibility(View.VISIBLE);

                    }
                    else if(boardState[6][1] == 0){

                        if(turn == 1) {
                            boardState[6][1] = 1;
                            p14.setImageResource(R.drawable.red_one);
                            checkForWin(6, 1, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][1] = 2;
                            p14.setImageResource(R.drawable.blue_one);
                            checkForWin(6,1, 2);
                        }
                        p14.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[6][2] == 0){

                        if(turn == 1) {
                            boardState[6][2] = 1;
                            p21.setImageResource(R.drawable.red_one);
                            checkForWin(6, 2, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][2] = 2;
                            p21.setImageResource(R.drawable.blue_one);
                            checkForWin(6,2, 2);
                        }
                        p21.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[6][3] == 0){

                        if(turn == 1) {
                            boardState[6][3] = 1;
                            p28.setImageResource(R.drawable.red_one);
                            checkForWin(6, 3, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][3] = 2;
                            p28.setImageResource(R.drawable.blue_one);
                            checkForWin(6,3, 2);
                        }
                        p28.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[6][4] == 0){

                        if(turn == 1) {
                            boardState[6][4] = 1;
                            p35.setImageResource(R.drawable.red_one);
                            checkForWin(6, 4, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][4] = 2;
                            p35.setImageResource(R.drawable.blue_one);
                            checkForWin(6,4, 2);
                        }
                        p35.setVisibility(View.VISIBLE);
                    }
                    else if(boardState[6][5] == 0){

                        if(turn == 1) {
                            boardState[6][5] = 1;
                            p42.setImageResource(R.drawable.red_one);
                            checkForWin(6, 5, 1);

                        }
                        else if(turn == 2) {
                            boardState[6][5] = 2;
                            p42.setImageResource(R.drawable.blue_one);
                            checkForWin(6,5, 2);
                        }
                        p42.setVisibility(View.VISIBLE);
                    }

                    if(gameOn == false)
                    {
                        theTitle.setText("Player " + turn + " won the game");
                    }

                    if(turn == 1)
                    {
                        turn = 2;
                    }
                    else
                    {
                        turn = 1;
                    }
                }

            }
        });

    }

    private void checkForWin(int x, int y, int z) {
        if(y >= 3)
        {
            checkVertical(x, y, z);
        }

        if(gameOn == true)
        {
            checkHorizontal(x, y, z);
        }

        if(gameOn == true)
        {
            checkDiagonalA(x, y, z);
        }

        if(gameOn == true)
        {
            checkDiagonalB(x, y, z);
        }

    }

    private void checkDiagonalB(int x, int y, int z) {
        boolean same = true;
        boolean same2 = true;
        int count = 1;

        int change = x;
        int change2 = x;
        int ychange = y;
        int ychange2 = y;
        while((same) && (count < 4) && (change < 6) && (ychange > 0))
        {
            change = change + 1;
            ychange = ychange - 1;
            if(boardState[x][y] == boardState[change][ychange])
            {
                count++;
            }
            else
            {
                same = false;
            }
        }

        while((same2) && (count < 4) && (change2 > 0) && (ychange2 < 5))
        {
            change2 = change2 - 1;
            ychange2 = ychange2 + 1;
            if(boardState[x][y] == boardState[change2][ychange2])
            {
                count++;
            }
            else
            {
                same2 = false;
            }
        }
        if(count == 4) {
            gameOn = false;

        }

    }

    private void checkDiagonalA(int x, int y, int z) {
        boolean same = true;
        boolean same2 = true;
        int count = 1;

        int change = x;
        int change2 = x;
        int ychange = y;
        int ychange2 = y;
        while((same) && (count < 4) && (change < 6) && (ychange < 5))
        {
            change = change + 1;
            ychange = ychange + 1;
            if(boardState[x][y] == boardState[change][ychange])
            {
                count++;
            }
            else
            {
                same = false;
            }
        }

        while((same2) && (count < 4) && (change2 > 0) && (ychange2 > 0))
        {
            change2 = change2 - 1;
            ychange2 = ychange2 - 1;
            if(boardState[x][y] == boardState[change2][ychange2])
            {
                count++;
            }
            else
            {
                same2 = false;
            }
        }
        if(count == 4)
            gameOn = false;

    }

    private void checkHorizontal(int x, int y, int z) {
        boolean same = true;
        boolean same2 = true;
        int count = 1;

        int change = x;
        int change2 = x;
        while((same) && (count < 4) && (change < 6))
        {
            change = change + 1;
            if(boardState[x][y] == boardState[change][y])
            {
                count++;
            }
            else
            {
                same = false;
            }
        }

        while((same2) && (count < 4) && (change2 > 0))
        {
            change2 = change2 - 1;
            if(boardState[x][y] == boardState[change2][y])
            {
                count++;
            }
            else
            {
                same2 = false;
            }
        }
        if(count == 4)
            gameOn = false;

    }

    private void checkVertical(int x, int y, int z) {
        boolean same = true;
        int count = 1;

        int change = y;
        while((same) && (count < 4))
        {
            change = change - 1;
            if(boardState[x][y] == boardState[x][change])
            {
                count++;
            }
            else
            {
                same = false;
            }
        }
        if(count == 4)
            gameOn = false;
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
