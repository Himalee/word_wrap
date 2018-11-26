import java.util.ArrayList;

public class Wrapper {
    public static final String NEWLINE = "\n";
    public static final int FIRSTELEMENT = 0;

    public static String wrap(String word, int columnLength) {
        ArrayList<String> wordChunks = new ArrayList<>();
        String remainingWord = word;

        while (remainingWord.length() > columnLength) {
            String splitWord = remainingWord.substring(FIRSTELEMENT, columnLength);
            wordChunks.add(splitWord);
            remainingWord = remainingWord.replace(splitWord, "");

        }
        wordChunks.add(remainingWord);

      return  String.join(NEWLINE, wordChunks);

    }

}
