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


}
