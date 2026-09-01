package org.example;

import org.example.geometry.Circle;
import org.example.geometry.Rectangle;
import org.example.geometry.Triangle;
import org.example.threeDimensionalShapes.Cube;
import org.example.threeDimensionalShapes.Sphere;

public class GeometryClient {
    public static void main(String[] args) {

        Circle circle = new Circle(20.0);
        double circleSquare = circle.getSquare();
        double circlePerimeter = circle.getPerimeter();

        System.out.println(circleSquare);
        System.out.println(circlePerimeter);

        Rectangle rectangle = new Rectangle(14.0, 16.0);
        double rectangleSquare = rectangle.getSquare();
        double rectanglePerimeter = rectangle.getPerimeter();

        System.out.println(rectangleSquare);
        System.out.println(rectanglePerimeter);

        Triangle triangle = new Triangle(3.0, 5.0, 6.0);
        double triangleSquare = triangle.getSquare();
        double trianglePerimeter = triangle.getPerimeter();

        System.out.println(triangleSquare);
        System.out.println(trianglePerimeter);

        Cube cube = new Cube(3.0);
        double volumeCube = cube.getVolume();
        double surfaceAreaCube = cube.getSurfaceArea();

        System.out.println(volumeCube);
        System.out.println(surfaceAreaCube);

        Sphere sphere = new Sphere(6.0);
        double volumeSphere = sphere.getVolume();
        double surfaceAreaSphere = sphere.getSurfaceArea();

        System.out.println(volumeSphere);
        System.out.println(surfaceAreaSphere);
    }
}
