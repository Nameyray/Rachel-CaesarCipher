import java.util.Arrays;

public class Encoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public Character encryptCharacter(char Character){
      int position = Arrays.asList(alphabet).indexOf(Character);
        if(position +2 >= alphabet.length) {
            position=Math.abs(alphabet.length -position-2);

        }else{
            position = position+2;
        }
        return alphabet[position];
    }

    public Character encryptCharacterPLusTwenty(char Character){
        int position = Arrays.asList(alphabet).indexOf(Character);
        if(position +20>= alphabet.length) {
            position=Math.abs(alphabet.length -position-20);

        }else{
            position = position+20;
        }
        return alphabet[position];
    }
    private int mkey;

    public int getMkey() {
        return mkey;
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    private String mText;

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}

