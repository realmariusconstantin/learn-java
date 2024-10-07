
package io.github.realmariusconstantin;


import io.github.realmariusconstantin.data.Circle;
import io.github.realmariusconstantin.data.GeometricObject;
import io.github.realmariusconstantin.data.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("L06 - Inheritance Example");

        var geometricObject1 = new GeometricObject();
        System.out.println("geometricObject1 " + geometricObject1);

        var geometricObject2 = new GeometricObject();
        System.out.println("geometricObject2 " + geometricObject2);

        var circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);

        var circle2 = new Circle(7);
        System.out.println("Circle 2 " + circle2);
        System.out.println("Circle 2 has a perimeter of " + circle2.getPerimeter());

        var rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 " + rectangle1);

        var rectangle2 = new Rectangle(4, 5);
        System.out.println("Rectangle 2 " + rectangle2);


    }
}
