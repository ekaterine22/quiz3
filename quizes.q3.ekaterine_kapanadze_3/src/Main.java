

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = PersonManager.getPersons();

        HotelManager hotelManager = new HotelManager();

        for (Person person : persons) {
            int roomNumber = generateRoomNumber(person.getId());
            hotelManager.checkIn(person, roomNumber);
        }

        hotelManager.displayInfo();
    }

    private static int generateRoomNumber(String personalNumber) {
        return Integer.parseInt(personalNumber.substring(7));
    }
}
