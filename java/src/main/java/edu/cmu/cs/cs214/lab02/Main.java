package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Renderer renderer1 = new Renderer(rectangle);
        renderer1.draw();

        Shape circle = new Circle(4);
        Renderer renderer2 = new Renderer(circle);
        renderer2.draw();

        Shape square = new Square(5);
        Renderer renderer3 = new Renderer(square);
        renderer3.draw();
    }
}
