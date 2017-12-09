public class swapNumbers {
  public static void swap(int n1, int n2){
    System.out.println("Before swapping " + n1 + " " + n2);
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
    System.out.println("After swapping " + n1 + " " + n2);
  }

  public static void main(String[] args) {
    swap(65,34);
  }
}
