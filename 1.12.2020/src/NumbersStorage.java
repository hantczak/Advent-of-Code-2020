import java.util.ArrayList;
import java.util.List;

public class NumbersStorage {
    private List<Integer> numbers;

    public NumbersStorage() {
        this.numbers = new ArrayList<>();
    }

    public void add(int row) {
        numbers.add(row);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
