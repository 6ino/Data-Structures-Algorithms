import edu.alvernia.cs220.assignment04.roster.Player;

import java.util.Comparator;
import java.util.Scanner;


public class RosterManagerMain {


    public void run() {
            Comparator<Player> playerComparator = Comparator
                    .comparing(Player::getLastName)
                    .thenComparing(Player::getFirstName);

            OrderedLinkedList<Player> roster = new OrderedLinkedList<>(playerComparator);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Add a player to the roster");
                System.out.println("2. Remove a player from the roster");
                System.out.println("3. Check if a player is on the Roster");
                System.out.println("4. Display the roster of players");
                System.out.println("5. Display the Statistics for a Selected Player");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter player's first name: ");
                        String firstName = scanner.next();
                        System.out.print("Enter player's last name: ");
                        String lastName = scanner.next();
                        System.out.print("Enter player's rushing: ");
                        int rushing = scanner.nextInt();
                        System.out.print("Enter player's passing: ");
                        int passing = scanner.nextInt();
                        System.out.print("Enter player's touchdowns: ");
                        int touchdowns = scanner.nextInt();
                        System.out.print("Enter player's sacks: ");
                        int sacks = scanner.nextInt();

                        Player newPlayer = new Player(firstName, lastName, rushing, passing, touchdowns, sacks);
                        roster.add(newPlayer);
                        System.out.println("Player added: " + newPlayer);
                        break;
                    case 2:
                        System.out.print("Enter player's first name: ");
                        String removeFirstName = scanner.next();
                        System.out.print("Enter player's last name: ");
                        String removeLastName = scanner.next();
                        int index = roster.indexOf(new Player(removeFirstName, removeLastName, 0, 0, 0, 0));
                        if (index != -1) {
                            Player removedPlayer = roster.remove(index);
                            System.out.println("Player removed: " + removedPlayer);
                        } else {
                            System.out.println("Player not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter player's first name: ");
                        String searchFirstName = scanner.next();
                        System.out.print("Enter player's last name: ");
                        String searchLastName = scanner.next();
                        boolean playerExists = roster.contains(new Player(searchFirstName, searchLastName, 0, 0, 0, 0));
                        System.out.println(playerExists ? "Player found." : "Player not found.");
                        break;
                    case 4:
                        System.out.println("Roster:");
                        for (int i = 0; i < roster.size(); i++) {
                            System.out.println((i + 1) + ". " + roster.get(i));
                        }
                        break;
                    case 5:
                        System.out.print("Enter player's first name: ");
                        String statsFirstName = scanner.next();
                        System.out.print("Enter player's last name: ");
                        String statsLastName = scanner.next();
                        int statsIndex = roster.indexOf(new Player(statsFirstName, statsLastName, 0, 0, 0, 0));
                        if (statsIndex != -1) {
                            Player statsPlayer = roster.get(statsIndex);
                            System.out.println("Player statistics: " + statsPlayer);
                        } else {
                            System.out.println("Player not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }
        }
    }
