public class Decoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

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

    public boolean isString(){
        for (int i = 0; i < this.mText.length(); i++){
            if (this.mText.charAt(i) >= '0' && this.mText.charAt(i) <= '5'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }

}
