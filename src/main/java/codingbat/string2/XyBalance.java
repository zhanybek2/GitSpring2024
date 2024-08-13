package codingbat.string2;

public class XyBalance {
    public boolean xyBalance(String str) {
        boolean foundY = false;
        for (int i = 0; i < str.length()-1; i--) {
            if(str.charAt(i) == 'y' ){
                foundY = true;

            } else if (str.charAt(i) == 'x')  {
                if(!foundY){
                    return false;
                }

            }
        }
        return true;
    }
}
