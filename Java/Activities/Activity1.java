package Activities;

public class Activity1 {
    public  static  void main(String[] args)
    {
        Car hyundai = new Car();

        //initialize values of the Car class
        hyundai.make = 2014;
        hyundai.color = "Black";
        hyundai.transmission = "Manual";

        //Calling the methods present in Car class
        hyundai.displayCharacteristics();
        hyundai.accelerate();
        hyundai.brake();
    }

}
