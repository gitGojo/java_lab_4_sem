package mypack;

public class Calculator
{
    int a;
    int b;
//default constructor
    public Calculator()
    {
        this.a=20;
        this.b=10;
    }
// parameterized constructor
    public Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.printf("Sum : %d\n",a+b);
    }
    public void sub()
    {
        System.out.printf("Difference : %d\n",a-b);
    }
    public void mul()
    {
        System.out.printf("Product : %d\n",a*b);
    }
    public void div()
    {
        System.out.printf("Quotient : %d\n",a/b);
    }
}