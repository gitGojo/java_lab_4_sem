package mypackaccess;
import mypack.Calculator;
public class CalculatorDemo
{
    public static void main(String args[])
    {
        Calculator c1 = new Calculator();
        System.out.println("Using default constructor");
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();

        Calculator c2 = new Calculator(40,20);
        System.out.println("Using parameterized constructor");
        c2.add();
        c2.sub();
        c2.mul();
        c2.div();
    }
}

// commands to run java
// javac mypack/Calculator.java mypackaccess/CalculatorDemo.java
// java mypackaccess.CalculatorDemo