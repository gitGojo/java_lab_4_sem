// A class called Employee, which models an employee with an ID, name and
// salary, is designed as shown in the following class diagram. The method
// raiseSalary (percent) increases the salary by the given percentage. Develop the
// Employee class and suitable main method for demonstration.

import java.util.*;
public class Employee
{
    int eid;
    String ename;
    float salary;
    float perc;
    public void raiseSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage:");
        perc = sc.nextFloat();
        float newSal = salary+(salary*(perc/100));
        System.out.printf("The raise in salary is %f",newSal);
    }
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.eid=1001;
        e1.ename="Hima";
        e1.salary = 45000;
        e1.raiseSalary();
    }
}