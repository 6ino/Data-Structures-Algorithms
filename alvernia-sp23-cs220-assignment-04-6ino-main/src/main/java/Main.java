import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Welcome to Gino Giacolona's Resturaunt Reservation Program & Football Roster Program\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Type an Option Below");
            System.out.println("1. Reservation Queue");
            System.out.println("2. Roster Manager");
            System.out.println("3. Exit\n=-=-=-=-=-=-=-=");
            System.out.print("Enter Here: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                ReservationQueueMain reservationQueue = new ReservationQueueMain();
                reservationQueue.run();
            } else if (choice == 2) {
                RosterManagerMain rosterManager = new RosterManagerMain();
                rosterManager.run();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        scanner.close();
        System.out.println("Exiting the program.");
    }
}