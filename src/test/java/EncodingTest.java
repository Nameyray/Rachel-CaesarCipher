import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodingTest {
@Test
public void encryptedCharacter_returnsCharPlusTwoPosition() {
    Encoding encoding= new Encoding();
    Character expected = 'E';
    assertEquals(expected, encoding.encryptCharacter('C'));
}
@Test
public void encryptedCharacter_returnsCharPlusTwentyPosition() {
    Encoding encoding= new Encoding();
    Character expected = 'U';
    assertEquals(expected, encoding.encryptCharacterPLusTwenty('A'));
}
    @Test
    public void encryptedWord_returnEncryptedWordEachLetterAtPlusTwoPosition() {
        Encoding encoding= new Encoding();
        String expected ="YJA";
        assertEquals(expected, encoding.encryptWord("WHY"));
    }

    @Test
    public void encryptedWord_returnEncryptedWordEachLetterPlusTwoPosition() {
        Encoding encoding= new Encoding();
        String expected ="TCEJGN";
        assertEquals(expected, encoding.encryptWord("RACHEL"));
    }
}
