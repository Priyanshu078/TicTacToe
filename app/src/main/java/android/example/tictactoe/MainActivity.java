package android.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String player_1 = "X";
    String player_2 = "O";

    int score1 = 0;
    int score2 = 0;

    String chance1 = "Player_1_Chance";
    String chance2 = "Player_2_Chance";

//    int number = 0;
    boolean player1_playing_status = true;
    boolean player2_playing_status = false;

    String textIn1;
    String textIn2;
    String textIn3;
    String textIn4;
    String textIn5;
    String textIn6;
    String textIn7;
    String textIn8;
    String textIn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 =  findViewById(R.id.text1);
        TextView text2 =  findViewById(R.id.text2);
        TextView text3 =  findViewById(R.id.text3);
        TextView text4 =  findViewById(R.id.text4);
        TextView text5 =  findViewById(R.id.text5);
        TextView text6 =  findViewById(R.id.text6);
        TextView text7 =  findViewById(R.id.text7);
        TextView text8 =  findViewById(R.id.text8);
        TextView text9 =  findViewById(R.id.text9);
        TextView chance =  findViewById(R.id.chance);
        Button reset =  findViewById(R.id.reset);
        TextView player1Score = findViewById(R.id.score1);
        TextView player2Score = findViewById(R.id.score2);


//        textIn1 = text1.getText().toString();
//        textIn2 = text2.getText().toString();
//        textIn3 = text3.getText().toString();
//        textIn4 = text4.getText().toString();
//        textIn5 = text5.getText().toString();
//        textIn6 = text6.getText().toString();
//        textIn7 = text7.getText().toString();
//        textIn8 = text8.getText().toString();
//        textIn9 = text9.getText().toString();

        String[][] tictactoe = new String[3][3];
        for(int i = 0; i <3 ;i++){
            for (int j = 0;j < 3; j++){
                tictactoe[i][j] = "";
            }
        }

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text1.setText(player_1);
                    textIn1 = text1.getText().toString();
                    tictactoe[0][0] = textIn1;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text1.setText(player_2);
                    textIn1 = text1.getText().toString();
                    tictactoe[0][0] = textIn1;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){
                    Log.v("MainActivity",e.toString());
                }
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text2.setText(player_1);
                    textIn2 = text2.getText().toString();
                    tictactoe[0][1] = textIn2;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text2.setText(player_2);
                    textIn2 = text2.getText().toString();
                    tictactoe[0][1] = textIn2;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text3.setText(player_1);
                    textIn3 = text3.getText().toString();
                    tictactoe[0][2] = textIn3;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text3.setText(player_2);
                    textIn3 = text3.getText().toString();
                    tictactoe[0][2] = textIn3;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text4.setText(player_1);
                    textIn4 = text4.getText().toString();
                    tictactoe[1][0] = textIn4;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text4.setText(player_2);
                    textIn4 = text4.getText().toString();
                    tictactoe[1][0] = textIn4;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text5.setText(player_1);
                    textIn5 = text5.getText().toString();
                    tictactoe[1][1] = textIn5;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text5.setText(player_2);
                    textIn5 = text5.getText().toString();
                    tictactoe[1][1] = textIn5;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" +score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text6.setText(player_1);
                    textIn6 = text6.getText().toString();
                    tictactoe[1][2] = textIn6;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text6.setText(player_2);
                    textIn6 = text6.getText().toString();
                    tictactoe[1][2] = textIn6;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text7.setText(player_1);
                    textIn7 = text7.getText().toString();
                    tictactoe[2][0] = textIn7;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text7.setText(player_2);
                    textIn7 = text7.getText().toString();
                    tictactoe[2][0] = textIn7;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" +score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text8.setText(player_1);
                    textIn8 = text8.getText().toString();
                    tictactoe[2][1] = textIn8;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text8.setText(player_2);
                    textIn8 = text8.getText().toString();
                    tictactoe[2][1] = textIn8;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1_playing_status) {
                    text9.setText(player_1);
                    textIn9 = text9.getText().toString();
                    tictactoe[2][2] = textIn9;
                    player1_playing_status = false;
                    player2_playing_status = true;
                    chance.setText(chance2);
                }
                else{
                    text9.setText(player_2);
                    textIn9 = text9.getText().toString();
                    tictactoe[2][2] = textIn9;
                    player1_playing_status = true;
                    player2_playing_status = false;
                    chance.setText(chance1);
                }
                try {
                    if (!tictactoe[0][0].equals("") && !tictactoe[0][1].equals("") && !tictactoe[0][2].equals("") && !tictactoe[1][0].equals("") && !tictactoe[1][1].equals("") && !tictactoe[1][2].equals("") && !tictactoe[2][0].equals("") && !tictactoe[2][1].equals("") && !tictactoe[2][2].equals(""))
                    {
                        // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        if ((tictactoe[0][0].equals(player_1) && tictactoe[0][1].equals(player_1) && tictactoe[0][2].equals(player_1)) ||  (tictactoe[1][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[1][2].equals(player_1)) || (tictactoe[2][0].equals(player_1) && tictactoe[2][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][0].equals(player_1) && tictactoe[2][0].equals(player_1)) || (tictactoe[0][1].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][1].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][2].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][0].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][2].equals(player_1)) || (tictactoe[0][2].equals(player_1) && tictactoe[1][1].equals(player_1) && tictactoe[2][0].equals(player_1))){
                            Toast.makeText(MainActivity.this, "Player 1 Won", Toast.LENGTH_SHORT).show();
                            score1 += 1;
                            player1Score.setText("" + score1);
                        }                                 // 1st row of the matrix                                                                                       // 2nd row of the matrix                                                                                    // 3rd row of the matrix                                                                                            // 1st column of the matrix                                                                                     // 2nd column of the matrix                                                                                     // 3rd column of the matrix                                                                                 // Left Diagonal                                                                                                    // Right diagonal
                        else if ((tictactoe[0][0].equals(player_2) && tictactoe[0][1].equals(player_2) && tictactoe[0][2].equals(player_2)) ||  (tictactoe[1][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[1][2].equals(player_2)) || (tictactoe[2][0].equals(player_2) && tictactoe[2][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][0].equals(player_2) && tictactoe[2][0].equals(player_2)) || (tictactoe[0][1].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][1].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][2].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][0].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][2].equals(player_2)) || (tictactoe[0][2].equals(player_2) && tictactoe[1][1].equals(player_2) && tictactoe[2][0].equals(player_2))){
                            Toast.makeText(MainActivity.this, "Player 2 Won", Toast.LENGTH_SHORT).show();
                            score2 += 1;
                            player2Score.setText("" + score2);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "There is tie", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){}
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                score1 = 0;
//                score2 = 0;
                TextView [] textViews = {text1,text2,text3,text4,text5,text6,text7,text8,text9};
                for(TextView item : textViews){
                    item.setText("");
                }
                for(int i = 0; i <3 ;i++){
                    for (int j = 0;j < 3; j++){
                        tictactoe[i][j] = "";
                    }
                }
                chance.setText(chance1);
                player1_playing_status = true;
                player2_playing_status = false;
            }
        });
    }
}
