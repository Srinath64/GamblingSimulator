package com.company;

public class Gambler {

    int stake = 100;
    int LOSE = 0;
    int WIN = 1;

    public static void main (String[] args) {
         Gambler gambler = new Gambler();
         int trial = (int) Math.floor(Math.random()* 10 ) % 2;

        if ( trial == 0){
            gambler.stake = gambler.stake -1;
            System.out.println(" "+gambler.stake);
        }
        else
        {
            gambler.stake = gambler.stake +1;
            System.out.println(" "+gambler.stake);
        }
    }

    }

