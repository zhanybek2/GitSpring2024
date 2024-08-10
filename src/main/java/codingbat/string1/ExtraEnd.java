package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {

          String lastwo =  str.substring(str.length()-2);
          return lastwo + lastwo +lastwo;
}
    }