
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> guestRooms;

    public HotelManager() {
        this.guestRooms = new HashMap<>();
    }

    public void checkIn(Person person, int roomNumber) {
        Room room = new Room(roomNumber);
        room.checkIn(person);
        guestRooms.put(person.getId(), room);
    }

    public void checkOut(String personId) {
        Room room = guestRooms.get(personId);
        if (room != null) {
            room.checkOut();
            guestRooms.remove(personId);
        } else {
            System.out.println("Person with ID " + personId + " is not checked in.");
        }
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person occupant = room.getOccupant();
            System.out.println("Person ID: " + personId + ", Room Number: " + room.getRoomNumber() + ", Occupant: " + occupant);
        }
    }
}
