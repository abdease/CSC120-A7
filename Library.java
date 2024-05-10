import java.util.Hashtable;

public class Library extends Building{
    
    private Hashtable<String, Boolean> collection;
    private boolean hasElevator;
    private String website;

    public Library(String name, String address, int nFloors, boolean hasElevator) {
        super(name, address, nFloors);
        this.collection = new Hashtable<>();
        this.hasElevator = hasElevator;
        System.out.println("You have built a library!");
    }
/**
 * overloaded contrustor with digital archive/website
 * @param name
 * @param address
 * @param nFloors
 * @param hasElevator
 * @param website
 */
    public Library(String name, String address, int nFloors, boolean hasElevator, String website) {
        super(name, address, nFloors);
        this.collection = new Hashtable<>();
        this.hasElevator = hasElevator;
        this.website = website;
        System.out.println("You have built a library with a digital archive!");
    }


    public void addTitle(String title) {
        collection.put(title, true);
    }
/**
 * overloaded method to add title and author to collection
 * @param title
 * @param author
 */
    public void addTitle(String title, String author) {
        collection.put(title, true);
        String book = title + " by " + author;
        collection.put(book, true);
    }

    public String removeTitle(String title) {
        Boolean removed = collection.remove(title);
        return removed != null ? title : null;
    }

    public void checkOut(String title) {
        if (collection.containsKey(title)) {
            collection.put(title, false);
        } else {
            System.out.println("Book not found in collection.");
        }
    }

    public void returnBook(String title) {
        if (collection.containsKey(title)) {
            collection.put(title, true);
        } else {
            System.out.println("Book not found in collection.");
        }
    }

    public boolean containsTitle(String title) {
        return collection.containsKey(title);
    }

    public void printCollection() {
        System.out.println("Library Collection:");
        for (String title : collection.keySet()) {
            System.out.println(title + "-" + (collection.get(title) ? "Available" : "Checked Out"));
        }
    }
/**
 * override methods to show options and go to floor
 */
    @Override
    public void showOptions() {
        super.showOptions();
    }

    @Override
    public void goToFloor(int floorNum) {
        if (!hasElevator) {
            super.goToFloor(floorNum);
        } else {}
    }

    public static void main(String[] args) {
        Library myLibrary = new Library("Dease Library", "121 Lemontree Lane", 4, true, "deaselibrary.org");
        myLibrary.addTitle("If You Give a Mouse a Cookie");
        myLibrary.printCollection();
        myLibrary.showOptions();
    }
}
