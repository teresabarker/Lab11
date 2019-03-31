package com.company;

public class Triangle extends Shape {

    // Constructors
    public Triangle() {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(6, 3);
        System.out.println("Triangle");
        System.out.println("Triangle Points:");
        System.out.println("   X1 = " + p1.x + ", Y1 = " + p1.y);
        System.out.println("   X2 = " + p2.x + ", Y2 = " + p2.y);
        System.out.println("   X3 = " + p3.x + ", Y3 = " + p3.y + "\n");
    }

    public Triangle(Point p1, Point p2, Point p3) {
        System.out.println("Triangle");
        System.out.println("Triangle Points:");
        System.out.println("   X1 = " + p1.x + ", Y1 = " + p1.y);
        System.out.println("   X2 = " + p2.x + ", Y2 = " + p2.y);
        System.out.println("   X3 = " + p3.x + ", Y3 = " + p3.y + "\n");
    }
}
