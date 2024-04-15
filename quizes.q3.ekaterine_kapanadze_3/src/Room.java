
public class Room {
    private int roomNumber;
    private Person occupant;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void checkIn(Person person) {
        this.occupant = person;
    }

    public void checkOut() {
        this.occupant = null;
    }

    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", occupant=" + occupant +
                '}';
    }
}
