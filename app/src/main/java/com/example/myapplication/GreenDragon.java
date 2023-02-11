package com.example.myapplication;

public class GreenDragon extends  Player{
    int WindAttack = 170;
    int Protection = 600;

    @Override
    void buttleTo(Player bot) {
        if (bot.Protection > 0){
            if (Protection <= 700 || Protection >= 575){
                bot.Health -=WindAttack / 20 * 2;
                bot.Protection -= WindAttack * 0.15;
            }
            if (Protection <= 574 || Protection >= 250){
                bot.Health -=WindAttack / 25 *2;
                bot.Protection -= WindAttack * 0.2;
            }
            if (Protection < 250){
                bot.Health -=WindAttack / 55;
                bot.Protection -= WindAttack * 0.25;
            }
        }
        else {
            bot.Health -=WindAttack / 50;
        }
    }
}
