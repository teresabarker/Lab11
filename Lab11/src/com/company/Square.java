package com.company;

public class Square extends Shape {

    // Constructors
    public Square() {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,6);
        System.out.println("Square");
        System.out.println("Square Points:);");
        System.out.println("   X1 = " + p1.x + ", Y1 = " + p1.y);
        System.out.println("   X2 = " + p2.x + ", Y2 = " + p2.y + "\n");
    }

    public Square(Point p1, Point p2) {
        System.out.println("Square");
        System.out.println("Square Points:);");
        System.out.println("   X1 = " + p1.x + ", Y1 = " + p1.y);
        System.out.println("   X2 = " + p2.x + ", Y2 = " + p2.y + "\n");
    }
}
