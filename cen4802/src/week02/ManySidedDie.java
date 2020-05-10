package week02;

import java.util.Random;

/**
 * This class represents a generic many-sided die
 * 
 * @author Scott LaChance
 * 
 */
public class ManySidedDie
{
    /**
     * Constructor
     * 
     * @param sides
     *            Number of sides of the die
     * @param roll
     *            true to roll die, otherwise initialize to NO_NUMBER;
     */
    public ManySidedDie(int sides, boolean roll)
    {
        maxNumber = sides;

        random = new Random();

        if(roll)
        {
            roll();
        }
        else
        {
            number = NO_NUMBER;
        }
    }

    /**
     * Rolls the die randomly and stores the result.
     */
    public void roll()
    {
        number = random.nextInt(maxNumber - MIN_NUMBER + 1) + MIN_NUMBER;
    }
	
    /**
     * Returns the number on this dice
     * @return The rolled number
     */
    public int getNumber()
    {
        return number;
    }

    // Data Members

    // the largest number on a dice
    private int maxNumber = 6;

    // the smallest number on a dice
    private static final int MIN_NUMBER = 1;

    // to represent a dice that is not yet rolled
    private static final int NO_NUMBER = 0;

    private int number;

    private Random random;
}
