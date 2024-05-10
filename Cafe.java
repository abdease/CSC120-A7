public class Cafe extends Building {
    
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups; 
    private int nEspressoShots;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe.");
    }

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, int nEspressoShots) {
        this(name, address, nFloors, nCoffeeOunces, nSugarPackets, nCreams, nCups);
        this.nEspressoShots = nEspressoShots;
    }
/**
 * method to sell a cup of coffee
 * @param size
 * @param nSugarPackets
 * @param nCreams
 */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >=1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Enjoy your cup of coffee!");
        } else {
            System.out.println("Sorry, we are out of coffee!");
            restock(90, 50, 75, 100);
        }
    }
/**
 * overloaded method to sell coffee with espresso shots
 * @param size
 * @param nSugarPackets
 * @param nCreams
 * @param nEspressoShots
 */
    public void sellCoffee(int size, int nSugarPackets, int nCreams, int nEspressoShots) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >=1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Enjoy your cup of coffee!");
        } else {
            System.out.println("Sorry, we are out of coffee!");
            restock(90, 50, 75, 100);
        } 
        System.out.println("House latte!");
    }
/**
 * method to restock items in cafe
 * @param nCoffeeOunces
 * @param nSugarPackets
 * @param nCreams
 * @param nCups
 */
    public void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("The inventory is restocked.");
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Abby's Cafe", "86 Espresso Boulevard", 1, 90, 50, 75, 100);
        myCafe.sellCoffee(1, 1, 1, 2);
    }
    
        
    
}
