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
    //Use case 4
    public void toCheckWinLoseAmount()
    {
        // Assume 100 bets played every day
        int NO_OF_BETS = 100;
        //margin = 50%
        double upper_margin = 0.5*INITIAL_STAKE;
        double lower_margin = -0.5*INITIAL_STAKE;
        double total_amount_won_lost = 0;

        // Game played for 20 days
        for (int i=0;i<20;i++)
        {
            double daily_amount_won_lost = 0;
            int bets_played = 0;

            // Everyday game stops at 50% margin
            while ((daily_amount_won_lost < upper_margin) && (daily_amount_won_lost > lower_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;

                if (random_num > 0.5)
                {
                    daily_amount_won_lost += BET_AMT;
                }
                else if (random_num <= 0.5)
                {
                    daily_amount_won_lost -= BET_AMT;
                }
            }
            total_amount_won_lost += daily_amount_won_lost;
        }

        // Print total amount won or last in 20 days
        if (total_amount_won_lost > 0)
        {
            System.out.println("The total amount won in 20 days = "+ total_amount_won_lost);
        }
        else if (total_amount_won_lost == 0)
        {
            System.out.println("There is no net gain in last 20 days");
        }
        else if (total_amount_won_lost < 0)
        {
            System.out.println("The total amount lost in last 20 days = "+ Math.abs(total_amount_won_lost));
        }
    }

    public static void main(String[] args)
    {
        GamblerProblem gamblerProblem = new GamblerProblem();
        gamblerProblem.checkWinLose();
        gamblerProblem.resignsDay();
        gamblerProblem.toCheckWinLoseAmount();
    }

}
