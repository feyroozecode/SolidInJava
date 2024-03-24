package solid;

import solid.interfaces.Shape;

/**
 * Utilise le Princip de Liskov pour les shape null ou inexistant
 * Tout les class fille ou class derivee doit etre substitutable
 * pour leur class de Base ou class Parent
 */
public class NoShape implements Shape {

    @Override
    public double area() {
        throw new IllegalArgumentException(
                "Cannot calculate Area without a Shape"
        );
    }

}
