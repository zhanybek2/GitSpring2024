package codingbat.string2;

public class EndOther {
    public boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
return (aLower.endsWith(bLower) || bLower.endsWith(aLower));

    }


}
