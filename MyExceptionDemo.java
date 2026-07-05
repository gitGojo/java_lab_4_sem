public class MyExceptionDemo
{
static void compute (int a ,int b) throws MyException
{
    try
    {
        if(b==0)
        {
            throw new MyException("Division by zero");
        }
        else
        {
            System.out.printf("Quotient is %d\n",a/b);
        }
    }
    finally
    {
        System.out.println("Finally block is getting executed\n");
    }
}


public static void main(String args[])
{
    try
    {
        compute(20,0);
    }
    catch(MyException e)
    {
        System.out.println(e);
    }
}
}

// javac MyException.java MyExceptionDemo.java
// java MyExceptionDemo