package solid.interfaces;

import solid.interfaces.Shape;

import java.util.List;

/**
 * Implenetation de Open for Extension closed for Modif
 */

public interface IAreaCalculator {
    int sum(List<Shape> shapes);
}
