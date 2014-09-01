
/**
 * Write a description of class SalariedEmployee here.
 * 
 * @author (Ed Manion) 
 * @version (08/31/14)
 */
public class SalariedEmployee implements Employee
{
    // instance variables
    private int annualRate;
    private int startTime;
    private int endTime;

    /**
     * Constructor for objects of class SalariedEmployee
     */
    public SalariedEmployee()
    {
        // initialise instance variables
        annualRate = 0;
        startTime = 0;
        endTime = 0;
    }

    
    public int getAnnualRate()
    {
        return annualRate;
    }
    public void setAnnualRate(int annualRate)
    {
        // input validation goes here
        this.annualRate = annualRate;
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
        String x = super.toString() + " \nSalaried Employee annual rate = " + annualRate +
        " \nStart Time = " + startTime + " \nEnd Time = " + endTime;
        return x;
    }
    
}
