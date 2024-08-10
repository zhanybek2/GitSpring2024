package codingbat.warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String temp = "";

        for (int i = 0; i < n; i++)

            temp += str;

        return temp;

    }

}
