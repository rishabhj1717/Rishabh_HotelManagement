package HotelManagement;

public class Driver{
    public static Hotel populateHotel() {
        Hotel h = new Hotel("hotelName", "hotelAddress", 2, 7);
        h.rooms[0] = new Room(true, false, 1, 1, 3000, 101, 1);
        h.rooms[1] = new Room(true, false, 1, 2, 4000, 102, 1);
        h.rooms[2] = new Room(false, false, 1, 2, 3000, 103,1);
        h.rooms[3] = new Room(true, false, 2, 1, 3000, 201,2);
        h.rooms[4] = new Room(false, false, 2, 1, 2000, 202,2);
        h.rooms[5] = new Room(true, false, 2, 2, 4000, 203,2);
        h.rooms[6] = new Room(true, false, 2, 3, 5000, 204,2);

        return h;
    }

    public static void runOperationsOnHotel(Hotel h){
        System.out.println("Single Occupancy AC");
        System.out.println(h.bookRoom(h.rooms, 1, true));
        System.out.println("---------------------------------------------");
        System.out.println("Displaying all rooms with current booking status");
        h.displayAllRooms(h.rooms);
        System.out.println("---------------------------------------------------");
        System.out.println("Single Occupancy AC");
        System.out.println(h.bookRoom(h.rooms, 1, true));
        System.out.println("---------------------------------------------");
        System.out.println("Displaying all rooms with current booking status");
        h.displayAllRooms(h.rooms);
        System.out.println("---------------------------------------------------");
        System.out.println("Single Occupancy AC");
        System.out.println(h.bookRoom(h.rooms, 1, true));
        System.out.println("---------------------------------------------");
        System.out.println("Displaying all rooms with current booking status");
        h.displayAllRooms(h.rooms);
        System.out.println("---------------------------------------------");
        System.out.println("Double Occupancy AC Second floor");
        System.out.println(h.bookRoom(h.rooms, 2, true, 2));
        System.out.println("---------------------------------------------");
        System.out.println("Displaying all rooms with current booking status");
        h.displayAllRooms(h.rooms);
    }
}
