package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DistanceTests {
    public void testPoint() {
        Point p = new Point(1, 1, 2, 2);
        Assert.assertEquals(p.distance(), 0);

    }
}
