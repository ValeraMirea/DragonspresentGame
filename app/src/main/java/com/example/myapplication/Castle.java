package com.example.myapplication;

public class Castle extends Player{

    int Protection = 3000;
    int Attack = 120;

    @Override
    void buttleTo(Player bot) {
        if (bot.Protection > 0){
            if (Protection <= 700 || Protection >= 575){
                bot.Health -=Attack / 20;
                bot.Protection -= Attack * 0.15;
            }
            if (Protection <= 574 || Protection >= 250){
                bot.Health -=Attack / 40;
                bot.Protection -= Attack * 0.2;
            }
            if (Protection < 250){
                bot.Health -=Attack / 45;
                bot.Protection -= Attack * 0.25;
            }
        }
        else {
            bot.Health -=Attack / 55;
        }
    }
}
