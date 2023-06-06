package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DistanceTests {
    // Релевантные значения координат
    public void testPoint() {
        Point p = new Point(2, 3, 4, 5);
        Assert.assertEquals(p.distance(), 2.8284271247461903);
    }

    // Одинаковые координаты точек
    public void testIdentical() {
        Point p = new Point(1, 1, 1, 1);
        Assert.assertEquals(p.distance(), 0);
    }

    // Дробные координаты
    public void testFraction() {
        Point p = new Point(1.2,7,7.9,11.2);
        Assert.assertEquals(p.distance(), 7.907591289387685);
    }
}
