public class sumOfDigit {
  public static void sumOfDigit(int num){
    int sum = 0;
    while (num > 0) {
        sum = sum + num % 10;
        num = num / 10;
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    sumOfDigit(2345);
    sumOfDigit(10456);
  }
}
