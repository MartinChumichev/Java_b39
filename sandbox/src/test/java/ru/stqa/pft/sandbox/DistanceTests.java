package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DistanceTests {
    // Релевантные значения координат
    public void testPoint() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

    // Одинаковые координаты точек
    public void testIdentical() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        Assert.assertEquals(p1.distance(p2), 0);
    }

    // Дробные координаты
    public void testFraction() {
        Point p1 = new Point(1.2, 7);
        Point p2 = new Point(7.9, 11.2);
        Assert.assertEquals(p1.distance(p2), 7.907591289387685);
    }
}
