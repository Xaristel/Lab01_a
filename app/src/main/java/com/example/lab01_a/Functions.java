package com.example.lab01_a;

/**
 * Class with special functions
 */
public class Functions
{
    /**
     * The special function for comparing int values
     * @param firstNumber - The first number for comparing
     * @param secondNumber - The second number for comparing
     * @return - Return the lowest number
     */
    protected int FindMin(int firstNumber, int secondNumber)
    {
        if (secondNumber <= firstNumber)
        {
            return secondNumber;
        }
        else
        {
            return firstNumber;
        }
    }

    /**
     * The special function for comparing int values
     * @param firstNumber - The first number for comparing
     * @param secondNumber - The second number for comparing
     * @return - Return the greatest number
     */
    protected int FindMax(int firstNumber, int secondNumber)
    {
        if (firstNumber >= secondNumber)
        {
            return firstNumber;
        }
        else
        {
            return secondNumber;
        }
    }
}
