// public class palindrome {
//   public void palindrome(str){
//     int len = str.length();
//     for (int i = 0; i < len/2 ;++i ) {
//       if (str.charAt(i) != str.charAt(len - i - 1)) {
//         System.out.println("The given string " + str + " is not a palindrome");
//     }
//   }
//   System.out.println("The given string " + str + " is palindrome");
// }

public class palindrome{
  public static void palindrome(String str){
    StringBuffer rev = new StringBuffer(str).reverse();
    String strRev = rev.toString();
    if(str.equalsIgnoreCase(strRev)){
       System.out.println("The given string '" + str + "' is a palindrome");
    } else {
      System.out.println("The given string '" + str + "' is not a palindrome");

    }
  }

public static void main(String[] args) {
    palindrome("madam");
    palindrome("asia");
  }
}
