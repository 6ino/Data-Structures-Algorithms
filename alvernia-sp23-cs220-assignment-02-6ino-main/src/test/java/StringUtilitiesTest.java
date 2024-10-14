import edu.alvernia.cs220.util.StringUtilities;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringUtilitiesTest {

    @Test
    void testCountLetters()
    {
        assertEquals(2, StringUtilities.countLetters( "abcdeABCDEfG", 'e'));
        assertEquals(2, StringUtilities.countLetters( "abcdeABCDEfG", 'E'));
        assertEquals(0, StringUtilities.countLetters( "AaAaBbAAaa", 'E'));
        assertEquals(8, StringUtilities.countLetters( "AaAaBbAAaa", 'A'));
    }

    @Test
    void testReverse() {
        assertEquals("aaAAbBaAaA", StringUtilities.reverse( "AaAaBbAAaa"));
        assertEquals("serutcurtSataD022SC", StringUtilities.reverse( "CS220DataStructures"));
    }

    @Test
    void testInvertCharacterCase() {
        assertEquals("CAMALcASE", StringUtilities.invertCase( "camalCase"));
        assertEquals("ranDOMstrINGcaSE", StringUtilities.invertCase( "RANdomSTRingCAse"));
        assertEquals("ran1DOM2str3ING4ca5SE", StringUtilities.invertCase( "RAN1dom2STR3ing4CA5se"));
        assertEquals("!@#$%^&*(", StringUtilities.invertCase( "!@#$%^&*("));
    }

    @Test
    void testTrim() {
        assertEquals("Padded test base case", StringUtilities.trim( "Padded test base case"));
        assertEquals("Padded left case", StringUtilities.trim( "        Padded left case"));
        assertEquals("Padded left case", StringUtilities.trim( "    Padded left case"));
        assertEquals("Padded left case", StringUtilities.trim( "  Padded left case"));
        assertEquals("Padded right case", StringUtilities.trim( " Padded right case   "));
        assertEquals("Padded right case", StringUtilities.trim( " Padded right case       "));
        assertEquals("Padded right case", StringUtilities.trim( " Padded right case           "));
        assertEquals("Padded both sides case", StringUtilities.trim( "     Padded both sides case           "));
        assertEquals("Padded both sides case", StringUtilities.trim( "  Padded both sides case              "));
        assertEquals("Padded both sides case", StringUtilities.trim( "        Padded both sides case      "));
    }

    @Test
    void testIsPalindrome() {
        assertEquals(false, StringUtilities.isPalindrome( "camalCase"));
        assertEquals(false, StringUtilities.isPalindrome( "RANdomSTRingCAse"));
        assertEquals(true, StringUtilities.isPalindrome( "kayak"));
        assertEquals(true, StringUtilities.isPalindrome( "Rotator"));
        assertEquals(true, StringUtilities.isPalindrome( "Deed"));
    }

    @Test
    void testPadLeft() {
        assertEquals("1111string to pad", StringUtilities.padLeft( "string to pad", '1', 4));
        assertEquals("ooohello", StringUtilities.padLeft( "hello", 'o', 3));
    }

    @Test
    void testPadRight() {
        assertEquals("string to pad1111", StringUtilities.padRight( "string to pad", '1', 4));
        assertEquals("hellossss", StringUtilities.padRight( "hello", 's', 4));
    }

    @Test
    void testIsNumber() {
        assertEquals(true, StringUtilities.isNumber( "1234567890"));
        assertEquals(true, StringUtilities.isNumber( "9876543210"));
        assertEquals(true, StringUtilities.isNumber( "98765.43210"));
        assertEquals(true, StringUtilities.isNumber( "123.50"));
        assertEquals(false, StringUtilities.isNumber( "$123.50"));
        assertEquals(false, StringUtilities.isNumber( "123.A"));
        assertEquals(false, StringUtilities.isNumber( "A123.A"));
        assertEquals(false, StringUtilities.isNumber( "ABCD"));
    }

    @Test
    void testEnd() {
        assertEquals("orld", StringUtilities.end("Hello World", 4));
        assertEquals("StRING", StringUtilities.end("A longer StRING", 6));
        assertEquals("expialidocious", StringUtilities.end("supercalifragilisticexpialidocious", 14));
    }

    @Test
    void testStart() {
        assertEquals("Hello W", StringUtilities.start("Hello World", 7));
        assertEquals("A long", StringUtilities.start("A longer StRING", 6));
        assertEquals("supercalifragilistic", StringUtilities.start("supercalifragilisticexpialidocious", 20));
    }

}
