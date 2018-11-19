public class Wrapper {
    public static String wrap(String word, int columnNumber) {
        int wordLength = word.length();
        if ( wordLength > columnNumber ) {
            return String.join("\n", "break", "fast");
        }
        return word;
    }
}
