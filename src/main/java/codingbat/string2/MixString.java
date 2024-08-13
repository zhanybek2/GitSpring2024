package codingbat.string2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int minLen = Math.min(lenA,lenB);
        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.caddharAt(i));
        }
        if (lenA > minLen){
            result.append(a.substring(minLen));
        }
        if (lenB > minLen){
            result.append(b.substring(minLen));
        }
        return result.toString();
    }

    }
