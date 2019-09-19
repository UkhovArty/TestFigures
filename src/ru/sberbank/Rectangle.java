package ru.sberbank;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Rectangle  {
    public Double area(Double parameter_1,Double parameter_2) {
        Double i;
        i = parameter_1 * parameter_2;
        return i;
    }
    @Test
    public void area() {
        Double parameter_1 = 13.8;
        Double parameter_2 = 9.4;
        Double expected = 129.72;
        Double actual = area(parameter_1, parameter_2);
        Assert.assertEquals(expected,actual);
    }
}

