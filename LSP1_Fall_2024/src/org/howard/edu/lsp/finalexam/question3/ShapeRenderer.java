package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type");
        }
    }
}
