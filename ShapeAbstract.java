// Develop a JAVA program to create an abstract class Shape with abstract methods
// calculateArea() and calculatePerimeter().
// Create subclasses Circle and Triangle that extend the Shape class and Implement
// the respective methods to calculate the area and perimeter of each shape.

abstract class Shape
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape
{
    double side1;
    double side2;
    double side3;
    Triangle(double side1,double side2,double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    public double calculateArea()
    {
        double s = ((side1+side2+side3)/2);
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double calculatePerimeter()
    {
        return side1+side2+side3;
    }
}
public class ShapeAbstract
{
    public static void main(String args[])
    {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Area of circle is "+ circle.calculateArea());
        System.out.println("Permieter of circle is "+ circle.calculatePerimeter());
        System.out.println();
        System.out.println("Area of triangle is "+ triangle.calculateArea());
        System.out.println("Permieter of triangle is "+ triangle.calculatePerimeter());
    }
}