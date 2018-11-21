import java.util.ArrayList;

public class Wrapper {

    private static ArrayList<String> assembler = new ArrayList<>();

    public static String wrap(String word, int columnLength) {

        clearAssembler();

        assembleWithNoLineBreaks(word, columnLength);
        assembleWithLineBreaks(word, columnLength);

        return wordWithLineBreaks();
    }

    private static void clearAssembler() {
        assembler.clear();
    }

    private static void assembleWithNoLineBreaks(String word, int columnLength) {
        if (word.length() <= columnLength) {
            assembler.add(word);
        }
    }

    private static void assembleWithLineBreaks(String word, int columnLength) {
        int wordLength = word.length();
        int beginIndex = 0;
        int endIndex = beginIndex + columnLength;

        while ( wordLength  > columnLength ) {

            assembler.add(word.substring(beginIndex, endIndex));

            wordLength -= columnLength;

            if ( wordLength <= columnLength ) {
                assembler.add(word.substring(beginIndex += columnLength));
            }

            beginIndex += columnLength;
            endIndex += columnLength;

        }
    }

    private static String wordWithLineBreaks() {
        return String.join("\n", assembler);
    }
}
