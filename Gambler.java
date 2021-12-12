package com.company;

public class Gambler {

    final int WON =1;
    final int LOSS = 0;
    final int STAKE = 100;
    final int BET_AMOUNT = 1;
    final int DAILY_RESIGN_PERC = 50;

    int dailyBetAmount = STAKE;
    int maxTotalDailyAmount = ((STAKE + STAKE * DAILY_RESIGN_PERC / 100));
    int minTotalDailyAmount = ((STAKE - STAKE * DAILY_RESIGN_PERC / 100));


    }

