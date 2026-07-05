public class Main
{
    public static void main(String args[])
    {
        Thread parent = new Thread(new Task("Parent",500));
        Thread child = new Thread(new Task("Child",1200));
        parent.start();
        child.start();
    }
}

//Output
// Executing of task 1 of Parent
// Executing of task 1 of Child
// Executing of task 2 of Parent
// Executing of task 3 of Parent
// Executing of task 2 of Child
// Executing of task 4 of Parent
// Executing of task 5 of Parent
// Executing of task 3 of Child
// Parent has been executed successfully
// Executing of task 4 of Child
// Executing of task 5 of Child
// Child has been executed successfully