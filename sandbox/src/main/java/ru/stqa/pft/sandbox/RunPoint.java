package ru.stqa.pft.sandbox;


public class RunPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(3, 7);
        System.out.println("Точка 1 с координатами (" + p1.x + ";" + p1.y + ") и Точка 2 с координатами (" + p2.x + ";" + p2.y + ")");
        System.out.println("Расстояние между точками = " + p1.distance(p2));

    }

}
