import java.util.Arrays;

public class Decoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String encodedText;

    public Character diciperCharacterMinusTwo(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey=2;

        if (position-shiftKey < 0){
            deShiftKey= position-shiftKey;
            position=alphabet.length+deShiftKey;
        }else{
            position=position-shiftKey;
        }
        return alphabet[position];
    }
    public Character diciperCharacterMinusTwentyThree(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey=20;

        if (position-shiftKey < 0){
            deShiftKey= position-shiftKey;
            position=alphabet.length+deShiftKey;
        }else{
            position=position-shiftKey;
        }
        return alphabet[position];
    }
    public String dicipheredWord(String word){
        char[] wordCharArray = word.toUpperCase().toCharArray();
        StringBuilder dicipherWord= new StringBuilder();
        for (char c : wordCharArray) {
            dicipherWord.append(diciperCharacterMinusTwo(c));
        }
        return dicipherWord.toString();
    }
    private int shiftkey;

    public int getShiftkey() {
        return shiftkey;
    }

    public void setShiftkey(int shiftkey) {
        this.shiftkey = shiftkey;
    }

    private String mText;

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }


    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public String wordDecryption(String input) {
        return "input";
    }
}
