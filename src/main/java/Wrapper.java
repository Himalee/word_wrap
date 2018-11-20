import java.util.ArrayList;

public class Wrapper {
    public static String wrap(String word, int columnNumber) {
        int wordLength = word.length();
        int beginIndex = 0;
        int lengthToWrap = columnNumber;
        int endIndex = beginIndex + lengthToWrap;

        ArrayList<String> splitWords = new ArrayList<>();

        if (wordLength <= columnNumber) {
            splitWords.add(word);
        }

        while ( wordLength  > columnNumber ) {

            splitWords.add(word.substring(beginIndex, endIndex));

            wordLength -= lengthToWrap;
            if ( wordLength <= columnNumber ) {
                splitWords.add(word.substring(beginIndex += lengthToWrap));
            }

            beginIndex += lengthToWrap;
            endIndex += lengthToWrap;

        }

        String finalWord = String.join("\n", splitWords);

        return finalWord;
    }
}
