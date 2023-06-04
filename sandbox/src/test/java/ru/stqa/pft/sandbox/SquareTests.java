package ru.stqa.pft.sandbox;

import org.testng
public class SquareTests {
    public void testArea () {
        Square s = new Square(5);
        assert s.Kvadrat() == 25;
    }
}
