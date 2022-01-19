package Activities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("Monica");
        hs.add("Chandler");
        hs.add("Rachel");
        hs.add("Ross");
        hs.add("Phoebe");
        hs.add("Joey");

        System.out.println("The size of the hashset 'hs' is : " + hs.size());

        //Removing an element from hashset
        hs.remove("Ross");

        //Removing an item that is not present in the set
        if(hs.remove("Janice"))
        {
            System.out.println("The name is removed in hashset");
        }
        else {
            System.out.println("The name is not present in hashset to be removed");
        }

        //To check if the item is present in the set
        if(hs.contains("Emily"))
        {
            System.out.println("The name is present in hashset");
        }
        else {
            System.out.println("The name is not present in hashset");
        }


        for (String item :hs)
        {
            System.out.println("\nThe updated set is : " + item);
        }

    }
}
