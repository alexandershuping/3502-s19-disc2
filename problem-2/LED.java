/**
 * Holds values for an RGB LED.
 *
 * RGB LEDs are actually made up of three separate LEDs - one red, one green,
 * and one blue. By setting these LEDs to different brightnesses, we can make
 * any color we want! This class represents an RGB LED, holding a value for
 * the brightness (0.0 for 0 percent brightness, 1.0 for 100% brightness) of
 * each individual LED.
 *
 * Here are some example values, with the colors they correspond to:
 *     red=0.00, green=0.00, blue=1.00 - bright blue
 *     red=0.80, green=0.00, blue=0.80 - bright violet
 *     red=0.50, green=0.00, blue=0.80 - a blue-ish purple
 *     red=0.25, green=0.95, blue=0.60 - a sea-foam green
 *     red=1.00, green=1.00, blue=1.00 - bright white
 *
 * @author Gorbert Bordinton III, esq.
 * @version 1.0
 */
public class LED
{
    /* NOTE: This class is broken
     * 
     * Try it - open this class in bluej, then right-click and run the "main"
     * method.
     *
     * Now, try to figure out what exactly is wrong with the class, and fix it.
     * 
     * HINT: The problem seems to be in the setColor method.
     */
    private double red;   // The percentage of red in the LED
    private double green; // The percentage of green in the LED
    private double blue;  // The percentage of blue in the LED

    /**
     * Default constructor
     *
     * Initializes all values to zero
     */
    public LED()
    {
        // initialise instance variables
        red = 0;
        green = 0;
        blue = 0;
    }
    
    /**
     * Initialization constructor
     *
     * @param newRed Holds the percentage of red in the LED
     * @param newGreen Holds the percentage of green in the LED
     * @param newBlue Holds the percentage of blue in the LED
     */
    public LED(double newRed, double newGreen, double newBlue){
            red = newRed;
            green = newGreen;
            blue = newBlue;
    }
    
    /**
     * Combined setter for red, green, and blue.
     *
     * I have combined all three setters into one method for convenience.
     * Note that, if a problem asks you to make setters for each of the
     * properties in a class, you still need to make individual methods 
     * for each - i.e. DO NOT combine them all into one.
     *
     * @param red Holds the new red percentage
     * @param green Holds the new green percentage
     * @param blue Holds the new blue percentage
     */
    public void setColor(double red, double green, double blue){
        red = this.red;
        green = this.green;
        blue = this.blue;
    }

    // Individual accessor methods
    public void setRed(double newRed){
        red = newRed;
    }

    public void setGreen(double newGreen){
        green = newGreen;
    }

    public void setBlue(double newBlue){
        blue = newBlue;
    }
    
    public double getRed(){
        return red;
    }
    
    public double getGreen(){
        return green;
    }
    
    public double getBlue(){
        return blue;
    }

    /**
     * Method to change the brightness of the LED.
     *
     * Multiplies all values (red, green, and blue) by brightnessFactor.
     * That is, passing brightnessFactor=2 will double the percentages 
     * of red, green, and blue.
     *
     * @param brightnessFactor Factor to multiply all LED brightnesses by.
     */
    public void changeBrightness(double brightnessFactor){
        red   *= brightnessFactor;
        green *= brightnessFactor;
        blue  *= brightnessFactor;
        // TODO: right now, this can easily make red, green, or blue go
        //       above 1, when we don't intend to. Once we know how to
        //       use conditionals, we will fix this.
    }

    /**
     * Get the average brightness of the RGB LED.
     * 
     * Calculates and returns the average of red, green, and blue.
     *
     * @return The average of red, green, and blue.
     */
    public double getAverageBrightness(){
        return (red + green + blue) / 3;
    }
    
    /**
     * Information print method
     *
     * Prints necessary information about the LED.
     */
    public void printInfo(){
        System.out.println("LED with red=" + red + ", green=" + green + ", blue=" + blue);
    }
    

    /**
     * Information string method
     * 
     * @return A string containing necessary information about the LED
     */
    public String toString(){
        return ("LED with red=" + red + ", green=" + green + ", blue=" + blue);
    }
    
    /**
     * Main method
     *
     * The entry point for the program
     *
     * @param args An array of strings containing the command-line arguments
     */
    public static void main(String[] args){
        LED l = new LED(); // Make a new LED with the default constructor

        boolean problems = false; // Keep track of whether we've run into any problems.
        
        System.out.println("\n=====Beginning test=====\n"); // Additional newlines make the output look nicer

        System.out.println("Created an LED using the default constructor.\n"
            + "Expected: " + "LED with red=0.0, green=0.0, blue=0.0" + "\n"
            + "Actual  : " + l.toString()
        );

        // Ignore this bit - you haven't learned conditionals yet.
        if(l.toString().equals("LED with red=0.0, green=0.0, blue=0.0")){
            System.out.println("\tLooks like everything's good!");
        }else{
            System.out.println("\tOH NO! They don't match!");
            problems = true; // Note that we ran into a problem
        }

        System.out.println(); // Calling println() with no arguments prints a blank line.

        LED m = new LED(0.15, 0.5, 0.5); // Make a new LED with the initialization constructor

        System.out.println("Created an LED using the initialization constructor.\n"
            + "Expected: " + "LED with red=0.15, green=0.5, blue=0.5" + "\n"
            + "Actual  : " + m.toString()
        );

        if(m.toString().equals("LED with red=0.15, green=0.5, blue=0.5")){
            System.out.println("\tLooks like everything's good!");
        }else{
            System.out.println("\tOH NO! They don't match!");
            problems = true; // Note that we ran into a problem
        }
                 
        System.out.println();

        m.setColor(0.25, 0.95, 0.60); // Set color to sea-foam green

        System.out.println("Using setColor() to change the values.\n"
           + "Expected: " + "LED with red=0.25, green=0.95, blue=0.60" + "\n"
           + "Actual  : " + m.toString()
        );

        if(m.toString().equals("LED with red=0.25, green=0.95, blue=0.60")){
            System.out.println("\tLooks like everything's good!");
        }else{
            System.out.println("\tOH NO! They don't match!");
            problems = true; // Note that we ran into a problem
        }

        System.out.println("\n=====Test complete=====\n");

        if(problems){
            System.out.println("WARNING: We ran into a problem!\n");
        }
    }
}
