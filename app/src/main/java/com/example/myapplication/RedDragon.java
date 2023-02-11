package com.example.myapplication;

public class RedDragon extends Player{
    int FireAttack = 200;
    int Protection = 750;

    @Override
    void buttleTo(Player bot) {
        if (bot.Protection > 0) {
            if (Protection <= 700 || Protection >= 575) {
                bot.Health -= FireAttack / 20;
                bot.Protection -= FireAttack * 0.15 * 2;
            }
            if (Protection <= 574 || Protection >= 250) {
                bot.Health -= FireAttack / 40;
                bot.Protection -= FireAttack * 0.2 * 5;
            }
            if (Protection < 250) {
                bot.Health -= FireAttack / 45;
                bot.Protection -= FireAttack * 0.25 * 8;
            }
        } else {
            bot.Health -= FireAttack / 60;
        }
    }
}
