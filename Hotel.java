package HotelManagement;

import HotelManagement.Room;

public class Hotel {
   String hotelName, hotelAddress;
   int numFloors, numOfRooms;
   Room rooms[];

    Hotel(String hotelName, String hotelAddress, int numFloors, int numOfRooms) {
        this.numFloors = numFloors;
        this.numOfRooms = numOfRooms;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.rooms = new Room[this.numOfRooms];
    }

    public String bookRoom(Room roomsData[], int numbOfOccupants, Boolean isAcRequired) {
        for (Room room: roomsData) {
            if (room.isRoomAvailable(numbOfOccupants, isAcRequired)) {
                room.setRoomStatus();//this will book or mark room as free.
                return room.displayRoom();
            }
        }
        return "Not available";
    }

    public String bookRoom(Room roomsData[], int numbOfOccupants, Boolean isAcRequired, int floorNo) {
        for (Room room: roomsData) {
            if (room.isRoomAvailable(numbOfOccupants, isAcRequired, floorNo)) {
                room.setRoomStatus();//this will book or mark room as free.
                return room.displayRoom();
            }
        }
        return "Not available";
    }

    public void displayAllRooms(Room allRooms[]) {
        for (Room allRoom: allRooms) {
            System.out.println(allRoom.displayRoom());
        }
    }

    public String getHotelName(){
        return this.hotelName;
    }
}
