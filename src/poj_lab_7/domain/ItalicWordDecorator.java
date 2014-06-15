package poj_lab_7.domain;

import java.io.OutputStream;

public class ItalicWordDecorator extends Decorator {
    public ItalicWordDecorator(OutputStream stream, String word) {
        super(stream);
        this.italicWord(stream, word);
    }

    private void italicWord(OutputStream stream, String word) {

    }
}
