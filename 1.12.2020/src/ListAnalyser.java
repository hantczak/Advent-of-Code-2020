import java.util.ArrayList;
import java.util.List;

public class ListAnalyser {
    private Number number1;
    private Number number2;
    private List<Integer> numbersList;

    public ListAnalyser(NumbersStorage numbersStorage) {
        numbersList = numbersStorage.getNumbers();
        this.number1 = new Number(0);
        this.number2 = new Number(0);
    }

    public List<Integer> analyse() {

        for (int i = 0; i < numbersList.size(); i++) {
            setNumber1(i);
            for (int j = 1; j < numbersList.size(); j++) {
                setNumber2(j);
                if (i == j) {
                    continue;
                }
                if (number1.getNumberValue() + number2.getNumberValue() == 2020) {
                    return returnSolution();
                }
            }
        }
        return new ArrayList<>();
    }

    public void setNumber1(int i) {
        number1.setNumberValue(numbersList.get(i));
    }

    public void setNumber2(int j) {
        number2.setNumberValue(numbersList.get(j));
    }

    public List<Integer> returnSolution() {
        List<Integer> solution = new ArrayList<>();
        solution.add(number1.getNumberValue());
        solution.add(number2.getNumberValue());
        return solution;
    }
}
