package com.example.lab01_a;

public class Functions
{
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
