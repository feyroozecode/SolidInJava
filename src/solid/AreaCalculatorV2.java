package solid;

import solid.interfaces.IAreaCalculator;
import solid.interfaces.Shape;

import java.util.List;

/**
 * Application Of Single Responsablility and
 * Open Closed for calculating the sum of shape
 * Implemente la Injection des dependence avec l'interface a chaque ajout de nouelle class pas besoin de
 * modifier AreaCalculator pour par exemple la v1, v2 , v3 etc..
 */

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++) {
           sum += shapes.get(i).area();
        }
        return sum;
    }
}