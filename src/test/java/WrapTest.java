import org.junit.Assert;
import org.junit.Test;

public class WrapTest {
    @Test
    public void colLengthMoreThanWordLength_expectFullWord () {
        Assert.assertEquals("oats", Wrapper.wrap("oats", 5));
    }

    @Test
    public void colLengthEqualsWordLength_expectFullWord() {
        Assert.assertEquals("bagel", Wrapper.wrap("bagel", 5));
    }

    @Test
    public void colLengthLessThanWordLength_expectWordWithOneBreak() {
        Assert.assertEquals("break\nfast", Wrapper.wrap("breakfast", 5));
    }

    @Test
    public void colLengthLessThanWordLength_expectWordWithTwoBreaks() {
        Assert.assertEquals("avo\ncad\no", Wrapper.wrap("avocado", 3));
    }

    @Test
    public void colLengthLessThanWordLength_expectWordWithEightBreaks() {
        Assert.assertEquals("chees\ne on \ntoast\n for \nthe m\nornin\ng it'\ns ama\nzing!", Wrapper.wrap("cheese on toast for the morning it's amazing!", 5));
    }

}
