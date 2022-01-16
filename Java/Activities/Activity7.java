package Activities;

public class Activity7 {
    public static void main(String[] args)
    {
        MountainBike bike = new MountainBike(3,25, 0);
        System.out.println(bike.bicycleDesc());
        bike.speedUp(20);
        bike.applyBrake(5);
    }
}
