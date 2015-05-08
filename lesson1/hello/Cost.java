
/**
 * Write a description of class Cost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cost
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Cost
     */
    public Cost()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getCost()
    {

    
        double[] items = new double[2];
        items[0] = 1.00;
        items[1] = 10.0;
        double cost = 0.0;
        double tax = 0.0;
        double tip = 0.0;
        
        for(int x = 0; x < items.length; x++){
            tax = items[x] * 0.08;
            tip = items[x] * 0.18;
            cost = cost + items[x] + tax + tip;
        }
        
       return cost;
        

    }
}
