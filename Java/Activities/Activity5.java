package Activities;

public class Activity5 {

    public static void main(String[] args)
    {
        Book newNovel = new MyBook();

        newNovel.setTitle("The fault in our stars");

        System.out.println("The title of the book is : " + newNovel.getTitle());
    }
}
