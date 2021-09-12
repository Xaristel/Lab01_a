package com.example.lab01_a;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest
{
    @Test
    public void Test_1()
    {
        Functions functions = new Functions();

        assertEquals(1, functions.FindMin(1, 2));
        assertEquals(0, functions.FindMin(0, 0));
        assertEquals(4, functions.FindMin(4, 70));
        assertEquals(-1, functions.FindMin(-1, 3));

        assertEquals(123, functions.FindMax(123, 2));
        assertEquals(-95, functions.FindMax(-100, -95));
        assertEquals(0, functions.FindMax(0, -1));
        assertEquals(2, functions.FindMax(1, 2));

    }
}