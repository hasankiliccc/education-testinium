package model.polymorphism;

public interface Shape {

    double areaCalculate();

    default double perimeterCalculate() {
        return areaCalculate();

    }
}
