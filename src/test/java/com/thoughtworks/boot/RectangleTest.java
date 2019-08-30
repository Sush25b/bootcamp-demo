package com.thoughtworks.boot;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest
{
    @Test
    void givenLengthAndWidthValueBeZero_whenCalculate_ReturnZero()
    {
        int length=0,width=0;
        Rectangle rectangle=new Rectangle();
        Assertions.assertEquals(0,rectangle.calculateArea(length,width));
    }
}
