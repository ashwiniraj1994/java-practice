public class largestOfThreeNumbers {
  public static int largestOfNum(int first, int second, int third){
    if (first > second && first > third) {
      return first;
    } else if (second > first && second > third) {
      return second;
    } else if (third > second && first > third) {
      return third;
    } else {
      System.out.println("The numbers " + first + " " + second + " " + third + " are not distinct");
    }
    return Integer.MIN_VALUE;
 }

  public static void main(String[] args) {
    System.out.println(largestOfNum(34,67,54));
    System.out.println(largestOfNum(3456,645,234));
  }
}
