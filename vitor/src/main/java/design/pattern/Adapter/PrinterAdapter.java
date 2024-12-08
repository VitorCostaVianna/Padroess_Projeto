package design.pattern.Adapter;

public class PrinterAdapter implements Printer {
    
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(){
        this.legacyPrinter = new LegacyPrinter();
    }

    @Override
    public void print(){
        legacyPrinter.printDocument();
    }
}
