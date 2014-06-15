package poj_lab_7.domain;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 1. kopiowanie zawartości pliku bez dekorowania
        Main.writeStream("data/output-1.html");

        // 2. kopiowanie zawartości pliku z dekoratorem nr 1 dla słowa "BeBe"
        Main.writeStreamBold("data/output-2.html", "Bebe");

        // 3. kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe"
        Main.writeStreamBoldItalic("data/output-3.html", "Bebe");

        // 4. kopiowanie zawartości pliku z dekoratorem nr 2 i 1 (uwaga! zmiana kolejności wywołania dekoratorów) dla słowa "BeBe"
        Main.writeStreamItalicBold("data/output-4.html", "Bebe");

        // 5. kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe" oraz jeszcze raz 2 dla słowa "bankierów"
        Main.writeStreamBoldItalicWithNew("data/output-5.html", "Bebe", "bankierów");

        // 6. kopiowanie zawartości pliku z dekoratorem nr 1, 2 oraz 3 dla słowa "BeBe" oraz jeszcze raz 2 dla słowa "bankierów"
        Main.writeStreamBoldItalicSummaryWithNew("data/output-6.html", "Bebe", "bankierów");
    }

    private static String readStream(String iFileName) {
        StringBuffer buffer = new StringBuffer();

        try {
            FileInputStream fis = new FileInputStream(iFileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF8");
            Reader in = new BufferedReader(isr);
            int ch;
            while ((ch = in.read()) > -1) {
                buffer.append((char) ch);
            }
            in.close();
            return buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    // 1. kopiowanie zawartości pliku bez dekorowania
    private static void writeStream(String oFileName) {
        String content = Main.readStream("data/input.html");

        try {
            Writer out = new OutputStreamWriter(new FileOutputStream(oFileName), "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. kopiowanie zawartości pliku z dekoratorem nr 1 dla słowa "BeBe"
    private static void writeStreamBold(String oFileName, String word) {
        String content = Main.readStream("data/input.html");

        try {
            BoldWordDecorator bwd = new BoldWordDecorator(new FileOutputStream(oFileName), word);

            Writer out = new OutputStreamWriter(bwd, "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe"
    private static void writeStreamBoldItalic(String oFileName, String word) {
        String content = Main.readStream("data/input.html");

        try {
            ItalicWordDecorator iwd = new ItalicWordDecorator(new FileOutputStream(oFileName), word);
            BoldWordDecorator bwd = new BoldWordDecorator(iwd, word);

            Writer out = new OutputStreamWriter(bwd, "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. kopiowanie zawartości pliku z dekoratorem nr 2 i 1 (uwaga! zmiana kolejności wywołania dekoratorów) dla słowa "BeBe"
    private static void writeStreamItalicBold(String oFileName, String word) {
        String content = Main.readStream("data/input.html");

        try {
            BoldWordDecorator bwd = new BoldWordDecorator(new FileOutputStream(oFileName), word);
            ItalicWordDecorator iwd = new ItalicWordDecorator(bwd, word);

            Writer out = new OutputStreamWriter(iwd, "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5. kopiowanie zawartości pliku z dekoratorem nr 1 i 2 dla słowa "BeBe" oraz jeszcze raz 2 dla słowa "bankierów"
    private static void writeStreamBoldItalicWithNew(String oFileName, String word1, String word2) {
        String content = Main.readStream("data/input.html");

        try {
            BoldWordDecorator bwd = new BoldWordDecorator(new FileOutputStream(oFileName), word1);
            ItalicWordDecorator iwd1 = new ItalicWordDecorator(bwd, word1);
            ItalicWordDecorator iwd2 = new ItalicWordDecorator(iwd1, word2);

            Writer out = new OutputStreamWriter(iwd2, "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6. kopiowanie zawartości pliku z dekoratorem nr 1, 2 oraz 3 dla słowa "BeBe" oraz jeszcze raz 2 dla słowa "bankierów"
    private static void writeStreamBoldItalicSummaryWithNew(String oFileName, String word1, String word2) {
        String content = Main.readStream("data/input.html");

        try {
            BoldWordDecorator bwd = new BoldWordDecorator(new FileOutputStream(oFileName), word1);
            ItalicWordDecorator iwd1 = new ItalicWordDecorator(bwd, word1);
            SummaryDecorator sd = new SummaryDecorator(iwd1, word1);
            ItalicWordDecorator iwd2 = new ItalicWordDecorator(sd, word2);

            Writer out = new OutputStreamWriter(iwd2, "UTF8");
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
