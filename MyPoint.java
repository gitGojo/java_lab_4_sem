// Develop a JAVA program to create a class called MyPoint, which models a 2D point with x and y coordinates, as follows:

// a. Two instance variables x (int) and y (int).

// b. A default (or "no-arg") constructor that constructs a point at the default location (0,0).

// c. An overloaded constructor that constructs a point with the given x and y coordinates.

// d. A method setXY() to set both x and y.

// e. A method getXY() that returns the x and y in a 2-element int array.

// f. A toString() method that returns a string description of the instance in the format "(x,y)".

// g. A method distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates.

// h. An overloaded method distance(MyPoint another) that returns the distance from this point to the given MyPoint instance.

// i. Another overloaded method distance() that returns the distance from this point to the origin (0,0).

// Develop the code for the class MyPoint. Also, develop a JAVA program (called TestMyPoint) to test all the methods defined in the class.

class MyPoint
{
    int x;
    int y;
    MyPoint()
    {
        this.x=0;
        this.y=0;
    }
    MyPoint(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setXY(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int[] getXY()
    {
        int arr[] = new int[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public String toString()
    {
        return "( "+ x + " , "+ y +  " )";
    }
    public double distance(int x,int y)
    {
        int dx= this.x - x;
        int dy = this.y -y;
        return Math.sqrt((dx*dx)+(dy*dy));  
    }
    public double distance(MyPoint another)
    {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
    public double distance()
    {
        return Math.sqrt((x*x)+(y*y));
    }
    public static void main(String args[])
    {
        MyPoint p1 = new MyPoint();
        System.out.println("p1: "+ p1);
        MyPoint p2 = new MyPoint(2,3);
        System.out.println("p2: "+ p2);
        p1.setXY(1,5);
        System.out.println("p1: "+ p1);
        int arr[]=p1.getXY();
        System.out.println("x = "+ arr[0] + " y = "+ arr[1]);
        System.out.println("( "+ arr[0] + " , "+ arr[1] +  " )");
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance());
    }
}