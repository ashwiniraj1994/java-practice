public class DecToOct {
  public static void DecToOct(int num){
    int Number = num;
    String octal = "";
    int rem = 0;
    while (num > 0) {
      rem = num % 8;
      octal =  rem + octal;
      num = num/8;
    }
    System.out.println("Octal Equivalent of " + Number + " is " + octal);
  }
  public static void main(String[] args) {
    DecToOct(46);
    DecToOct(70);
  }
}
