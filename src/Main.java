import solid.*;
import solid.interfaces.IAreaCalculator;
import solid.interfaces.Shape;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /// Using dependency Injectjion
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorv2 = new AreaCalculatorV2();

        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        Shape noShape = new NoShape();

        List<Shape> shapes = List.of(
               // noShape,
                circle,
                square,
                cube,
                rectangle
        );
        int sum = areaCalculator.sum(shapes);
        String sumToJson = shapesPrinter.toJson(shapes);
        String sumToCsv = shapesPrinter.toCsv(shapes);

        System.out.println("Result "+ String.valueOf(sum));
        System.out.println("Json Data : "+sumToJson);
        System.out.println("Csv Data : "+ sumToCsv);
    }
}