public class removeChar{
  public static String removeChar(String str, int pos){
    return str.substring(0, pos) + str.substring(pos + 1);
    }

    public static void main(String[] args) {
      System.out.println(removeChar("madam",1));
      System.out.println(removeChar("rohith",3));
    }
}

// public class Main {
//    public static void main(String args[]) {
//       String str = "this is Java";
//       System.out.println(removeCharAt(str, 3));
//    }
//    public static String removeCharAt(String s, int pos) {
//       return s.substring(0, pos) + s.substring(pos + 1);
//    }
// }
