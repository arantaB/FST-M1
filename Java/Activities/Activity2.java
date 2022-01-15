package Activities;

public class Activity2 {

    public static void main(String[] args) {
        int sum = 0;
        int total = 30;
        int[] numberList = {10, 77, 10, 54, -11, 10};

        for (int i = 0; i < 6; i++) {
            if (numberList[i] == 10) {
                sum += numberList[i];
            }
        }

        if(sum == total)
        {
            System.out.println("The condition is true.");
        }
        else
        {
            System.out.println("The condition is false.");
        }
    }
}
