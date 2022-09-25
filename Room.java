public class Room {
    Boolean acEnabled, isRoomBooked;
    int numbOfOccupants, floorNo, bookingPrice, roomId;
    private int floorId;

    Room(Boolean acEnabled, Boolean isRoomBooked, int floorId, int numbOfOccupants, int price, int roomId,
            int floorNo) {
        this.acEnabled = acEnabled;
        this.isRoomBooked = isRoomBooked;
        this.floorId = floorId;
        this.numbOfOccupants = numbOfOccupants;
        this.bookingPrice = price;  //includes cost of ac
        this.roomId = roomId;
        this.floorNo = floorNo;
    }

    public Boolean isRoomAvailable(int numbOfOccupants, Boolean isAcRequired) {
        return (this.numbOfOccupants == numbOfOccupants && this.acEnabled == isAcRequired && this.isRoomBooked == false);
    }

    public Boolean isRoomAvailable(int numbOfOccupants, Boolean isAcRequired, int floorNo) {
        return (this.numbOfOccupants == numbOfOccupants && this.acEnabled == isAcRequired && this.floorNo == floorNo
                && this.isRoomBooked == false);
    }

    void setRoomStatus() {
        this.isRoomBooked = !this.isRoomBooked;
    }

    public String displayRoom() {
        String acRoom = this.acEnabled ? "Air Conditioned" : "Not Air Conditioned";
        String floorNumber = NumberToWords.toWords(this.floorNo);
        String occupancy = NumberToWords.toWords(this.numbOfOccupants);
        String roomStatus = this.isRoomBooked? "Booked": "Not booked";
        return "Room Number: " + this.roomId + ", " + floorNumber + ", " + acRoom + ", Number of occupants " + occupancy
                + ". Estimated price: " + this.bookingPrice + " /day " + roomStatus;
    }
}
