package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();

        //To accept numbers from console
        System.out.println("Enter the numbers : ");

        while (scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[20]);
        int number = indexGen.nextInt(nums.length);

        //To print the index value and value in the array
        System.out.println("Index value : " + number);
        System.out.println("Value in array: " + nums[number]);

        scan.close();
    }
}
