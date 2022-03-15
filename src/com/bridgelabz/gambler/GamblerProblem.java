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

    public static void main(String[] args)
    {
        GamblerProblem gamblerProblem = new GamblerProblem();
        gamblerProblem.checkWinLose();
    }

}
