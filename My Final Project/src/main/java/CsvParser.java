import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static List<BookRecord> parseCsv(Path csvPath) {
        List<BookRecord> records = new ArrayList<>();

        try (FileReader fileReader = new FileReader(csvPath.toFile());
             CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            for (CSVRecord csvRecord : csvParser) {
                BookRecord record = new BookRecord(csvRecord.get("Text#"), csvRecord.get("Type"), csvRecord.get("Issued"), csvRecord.get("Title"), csvRecord.get("Language"), csvRecord.get("Authors"), csvRecord.get("Subjects"), csvRecord.get("LoCC"), csvRecord.get("Bookshelves"));
                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}
