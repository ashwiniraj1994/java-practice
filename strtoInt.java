public class strtoInt {
  public static int strtoint(String str){
    int toint = Integer.parseInt(str);
    return toint;
  }

  public static void main(String[] args) {
    System.out.println(strtoint("12345"));
  }
}
