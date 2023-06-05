package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        nazvanieFunction("world");
        nazvanieFunction("hi");
        nazvanieFunction("ppc");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.Square());

        Rectangle r = new Rectangle(5, 10);

        System.out.println("Площадь Прямоугольника со стороной " + r.a + " и " + r.b + " Равна " + r.Pryamoygolnik());
    }
    public static void nazvanieFunction(String tipoWorld) {

        System.out.println("Hello, " + tipoWorld + "!");
    }


}


