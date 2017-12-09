public class nonRepeated {

    public static char nonRepeated(String str){
    char out = 0;
    int length = str.length();
    for (int i = 0; i < length; i++) {
        String sub1 = str.substring(0, i);
        String sub2 = str.substring(i + 1);
        if (!(sub1.contains(str.charAt(i) + "") || sub2.contains(str.charAt(i) + ""))) {
            out = str.charAt(i);
            break;
          }
        }
    return out;
}


public static void main(String[] args) {
  System.out.println(nonRepeated("madam"));
  System.out.println(nonRepeated("ashwini"));
}
}
