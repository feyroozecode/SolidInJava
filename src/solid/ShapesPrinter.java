package solid;

import solid.interfaces.IAreaCalculator;
import solid.interfaces.Shape;

import java.util.List;

/**
 * Using Single Responsability
 * print only with @sum with different format json, csv etc..
 * Appel aussi un object utilisant le Dependency inversion "AreaCalculator"
 * Pas besoin de modification dans AreaCalculator, mais est appeler juste comme extension
 * ici en initialisant le AreaCalculator pour faire un calcule et retourner le resultat
 * ALSO Using Dependency Injection with callng IAreaCalculator
 */

public class ShapesPrinter {

    private final IAreaCalculator iAreaCalculator;

    public ShapesPrinter(IAreaCalculator iAreaCalculator){
        this.iAreaCalculator = iAreaCalculator;
    }

    private AreaCalculator areaCalculator =
            new AreaCalculator();

    public String toJson(List<Shape> shapes) {

        return "\n{sahpesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String toCsv(List<Shape> shapes){
        return "\nshapes_sum %s".formatted(areaCalculator.sum(shapes));
    }

}
