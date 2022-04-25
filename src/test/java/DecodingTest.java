import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodingTest {
    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusTwo() {
        Decoding decoding=new Decoding();
        Character expected ='A';
        assertEquals(expected, decoding.diciperCharacterMinusTwo('C'));
    }

    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusTwenty() {
        Decoding decoding=new Decoding();
        Character expected ='A';
        assertEquals(expected, decoding.diciperCharacterMinusTwentyThree('U'));
    }
    @Test
    public void dicipherWord_returnsOriginalWord_RACHEL() {
        Decoding decoding=new Decoding();
        String expected="RACHEL";
        assertEquals(expected, decoding.dicipheredWord("TCEJGN"));
    }
}
