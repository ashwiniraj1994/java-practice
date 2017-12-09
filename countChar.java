public class countChar {
  public static int countOccurrences(String str, char c) {
    int count = 0;
    for (int i=0; i < str.length(); i++) {
        if (str.charAt(i) == c) {
             count++;
        }
    }
    return count;
}

public static void main(String[] args) {
  System.out.println(countOccurrences("tamil",'l'));
}
}
