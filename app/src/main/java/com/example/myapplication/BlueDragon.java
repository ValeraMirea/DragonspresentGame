package com.example.myapplication;

public class BlueDragon extends Player{
    int WaterAttack = 215;
    int Protection = 750;

    @Override
    void buttleTo(Player bot) {
        if (bot.Protection > 0){
            if (Protection <= 700 || Protection >= 575){
                bot.Health -=WaterAttack / 20 * 2;
                bot.Protection -= WaterAttack * 0.12 * 2;
            }
            if (Protection <= 574 || Protection >= 250){
                bot.Health -=WaterAttack / 40 * 2;
                bot.Protection -= WaterAttack * 0.15 * 5;
            }
            if (Protection < 250){
                bot.Health -=WaterAttack / 45 * 2;
                bot.Protection -= WaterAttack * 0.25 * 8;
            }
        }
        else {
            bot.Health -=WaterAttack / 75;
        }
    }
}
