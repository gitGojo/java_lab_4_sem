// Develop a JAVA program to create a class named Shape.
// Create a three subclasses namely: draw() and erase()
// Demonstrate polymorphism concepts by developing suitable methods,defining member
// data, and the main program

class Shape
{
    public void draw()
    {
        System.out.println("Drawing Shape");
    }
    public void erase()
    {
        System.out.println("Erasing Shape");
    }
}
class Triangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }
    @Override
    public void erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Circle");
    }
    @Override
    public void erase()
    {
        System.out.println("Erasing Circle");
    }
}
class Square extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Square");
    }
    @Override
    public void erase()
    {
        System.out.println("Erasing Square");
    }
}
public class Main
{
public static void main(String args[])
{
    Shape s1 = new Triangle();
    Shape s2 = new Circle();
    Shape s3 = new Square();

    s1.draw();
    s1.erase();
    s2.draw();
    s2.erase();
    s3.draw();
    s3.erase();
}
}

