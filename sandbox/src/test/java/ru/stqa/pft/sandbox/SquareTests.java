package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SquareTests {
    public void testSquare() {
        Square s = new Square(5);
        Assert.assertEquals(s.Square(), 25);

    }
}
