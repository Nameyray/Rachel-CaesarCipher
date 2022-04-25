public class Encoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private int shiftkey;

    public int getShiftkey() {
        return shiftkey;
    }

    public void setShiftkey(int shiftkey) {
        this.shiftkey = shiftkey;
    }

    private String encodedText;
    public String getEncodedText() {
        return encodedText;
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }


    public boolean isString(){
        for (int i = 0; i < this.encodedText.length(); i++){
            if (this.encodedText.charAt(i) >= '0' && this.encodedText.charAt(i) <= '5'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }
    public Object isInRange(){
        return this.shiftkey >= 1 && this.shiftkey <= 25;

    }
    public String forward;
    private final int i = 0;

    {
        char[] newCharText = encodedText.toCharArray();
        for (int i = 0; i < newCharText.length; i++) {

            if (Character.isUpperCase(newCharText[i])) {
                int castText = ((int) newCharText[i] - 65 + this.shiftkey) % 26 + 65;
                newCharText[i] = (char) castText;
            }


        }
    }
    }

