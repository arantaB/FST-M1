package Activities;

public class Activity8 {
    public static void main(String[] args)
    {
        try
        {
            exceptionTest("Will print to console!!");
            exceptionTest(null);
        }
        catch (Exception e)
        {
            System.out.println("The error message is " +e);
        }
    }

    public static void exceptionTest(String eMessage) throws CustomException
    {
        if(eMessage == null)
        {
            System.out.println("NULL MESSAGE");
        }
        else
        {
            System.out.println("The message is " +eMessage);
        }
    }
}
