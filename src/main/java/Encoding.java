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
}

