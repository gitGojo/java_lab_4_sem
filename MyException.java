public class MyException extends Exception
{
    String detail;
    public MyException(String detail)
    {
        this.detail = detail;
    }
    public String toString()
    {
        return "Exception :" + detail;
    }
}