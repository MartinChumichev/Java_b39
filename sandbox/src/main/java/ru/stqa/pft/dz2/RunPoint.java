package ru.stqa.pft.dz2;

public class RunPoint {
    public static void main(String[] args) {
        Point p = new Point(3, -2, 1, 2);

        System.out.println("Точка 1 с координатами (" + p.A1 + ";" + p.A2 + ") и Точка 2 с координатами (" + p.B1 + ";" + p.B2 + ")");
        System.out.println("Расстояние между точками = " + p.distance());
    }

}
