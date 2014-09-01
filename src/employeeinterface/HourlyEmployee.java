
/**
 * Write a description of class HourlyEmployee here.
 * 
 * @author (Ed Manion) 
 * @version (08/31/14)
 */
public class HourlyEmployee implements Employee
{
    // instance variables
    private int hourlyRate;
    private int startTime;
    private int endTime;

    /**
     * Constructor for objects of class HourlyEmployee
     */
    public HourlyEmployee()
    {
        // initialise instance variables
        hourlyRate = 0;
        startTime = 0;
        endTime = 0;
    }

    
    public int getHourlyRate()
    {
        return hourlyRate;
    }
    
    public void setHourlyRate(int hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
        
    public void setStartTime(int startTime)
    {
        // validation goes here
        this.startTime = startTime;
    }
    
    public int getEndTime()
    {
        return endTime;
    }
    
    public void setEndTime(int endTime)
    {
        // validation goes here
        this.endTime = endTime;
    }
    
    public String toString()
    {
        String x = super.toString() + " \nhourly rate = " + hourlyRate +
        " \nStart Time = " + startTime + " \nEnd Time = " + endTime;
        return x;
    }
    
    
}
