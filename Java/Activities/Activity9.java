package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>();

        myList.add("Chandler");
        myList.add("Rachel");
        myList.add("Ross");
        myList.add("Joey");
        myList.add("Monica");

        for (String name:myList)
        {
            System.out.println("The names present are : " +name);
        }

        System.out.println("The name of the 3rd element is :" + myList.get(3));

        if(myList.contains("Janice"))
        {
            System.out.println("The name is present in myList");
        }
        else {
            System.out.println("The name is not present in myList");
        }

        System.out.println("The size of the number of names " + myList.size());

        myList.remove("Joey");

        System.out.println("The size of the number of names after removing one object : " + myList.size());
    }
}
