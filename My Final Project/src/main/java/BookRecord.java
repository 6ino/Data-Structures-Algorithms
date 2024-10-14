import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class BookRecord {
    private String text;
    private String type;
    private LocalDate issued;
    private String title;
    private String language;
    private String authors;
    private String subjects;
    private String locc;
    private String bookshelves;



    public BookRecord(String text, String type, String issued, String title, String language, String authors, String subjects, String locc, String bookshelves) {
        this.text = text;
        this.type = type;
        this.title = title;
        this.language = language;
        this.authors = authors;
        this.subjects = subjects;
        this.locc = locc;
        this.bookshelves = bookshelves;
    }

    public String getBookId() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getSubjects() {
        return subjects;
    }



    //New imp
    public List<String> getAuthorsAndYears() {
        List<String> authorsAndYears = new ArrayList<>();
        String[] authorsSplit = authors.split(";");

        for (String author : authorsSplit) {
            author = author.trim();
            if (!author.isEmpty()) {
                authorsAndYears.add(author);
            }
        }

        return authorsAndYears;
    }

    public boolean authorBornInOrDiedIn(String authorAndYear, int birthYear, int deathYear) {
        int[] years = parseYears(authorAndYear);
        return years[0] == birthYear || years[1] == deathYear;
    }

    public boolean authorBornBetween(String authorAndYear, int startYear, int endYear) {
        int[] years = parseYears(authorAndYear);
        return years[0] >= startYear && years[0] <= endYear;
    }

    public boolean authorDiedBetween(String authorAndYear, int startYear, int endYear) {
        int[] years = parseYears(authorAndYear);
        return years[1] >= startYear && years[1] <= endYear;
    }

    private int[] parseYears(String authorAndYear) {
        Matcher matcher = Pattern.compile("\\d{4}").matcher(authorAndYear);
        int[] years = new int[]{-1, -1};
        int index = 0;

        while (matcher.find() && index < 2) {
            years[index++] = Integer.parseInt(matcher.group());
        }

        return years;
    }


    @Override
    public String toString() {
        return "BookRecord {" + '\n' +
                "  Text: '" + text + '\'' + '\n' +
                "  Type: '" + type + '\'' + '\n' +
                "  Issued: '" + issued + '\'' + '\n' +
                "  Title: '" + title + '\'' + '\n' +
                "  Language: '" + language + '\'' + '\n' +
                "  Authors: '" + authors + '\'' + '\n' +
                "  Subjects: '" + subjects + '\'' + '\n' +
                "  LoCC: '" + locc + '\'' + '\n' +
                "  Bookshelves: '" + bookshelves + '\'' + '\n' +
                '}';
    }

}
