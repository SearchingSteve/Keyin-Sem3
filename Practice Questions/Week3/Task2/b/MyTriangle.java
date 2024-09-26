package Task2.b;

import Task2.a.MyPoint; // Importing the MyPoint class to use for the triangle vertices

public class MyTriangle {
    // Instance variables to store the vertices of the triangle
    private MyPoint v1; // Vertex 1 of the triangle
    private MyPoint v2; // Vertex 2 of the triangle
    private MyPoint v3; // Vertex 3 of the triangle

    // Constructor that initializes the triangle with coordinates for each vertex
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1); // Create a new MyPoint for vertex 1
        this.v2 = new MyPoint(x2, y2); // Create a new MyPoint for vertex 2
        this.v3 = new MyPoint(x3, y3); // Create a new MyPoint for vertex 3
    }

    // Constructor that initializes the triangle with MyPoint objects for each vertex
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1; // Set vertex 1 to the provided MyPoint
        this.v2 = v2; // Set vertex 2 to the provided MyPoint
        this.v3 = v3; // Set vertex 3 to the provided MyPoint
    }

    // toString method to provide a string representation of the triangle
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]"; // Return the vertices in string format
    }

    // Method to calculate the perimeter of the triangle
    public double getPerimeter() {
        // Sum the distances between each pair of vertices to get the perimeter
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    // Method to determine the type of triangle based on the lengths of its sides
    public String printType() {
        double side1 = v1.distance(v2); // Calculate the length of side 1
        double side2 = v2.distance(v3); // Calculate the length of side 2
        double side3 = v3.distance(v1); // Calculate the length of side 3

        // Determine the type of triangle based on the lengths of the sides
        if (side1 == side2 && side2 == side3) {
            return "Equilateral"; // All sides are equal
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles"; // At least two sides are equal
        } else {
            return "Scalene"; // All sides are different
        }
    }
}
