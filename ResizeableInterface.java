// Develop a JAVA program to create an interface Resizable with methods resizeWidth(int
// width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that
// implements the Resizable interface and implements the resize methods

interface Resizable
{
    public void resizeWidth(int width);
    public void resizeHeight(int height);
}
class Rectangle implements Resizable
{
    int width;
    int height;
    Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    @Override
    public void resizeWidth(int width)
    {
        if(width>0)
        {
            this.width=width;
        }
        else
        {
            System.out.println("Invalid width");
        }
    }
    @Override
    public void resizeHeight(int height)
    {
        if(height>0)
        {
            this.height=height;
        }
        else
        {
            System.out.println("Invalid height");
        }
    }
    public void display()
    {
        System.out.printf("Width : %d\n",width);
        System.out.printf("Height : %d\n",height);
    }
}
public class ResizeableInterface
{
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle(20,10);
        System.out.println("Original dimensions are: ");
        rectangle.display();
        System.out.println();
        System.out.println("Using resizing properties :");
        rectangle.resizeWidth(30);
        rectangle.resizeHeight(5);
        rectangle.display();
    }
}