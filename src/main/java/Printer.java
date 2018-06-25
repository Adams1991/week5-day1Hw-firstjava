public class Printer {
    private int sheets;
    private int tonerVolume;
    public Printer(int sheets, int tonerVolume) {
        this.sheets= sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets() {
        return sheets;
    }

    public void print(int pages, int copies) {
        int total = pages * copies;
        if (total <= sheets && tonerVolume >= total) {
            sheets -= total;
            tonerVolume -= total;


        }
    }

    public void refill(int pages) {
        sheets += pages;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
