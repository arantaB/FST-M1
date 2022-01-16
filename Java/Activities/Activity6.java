package Activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onBoard("Shellie");
        plane.onBoard("Alisha");
        plane.onBoard("Ankita");

        System.out.println("The take off time is " + plane.takeOff());

        System.out.println("The list of passengers are : " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();
        System.out.println("The plane landed on time : " + plane.getLastTimeLanded());

    }
}
