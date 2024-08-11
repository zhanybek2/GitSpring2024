package codingbat;

public class Without2 {
    public String without2(String str) {
        if (str.length() >= 2){
            String s =  str.substring(0,2);
            if (str.endsWith(s)){
                return str.substring(2);
            }

        }
        return str;


    }
}
