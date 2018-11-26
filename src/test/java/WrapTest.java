import org.junit.Assert;
import org.junit.Test;

public class WrapTest {
    @Test
    public void colLengthMoreThanWordLength_expectFullWord () {
        Assert.assertEquals("b", Wrapper.wrap("b", 3));
    }

    @Test
    public void colLengthMoreThanWordLength_expectAnotherFullWord () {
        Assert.assertEquals("br", Wrapper.wrap("br", 3));
    }

    @Test
    public void colLengthEqualToWordLength_expectAnotherFullWord () {
        Assert.assertEquals("bre", Wrapper.wrap("bre", 3));
    }

    @Test
    public void colLengthMoreThanWordLength_expectWordWithOneBreak () {
        Assert.assertEquals("bre\na", Wrapper.wrap("brea", 3));
    }

    @Test
    public void colLengthMoreThanWordLength_expectWordWithTwoBreaks () {
        Assert.assertEquals("bre\nakf\na", Wrapper.wrap("breakfa", 3));
    }

    @Test
    public void colLengthMoreThanWordLength_expectAnotherWordWithTwoBreaks () {
        Assert.assertEquals("bre\nakf\nast", Wrapper.wrap("breakfast", 3));
    }

    @Test
    public void colLengthMoreThanWordLength_expectAnotherWordWithThreeBreaks () {
        Assert.assertEquals("bre\nakf\nast\ns", Wrapper.wrap("breakfasts", 3));
    }

}
