package tddmicroexercises.textconvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HtmlTextConverterTest {

    @Test
    public void testFilename() {
        HtmlTextConverter converter = new HtmlTextConverter("foo");
        assertEquals("foo", converter.getFilename());
    }

    @Test
    public void testFileWithAmpersandSymbol() {
        HtmlTextConverter converter = new HtmlTextConverter("C:\\Users\\Vieran.Nijjar\\Documents\\Programming\\RacingCarKata\\Racing-Car-Katas\\Java\\TextConverter\\src\\test\\testAmpersand.txt");
        assertEquals("Hello &amp; test<br />", converter.convertToHtml());
    }

}
