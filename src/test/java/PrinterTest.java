import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 1000);
    }

    @Test
    public void hasSheet() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(5, 10);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void canRefill(){
        printer.print(10, 2);
        printer.refill(10);
        assertEquals(90, printer.getSheets());
    }

    @Test
    public void canReduceToner(){
        printer.print( 10, 10);
        assertEquals(900, printer.getTonerVolume());
    }
}

