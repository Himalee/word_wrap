import org.junit.Assert;
import org.junit.Test;

public class WrapTest {
    @Test
    public void colLengthMoreThanWordLength_expectFullWord () {
        Assert.assertEquals("hel", Wrapper.wrap("hel", 5));
    }

    @Test
    public void colLengthEqualsWordLength_expectFullWord() {
        Assert.assertEquals("hello", Wrapper.wrap("hello", 5));
    }

    @Test
    public void colLengthLessThanWordLength_expectWordWithOneBreak() {
        Assert.assertEquals("break\nfast", Wrapper.wrap("breakfast", 5));
    }
}
