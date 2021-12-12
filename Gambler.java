package com.company;

public class Gambler {

    //int stake = 100;
    int LOSE = 0;
    int WIN = 1;

    public static void main (String[] args) {
         Gambler gambler = new Gambler();
         int stake = (int) Math.floor(Math.random()* 10 ) % 2;

       if (stake == stake/2){
            System.out.println("Exit from the Table");
       }
       else
       {
           System.out.println("Continue to Place bets");
       }


    }

    }

