import java.util.ArrayList;

public class House extends Building {

    private ArrayList<String> residents;
    private boolean hasDiningRoom;
    private boolean hasElevator;
    private String neighborhood;

    public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
        super(name, address, nFloors);
        this.residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
        this.hasElevator = hasElevator;
    }

    public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator, String neighborhood) {
        super(name, address, nFloors);
        this.residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
        this.hasElevator = hasElevator;
        this.neighborhood = neighborhood;
    }
/**
 * boolean for has dining room
 * @return true
 */
    public boolean hasDiningRoom() {
        return hasDiningRoom;
    }
/**
 * int for number residents
 * @return size
 */
    public int nResidents() {
        return residents.size();
    }
/**
 * method to move in to house
 * @param name
 */
    public void moveIn(String name) {
        residents.add(name);
    }
/**
 * overloaded moveIn method to move multiple residents in at once
 * @param names
 */
    public void moveIn(String...names) {
        for (String name : names) {
            residents.add(name);
        }
    }
/**
 * method to move out
 * @param name
 * @return name
 */
    public String moveOut(String name) {
        boolean removed = residents.remove(name);
        if (removed) {
            return name;
        } else {
            return null;
        }
    }
/**
 * boolean to check if person is a resident in house
 * @param person
 * @return 
 */
    public boolean isResident(String person) {
        return residents.contains(person);
    }
/**
 * override methods for showOptions and go to floor from building
 */
    @Override
    public void showOptions() {
        super.showOptions();
    }

    @Override
    public void goToFloor(int floorNum) {
        if (!hasElevator) {
            super.goToFloor(floorNum);
        }
    }

    public static void main(String[] args) {
        House myHouse = new House("Haynes", "1 Mandelle Road", 2, true, true, "Garden");
        myHouse.moveIn("Abby", "Julia");
    }
}
