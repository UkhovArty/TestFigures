package ru.sberbank;

import org.junit.Assert;
import org.junit.Test;

public class Square extends Figure {
    @Override
    public Double area(Double parameter_1) {
        Double i;
        i = Math.pow(parameter_1, 2.0);
        return i;
    }
    @Test
    public void area() {
        Double parameter_1 = 15.0;
        Double expected = Math.pow(15, 2);
        Double actual = area(parameter_1);
        Assert.assertEquals(expected, actual);
    }
}

