package me.study.Factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // Circle 메소드 호출
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        // Rectangle 메소드 호출
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        // Square 메소드 호출
        shape3.draw();
    }
}
