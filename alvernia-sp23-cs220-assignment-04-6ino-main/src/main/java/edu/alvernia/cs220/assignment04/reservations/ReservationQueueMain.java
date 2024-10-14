import java.util.Scanner;

public class ReservationQueueMain {

        public void run (){

                ReservationQueue queue = new ReservationQueue();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nResturuant Reservation Options\nSelect an Option Below\n=-=-=-=-=-=-=-=");
                System.out.println("1. Add a party");
                System.out.println("2. Seat the next party");
                System.out.println("3. Display the current reservations");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter party name: ");
                        String name = scanner.next();
                        System.out.print("Enter party size: ");
                        int size = scanner.nextInt();
                        queue.add(new Party(name, size));
                        break;
                    case 2:
                        Party seatedParty = queue.remove();
                        if (seatedParty == null) {
                            System.out.println("No parties in the queue.");
                        } else {
                            System.out.println("Seating party: " + seatedParty);
                        }
                        break;
                    case 3:
                        System.out.println("Current reservations:");
                        for (int i = 0; i < queue.size(); i++) {
                            Party party = queue.remove();
                            System.out.println((i + 1) + ". " + party);
                            queue.add(party);
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
