package CodeAlongHw3;

import lombok.AllArgsConstructor;
import lombok.Data;

public class OpenClosedPrinciple {
    /*
    This principle states that software entities should be opened to
    extension but closed to modification.

    Which means that you should avoid having to modify the logic
    of something on your system when the components are growing.
    */
    public static void main(String[] args) {

    }
}

@Data
@AllArgsConstructor
class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

@Data
@AllArgsConstructor
class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

@Data
@AllArgsConstructor
class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {

    }

}
