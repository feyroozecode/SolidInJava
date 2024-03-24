package solid;

import solid.interfaces.IAreaCalculator;
import solid.interfaces.Shape;

import java.util.List;

/**
 * Application Of Single Responsablility and
 * Open Closed for calculating the sum of shape
 */

public class AreaCalculator implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++) {
           sum += shapes.get(i).area();
        }
        return sum;
    }
}