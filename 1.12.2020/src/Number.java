public class Number {
    private int numberValue;

    public Number(int value) {
        this.numberValue = value;
    }

    public int getNumberValue() {
        return this.numberValue;
    }

    public void setNumberValue(int newValue) {
        this.numberValue = newValue;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Number)) {
            return false;
        }

        Number comparedNumber = (Number) compared;
        if (comparedNumber.getNumberValue() == this.getNumberValue()) {
            return true;
        }
        return false;
    }
}
