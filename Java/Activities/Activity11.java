package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> colours = new HashMap<Integer,String>();

        colours.put(1,"Blue");
        colours.put(2,"Grey");
        colours.put(3,"Pink");
        colours.put(4,"Black");
        colours.put(5,"White");

        //Removing one item from hashmap
        colours.remove(5);
        System.out.println("The hash map after removing : " +colours);

        if(colours.containsValue("Green"))
        {
            System.out.println("The value is present in the hashmap");
        }
        else {
            System.out.println("The value is not present in the hashmap");
        }

        System.out.println("The size of the hashmap is : " +colours.size());


    }
}
