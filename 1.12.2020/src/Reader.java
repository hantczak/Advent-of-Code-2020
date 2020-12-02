import java.util.Scanner;

public class Reader {
    private Scanner reader;
    private NumbersStorage storageList;

    public Reader(Scanner reader) {
        this.reader = reader;
        this.storageList = new NumbersStorage();
    }

    public void read() {
        while (true) {
            if (!(reader.hasNextLine())) {
                break;
            }
            add((reader.nextLine()));
        }
    }

    public void add(String row) {
        storageList.add(Integer.valueOf(row));
    }

    public NumbersStorage getStorageList() {
        return storageList;
    }
}


