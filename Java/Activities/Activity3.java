package Activities;

public class Activity3 {

    public static void main(String[] args)
    {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("The age of person in Earth : " + (float)((float)seconds/EarthSeconds));
        System.out.println("The age of person in Mercury : " + (float)((float)seconds/MercurySeconds));
        System.out.println("The age of person in Venus : " + (float)((float)seconds/VenusSeconds));
        System.out.println("The age of person in Mars : " + (float)((float)seconds/MarsSeconds));
        System.out.println("The age of person in Jupiter : " + (float) ((float)seconds/JupiterSeconds));
        System.out.println("The age of person in Saturn : " + (float)((float)seconds/SaturnSeconds));
        System.out.println("The age of person in Uranus : " + (float)((float)seconds/UranusSeconds));
        System.out.println("The age of person in Neptune : " + (float)((float)seconds/NeptuneSeconds));
    }
}
