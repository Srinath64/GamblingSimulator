package com.company;

import java.util.Random;

public class Gambler {
    static int Every_Day_Stack=100;
    final static int Bet_Every_Game=1;
    static int WinDays=0;
    static int LossDays=0;
    static int Win=0;
    static int Loss=0;

    public static void main(String[] args) {
        System.out.println("Welcome To Gambler Simulator");

        int Stack_Upper = 150;
        int Stack_Lower = 50;
        int Winning = 0;

        for(int days = 1; days <= 30; days++) {
            Every_Day_Stack=100;

            while(Every_Day_Stack > Stack_Lower && Every_Day_Stack < Stack_Upper) {
                Random random = new Random();
                int bet = random.nextInt(2);


                switch(bet) {
                    case 1:
                        Every_Day_Stack += Bet_Every_Game;
                        Win++;
                        break;
                    default:
                        Every_Day_Stack -= Bet_Every_Game;
                        Loss++;
                        break;
                }
            }

            if(Every_Day_Stack == Stack_Upper) {
                WinDays += 1;
                Winning += 50;
            }else {
                LossDays += 1;
                Winning -= 50;
            }


        }
        System.out.println("Total Win Days is : "+WinDays);
        System.out.println("Total Loss Days is : "+LossDays);
        System.out.println("Total Win Price Won In Month Is " +Winning + "\n");
    }
}


