package  solid;

import solid.interfaces.Shape;

/**
 * Using Open Closed Principe
 * with implement a shape interface
 */

public class Circle implements Shape {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2) ;
    }
}