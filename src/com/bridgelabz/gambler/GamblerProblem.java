package com.bridgelabz.gambler;

public class GamblerProblem
{
    //Use case 1
    public static final int INITIAL_STAKE = 100;
    public static final int BET_AMT = 1;

    //Use Case 2
    public void checkWinLose()
    {
        double random_num = Math.random();

        if (random_num > 0.5)
        {
            System.out.println("The Gambler wins the bet.");
        }
        else if (random_num <= 0.5)
        {
            System.out.println("The Gambler loses the bet.");
        }
    }
    //Use case 3
    public void resignsDay()
    {
        int margin_perfect = 0;
        double upper_margin = INITIAL_STAKE + margin_perfect*INITIAL_STAKE/100;
        double lower_margin = INITIAL_STAKE - margin_perfect*INITIAL_STAKE/100;
        double available_amount = INITIAL_STAKE;
        while ((available_amount < upper_margin) && (available_amount > lower_margin))
        {
            double random_num = Math.random();
            if (random_num > 0.5)
            {
                available_amount += BET_AMT;
            }
            else if (random_num <= 0.5)
            {
                available_amount -= BET_AMT;
            }
        }
        System.out.println("The gambler resigns for the day after he has $"
                + available_amount + " with him.");
    }

    public static void main(String[] args)
    {
        GamblerProblem gamblerProblem = new GamblerProblem();
        gamblerProblem.checkWinLose();
        gamblerProblem.resignsDay();
    }

}
