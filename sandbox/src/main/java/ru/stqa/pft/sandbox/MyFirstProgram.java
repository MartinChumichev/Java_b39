package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        nazvanieFunction("world");
        nazvanieFunction("hi");
        nazvanieFunction("ppc");

        Sqare s = new Sqare(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.Kvadrat());

        Rectangle r = new Rectangle(5, 10);

        System.out.println("Площадь Прямоугольника со стороной " + r.a + " и " + r.b + " Равна " + r.Pryamoygolnik());
    }
    public static void nazvanieFunction(String tipoWorld) {

        System.out.println("Hello, " + tipoWorld + "!");
    }


}


