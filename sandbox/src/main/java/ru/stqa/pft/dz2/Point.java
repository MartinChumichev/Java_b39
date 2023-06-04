package ru.stqa.pft.dz2;

public class Point {
    public double A1, A2, B1, B2;

    public Point(double A1, double A2, double B1, double B2) {
        this.A1 = A1;
        this.A2 = A2;
        this.B1 = B1;
        this.B2 = B2;
    }

    public double distance() {

        double a = Math.pow((this.A2 - this.A1), 2);
        double b = Math.pow((this.B2 - this.B1), 2);
        return Math.sqrt(a + b);
    }
}
