package com.company;

public class Circle extends Shape {
    int radius;

    // Constructors
    public Circle() {
        Point p1 = new Point(2,3);
        radius = 5;
        System.out.println("Circle Point X = " + p1.x + " Y = " + p1.y);
        System.out.println("Circle Radius R = " + radius);
    }

    public Circle(Point p1) {
        radius = 5;
        System.out.println("Circle Point X = " + p1.x + " Y = " + p1.y);
        System.out.println("Circle Radius R = " + radius);
    }
}
