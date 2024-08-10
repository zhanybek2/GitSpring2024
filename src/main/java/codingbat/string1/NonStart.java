package codingbat.string1;

public class NonStart {
    public String nonStart(String a, String b) {

        String aWithoutFirst = a.substring(1);
        String bWithoutFirst = b.substring(1);
        return aWithoutFirst + bWithoutFirst;
}
    }

