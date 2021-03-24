
/**
 * The customer order class takes the parameters passed in and calculates the price of a desk based on them.
 * 
 *
 * @author (Logan Yeubanks)
 * @version (Version 2)
 */
public class customerOrder
{
    // instance variables
    private int orderNumber;
    private String name;
    private int length;
    private int width;
    private String typeOfWood;
    private int numberOfDrawers;

    /**
     * Constructor for objects of class customerOrder
     */
    public customerOrder(int deskOrderNumber, String customerName, int deskLength, int deskWidth, String deskTypeOfWood, int deskNumberOfDrawers)
    {
        // initialise instance variables
        orderNumber = deskOrderNumber;
        name = customerName; 
        length = deskLength;
        width = deskWidth;
        typeOfWood = deskTypeOfWood;
        numberOfDrawers = deskNumberOfDrawers; 
    }

    /**
     * Calculates the surface of the desk using lenghth * width and returns the result
     *
     * @return surface
     */
    private int calculateSurface()
    {
        int surface = length * width;
        return surface; 
    }

    /**
     * calculates the number of drawers passed in * the price of a individual drawer and returns the result.
     *
     * @return drawerPrice
     */
    private int calculateDrawerPrice()
    {
        final int individualDrawerPrice = 30;
        int drawerPrice = individualDrawerPrice * numberOfDrawers;
        return drawerPrice;
    }
    
    /**
     * method that contains all the math neccasary for project. Returns the total of these calculations at the end.
     *
     * @return total
     */
    private int calculatePrice()
    {
        final int basePrice = 200;
        int total = basePrice;
        int normalDeskSurfaceAreaLimit = 750;
        // adds 50 to the running total if calculated surface is greater than 750
        if (calculateSurface() > normalDeskSurfaceAreaLimit)
        {
            final int largeDeskAdditionalPrice = 50; 
            total += largeDeskAdditionalPrice;
        }
        // adds 150 to the running total if mahogany is passed into constructor for typeOfWood
        if (typeOfWood.equals("mahogany"))
        {
            final int additionalCostOfMahogany = 150;
            total += additionalCostOfMahogany;
        }
        // adds 125 to the running total if oak is passed into the constructor for the typeOfWood
        else if (typeOfWood.equals("oak"))
        {
            final int additionalCostOfOak = 125; 
            total += additionalCostOfOak;
        }
        
        //adds calculatedDrawerPrice to the running total
        total += calculateDrawerPrice();
        
        //returns total, which adds all these calculations together
        return total;
    }

    /**
     * method that prints out all the information passed in and prints the total of all of them.
     */
    public void printInformation()
    {
        System.out.println("Order number: " + orderNumber);
        System.out.println("Customer name: " + name);
        System.out.println("Selected length: " + length);
        System.out.println("Selected width: " + width);
        System.out.println("Wood type: " + typeOfWood);
        System.out.println("Number of drawers: " + numberOfDrawers);
        System.out.println("Grand Total: " + calculatePrice());
        
        
    }
}
