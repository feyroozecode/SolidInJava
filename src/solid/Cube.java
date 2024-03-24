package solid;

import solid.interfaces.Shape;
import solid.interfaces.ThreeDimensionnalShape;

/**
 * Using a Interface segregation , we don't force a non ThreeDimensionnal
 * To implement a Shape with Volume, we create a new interface like ThreeDimensionnalShape
 * and implement the Cube for this
 */

public class Cube implements Shape, ThreeDimensionnalShape {

    @Override
    public double area() {
        return 100;
    }


    @Override
    public double volume() {
        return 0;
    }
}
