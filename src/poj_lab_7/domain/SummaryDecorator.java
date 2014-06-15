package poj_lab_7.domain;

import java.io.OutputStream;

public class SummaryDecorator extends Decorator {
    public SummaryDecorator(OutputStream stream, String word) {
        super(stream);
        this.printSummary(stream, word);
    }

    private void printSummary(OutputStream stream, String word) {
        System.out.println("TODO");
    }
}
