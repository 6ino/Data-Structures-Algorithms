import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\ginog\\Documents\\GitHub\\Final Ass 6\\src\\pg_catalog.csv";
        List<BookRecord> records = CsvParser.parseCsv(Paths.get(csvFile));

        RedBlackTree<String, BookRecord> bookIdTree = new RedBlackTree<>();
        RedBlackTree<String, BookRecord> titleTree = new RedBlackTree<>();
        RedBlackTree<String, BookRecord> subjectTree = new RedBlackTree<>();

        for (BookRecord record : records) {
            bookIdTree.insert(record.getBookId(), record);
            titleTree.insert(record.getTitle(), record);
            subjectTree.insert(record.getSubjects(), record);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Gutenberg Library Book Search Program\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nWritten By: Gino Giacolona\nProf. Mellinger\nData Structures and Algorithms\nAlvernia University\n5 May 2023\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (true) {
            System.out.println("Select a way to search below\n________________________________");
            System.out.println("1.) Search by Text Number\n2.) Search by Title (Or phrase from title)\n3.) Search by Book Subject / Bookshelf (Ex. Calculus)\n4.) Search by Author(s) Name\n5.) Search by Author(s) Birth or Death Year\n6.) Search by Author(s) Births dated in a Range\n7.) Search by Author(s) Death dated in a Range\n8.) Exit the program");







            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            if (input.equals("1")) {
                System.out.println("Enter the Book ID:");
                String bookId = scanner.nextLine();
                BookRecord record = bookIdTree.search(bookId);
                if (record != null) {
                    System.out.println("Book found: " + record);
                } else {
                    System.out.println("Book not found.");
                }
            } else if (input.equals("2")) {
                System.out.println("Enter a word or phrase from the title:");
                String partialTitle = scanner.nextLine();
                List<BookRecord> results = titleTree.searchBy(title -> title.contains(partialTitle));

                if (!results.isEmpty()) {
                    System.out.println("Books found:");
                    for (BookRecord record : results) {
                        System.out.println(record);
                    }
                } else {
                    System.out.println("No books found.");
                }
            } else if (input.equals("3")) {
                System.out.println("Enter a subject:");
                String subjectSearchTerm = scanner.nextLine();
                List<BookRecord> results = subjectTree.searchBySubjects(subject -> subject.contains(subjectSearchTerm));

                if (!results.isEmpty()) {
                    System.out.println("Books found:");
                    for (BookRecord record : results) {
                        System.out.println(record);
                    }
                } else {
                    System.out.println("No books found.");
                }
//new imp
            } else if (input.equals("4")) {
                System.out.println("Enter the author's name:");
                String authorName = scanner.nextLine();
                List<BookRecord> results = titleTree.searchByAuthor(authorName);
                if (!results.isEmpty()) {
                    System.out.println("Books found:");
                    for (BookRecord record : results) {
                        System.out.println(record);
                    }
                } else {
                    System.out.println("No books found.");
                }
//new imp end

            } else if (input.equals("5")){
                    System.out.println("Enter the author's birth year or death year:");
                    int year = Integer.parseInt(scanner.nextLine());
                    List<BookRecord> results = subjectTree.searchByAuthorBirthDeathDate(year, year);


            } else if (input.equals("6")){
                System.out.println("Enter the start year and end year for author's births (separated by space):");
                String[] years = scanner.nextLine().split(" ");
                int startYear = Integer.parseInt(years[0]);
                int endYear = Integer.parseInt(years[1]);
                List<BookRecord> results = subjectTree.searchByAuthorBirthDateRange(startYear, endYear);

            } else if (input.equals("7")) {
                System.out.println("Enter the start year and end year for author's deaths (separated by space):");
                String[] years = scanner.nextLine().split(" ");
                int startYear = Integer.parseInt(years[0]);
                int endYear = Integer.parseInt(years[1]);
                List<BookRecord> results = subjectTree.searchByAuthorDeathDateRange(startYear, endYear);

            } else if (input.equals("8")) {
                System.out.println("Thank you for using our program!");
                System.exit(0);


            } else {

                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}

