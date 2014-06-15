package poj_lab_7.domain;

import java.io.OutputStream;

public class BoldWordDecorator extends Decorator {

    public BoldWordDecorator(OutputStream stream, String word) {
        super(stream);
        this.boldWord(stream, word);
    }

    private void boldWord(OutputStream stream, String word) {

    }
}
