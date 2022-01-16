package Activities;

public class Bicycle implements BicycleParts,BicycleOperations {

    int gears, currentSpeed;
    public Bicycle(int gears, int currentSpeed)
    {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void applyBrake(int decreement) {
        currentSpeed -= decreement;
    }

    @Override
    public void speedUp(int increement) {
        currentSpeed += increement;
    }

    public String bicycleDesc()
    {
        return ("No of gears are " +gears+ "\n Speed of bicycle is " + currentSpeed);
    }
}
