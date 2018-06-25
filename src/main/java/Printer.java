public class Printer {
    private int sheets;
    public Printer(int sheets) {
        this.sheets= sheets;
    }

    public int getSheets() {
        return sheets;
    }

    public void print(int pages, int copies) {
        int total = pages * copies;
        if (total <= sheets) {
            sheets -= total;

        }
    }

    public void refill(int pages) {
        sheets += pages;
    }
}
