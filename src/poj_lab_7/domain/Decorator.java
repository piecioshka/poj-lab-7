package poj_lab_7.domain;

import java.io.IOException;
import java.io.OutputStream;

public class Decorator extends OutputStream {
    OutputStream stream;

    public Decorator (OutputStream stream) {
        if (stream == null) {
            throw new IllegalStateException();
        }

        this.stream = stream;
    }

    public void write(int b) throws IOException {
        this.stream.write(b);
    }

    public void write(byte b[]) throws IOException {
        this.stream.write(b);
    }

    public void write(byte b[], int off, int len) throws IOException {
        this.stream.write(b, off, len);
    }

    public void flush() throws IOException {
        this.stream.flush();
    }

    public void close() throws IOException {
        this.stream.close();
    }
}
