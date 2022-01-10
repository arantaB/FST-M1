package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car()
    {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics()
    {
        System.out.println("The color of the car is : " +color);
        System.out.println("The transmission of the car is : " +transmission);
        System.out.println("The make/model year of the car is : " +make);
        System.out.println("The number of tyres present is : " +tyres);
        System.out.println("The number of doors of the car is : " +doors);
    }

    public void accelerate()
    {
        System.out.println("Car is moving forward.");
    }

    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}
