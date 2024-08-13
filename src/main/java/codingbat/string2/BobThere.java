package codingbat.string2;

public class BobThere {
    public boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {

            String sub = str.substring(i, i + 3);


            if (sub.charAt(0) == 'b' && sub.charAt(2) == 'b') {
                return true;
            }
        }
        return false;
    }
}