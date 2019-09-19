package ru.sberbank;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class Circle extends Figure {
    @Override
    public Double area(Double parameter_1) {
        Double i;
        i = (PI * parameter_1 * parameter_1);
        return i;
    }

    @Test
    public void area() {
        Double parameter_1 = 13.8;
        Double expected = 598.2849049496402;
        Double actual = area(parameter_1);
        Assert.assertEquals(expected,actual);
    }
}
