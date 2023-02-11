package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RedDragon RedDragon = new RedDragon();
    GreenDragon GreenDragon = new GreenDragon();
    BlueDragon BlueDragon = new BlueDragon();
    Castle Castle = new Castle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button battle = findViewById(R.id.Battle);
        TextView result = findViewById(R.id.Result);

        ArrayList<Player> players = new ArrayList<>();
        players.add(RedDragon);
        players.add(GreenDragon);
        players.add(BlueDragon);
        players.add(Castle);

        Random random = new Random();
        random.setSeed(13);

        battle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (RedDragon.Health > 0 && GreenDragon.Health > 0 && BlueDragon.Health > 0 && Castle.Health > 0) {
                    int Player1 = Math.abs(random.nextInt() % 4);
                    int Player2 = 0;
                    do {
                        Player2 = Math.abs(random.nextInt() % 4);
                    }
                    while (Player1 == Player2);
                    players.get(Player1).buttleTo(players.get(Player2));
                }
                if (RedDragon.Health <= 0) {
                    result.setText("RedDragon is lose");
                    System.out.println("RedDragon is lose");
                }
                else if (GreenDragon.Health <= 0) {
                    result.setText("GreenDragon is lose");
                    System.out.println("GreenDragon is lose");
                }
                else if (BlueDragon.Health <= 0){
                    result.setText("BlueDragon is lose");
                    System.out.println("BlueDragon is lose");
                }
                else {
                    result.setText("Castle is destroyed");
                    System.out.println("Castle is destroyed");
                }

                RedDragon = new RedDragon();
                GreenDragon = new GreenDragon();
                BlueDragon = new BlueDragon();
                Castle = new Castle();
                players.clear();
                players.add(RedDragon);
                players.add(GreenDragon);
                players.add(BlueDragon);
                players.add(Castle);
            }
        });
    }
}