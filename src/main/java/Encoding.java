public class Encoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private int shiftkey;

    public int getShiftkey() {
        return shiftkey;
    }

    public void setShiftkey(int shiftkey) {
        this.shiftkey = shiftkey;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }

    private String encodedText;

    public boolean isString(){
        for (int i = 0; i < this.encodedText.length(); i++){
            if (this.encodedText.charAt(i) >= '0' && this.encodedText.charAt(i) <= '5'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }

    public boolean isInRange(){
        return this.shiftkey >= 1 && this.shiftkey <= 25;
    }

}

