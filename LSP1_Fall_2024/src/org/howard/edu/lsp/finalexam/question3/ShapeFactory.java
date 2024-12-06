package org.howard.edu.lsp.finalexam.question3;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) return new Circle();
        return null; // Default case
    }
}
