import java.awt.Point;

/**
 * The counter class implements a counter that will roll over to the initial
 * value when it hits the maximum value.
 * 
 * @author Charles Hoot 
 * @version 4.0
 */
public class Counter
{
    // PUT PRIVATE DATA FIELDS HERE
	private int count;
	private int min;
	private int max;
	static boolean move = false;
	

    /**
     * The default constructor for objects of class Counter.  Minimum is 0 and the maximum
     * is the largest possible integer.
     */
    public Counter()
    {
    	min = 0;
    	max = 0;
    	count = 0;
    }
    
    
    /**
     * The alternate constructor for objects of class Counter.  The minimum and maximum values are given as parameters.
     * The counter starts at the minimum value.
     * @param min The minimum value that the counter can have
     * @param max The maximum value that the counter can have
     * */
    public Counter(int min, int max)
    {
        // ADD CODE FOR THE ALTERNATE CONSTRUCTOR
    	
    	System.out.println(min + " " + max);
    	if (max <= min) {
        	throw new CounterInitializationException("It is less than or equal to min.");
        }
    	min = 0;
    	max = 0;
    	count = min;
    }
    
    /**
     * Determine if two counters are in the same state
     *
     * @param  otherObject   the object to test against for equality
     * @return     true if the objects are in the same state
     */
    public boolean equals(Object otherObject)
    {
        boolean result = true;
        if (otherObject instanceof Counter)
        {
            // YOUR CODE GOES HERE
        	if (Point.class.isInstance(move))
        	{
        		return true;
        	}
        	else
        		return false;
        }
        return result;
    }
    
    

    /**
     * Increases the counter by one
     */
    public void increase()
    {
        // ADD CODE TO INCREASE THE VALUE OF THE COUNTER
    	if(this.move == true)
    	{
    		this.count++;
    		if (count > 0)
    		{
    			count = 0;
    		}
    		else if (this.move == false)
    		{
    			this.count++;
    		}
    	}
  
    }
 
 
     /**
     * Decreases the counter by one
     */
    public void decrease()
    {
        // ADD CODE TO INCREASE THE VALUE OF THE COUNTER
    	if(this.move == true)
    	{
    		this.count--;
    		if (count < 0)
    		{
    			count = 0;
    		}
    		else if (this.move == false)
    		{
    			this.count--;
    		}
    	}
    }
    
    /**
     * Get the value of the counter
     *
     * @return     the current value of the counter
     */
    public int value()
    {
        // CHANGE THE RETURN TO GIVE THE CURRENT VALUE OF THE COUNTER
        return count;
		
    }
    
    
    /**
     * Accessor that allows the client to determine if the counter
     *             rolled over on the last count
     *
     * @return     true if the counter rolled over
     */
    public boolean rolledOver()
    {
        // CHANGE THE RETURN TO THE ROLLOVER STATUS OF THE COUNTER
        return move;
    }
    
    /**
     * Override the toString method to provide a more informative
     * description of the counter
     *
     * @return     a descriptive string about the object
     */
    public String toString()
    {
        // CHANGE THE RETURN TO A DESCRIPTION OF THE COUNTER
        return "For Minimum: " +min+ ", For Maximum: " +max+ ", For Movement: " +move;		
    }
 
}
