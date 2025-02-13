package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onBoard(String passenger)
    {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        Date takeOff = new Date();
        return takeOff;
    }

    public void land()
    {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    public Date getLastTimeLanded()
    {
        return lastTimeLanded;
    }

    public List<String> getPassengers()
    {
        return passengers;
    }
}
