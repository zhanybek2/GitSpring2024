package codingbat.string1;

public class SeeColor {
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
