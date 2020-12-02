import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reader reader = null;
        try (Scanner scanner = new Scanner(Paths.get("myInput.txt"))) {
            reader = new Reader(scanner);
            reader.read();

        } catch (Exception e) {
            System.out.println(e);
        }

        NumbersStorage numbersList = reader.getStorageList();
        ListAnalyser analyser = new ListAnalyser(numbersList);
        List<Integer> results = analyser.analyse();
        if (results.isEmpty()) {
            System.out.println("Numbers not found.");
        } else {
            System.out.println("Searched numbers are:");
            System.out.println("Number 1: " + results.get(0));
            System.out.println("Number 2: " + results.get(1));
            System.out.println("Their multiplication result is equal to: " + (results.get(0) * results.get(1)));
        }
    }
}
