package myshapeinterface;

import java.util.Scanner;

public class MyShapeInterface {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base;
        double height;
        double width;
        double length;

        System.out.println("enter base");
        base = input.nextDouble();
        System.out.println("enter height");
        height = input.nextDouble();
        Triangle object1 = new Triangle(base, height);

        System.out.println("Enter width");
        width = input.nextDouble();
        System.out.println("Enter length");
        length = input.nextDouble();
        Rectangle object2 = new Rectangle(width, length);

        System.out.println("Area of triangle: " + object1.calcArea());
        System.out.println("Area of Rectangle: " + object2.calcArea());

    }

}

interface Shape {

    //Declaring Abstract Methods
    public abstract void draw();

    public abstract void colorMe();

    public abstract double calcArea();
}

class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {

    }

    @Override
    public void colorMe() {

    }

    @Override
    public double calcArea() {

        return this.length * this.width;
    }

}

class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {

    }

    @Override
    public void colorMe() {

    }

    @Override
    public double calcArea() {

        return 0.5 * this.base * this.height;
    }

}
