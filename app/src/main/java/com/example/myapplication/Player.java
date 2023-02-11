package com.example.myapplication;

public class Player {
    int Health = 500;
    int Protection = 700;
    int Attack = 250;

    Player(){

    }
    Player(int health, int protection, int attack){
        Health = health;
        this.Protection = protection;
        Attack = attack;
    }
    void buttleTo(Player bot){
        if(bot.getClass() == RedDragon.class){
            bot.Health -=Attack / 20;
            bot.Protection -= Attack * 0.3;
        }
        else {
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
            System.out.println(bot.getClass() + " " + Attack);
            System.out.println(bot.getClass() + " " + Protection);
        }
    }
}
