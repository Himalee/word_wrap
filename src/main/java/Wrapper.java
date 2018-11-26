import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class Wrapper {
public static final String NEWLINE = "\n";

    public static String wrap(String word, int columnLength) {
        ArrayList<String> assembler = new ArrayList<>();
        int wordLength = word.length();
        int beginIndex = 0;
        int endIndex = beginIndex + columnLength;

        while ( wordLength > columnLength ) {

            assembler.add(word.substring(beginIndex, endIndex));

            wordLength -= columnLength;

            if ( wordLength <= columnLength ) {
                assembler.add(word.substring(beginIndex += columnLength));
            }

            beginIndex += columnLength;
            endIndex += columnLength;

        }

        if (word.length() <= columnLength) {
            assembler.add(word);
        }
        return String.join(NEWLINE, assembler);

    }

}
