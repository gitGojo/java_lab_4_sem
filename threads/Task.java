public class Task implements Runnable
{
    String threadname;
    int time;
    public Task(String threadname,int time)
    {
        this.threadname = threadname;
        this.time = time;
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.printf("Executing of task " + i +" of " +  this.threadname);
                System.out.println();
                Thread.sleep(this.time);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Task interupted " + e.getMessage());
        }
        finally
        {
            System.out.println(this.threadname + " has been executed successfully");
        }
    }
}