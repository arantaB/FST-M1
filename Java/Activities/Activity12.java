package Activities;

public class Activity12 {

    public static void main(String[] args)
    {
        Addable ad1 = (a,b) -> (a +b);
        System.out.println("The sum of two numbers using 1st expression :" + ad1.add(10,20));

        Addable ad2 = (int a, int b) -> {return (a+b);};
        System.out.println("The sum of two numbers using 2nd expression :" + ad2.add(20,30));
    }
}
