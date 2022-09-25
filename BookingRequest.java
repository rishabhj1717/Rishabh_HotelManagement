import java.util.Scanner;

public class BookingRequest {
    public static void main(String[] args) throws Exception {
        try {
            Hotel h = Driver.populateHotel();
            Scanner sc = new Scanner(System.in);
            String choice, choiceFloor;
            int numOccupants, floorNo;
            System.out.println("Welcome to " + h.getHotelName()
                    + ".\n In front of you is a display of all rooms and their availability and price per day. Please answer the questions followed: ");
            h.displayAllRooms(h.rooms);

            System.out.println("Do you want to run this program manually (y/n)");
            choice = sc.nextLine();

            if(choice.charAt(0) != 'y'){
                Driver.runOperationsOnHotel(h);
                return;
            }

            //Follwing could be used to run this program manually
            do {
                System.out.println("Please enter the numb of occupants?");
                numOccupants = sc.nextInt();
                System.out.println("Would you require AC (y/n)");
                choice = sc.next();
                System.out.println("Would you like to specify a floor?(y/n)");
                choiceFloor = sc.next();
                if(choiceFloor.charAt(0) == 'y'){
                    System.out.println("Please enter the floor number");
                    floorNo = sc.nextInt();
                    System.out.println(h.bookRoom(h.rooms, numOccupants, choice.charAt(0) == 'y', floorNo));
                }else{
                    System.out.println(h.bookRoom(h.rooms, numOccupants, choice.charAt(0) == 'y'));
                }
                System.out.println("Do you wish to continue (y/n)");
                choice = sc.next();
            } while (choice.charAt(0) != 'n');
        } catch (Exception e) {
            System.out.println("There seems to be an invalid input or a problem with the code.");
        }
    }
}
