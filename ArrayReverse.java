import java.util.Arrays;

public class ArrayReverse{
  public static void reverseArray(int Array[]){
        System.out.println("Array Before Reverse : "+ Arrays.toString(Array));
        int temp;
        for (int i = 0; i < Array.length/2; i++){
            temp = Array[i];
            Array[i] = Array[Array.length-1-i];
            Array[Array.length-1-i] = temp;
        }
        System.out.println("Array After Reverse : "+ Arrays.toString(Array));
    }
  public static void main(String[] args){
        reverseArray(new int[]{3,4,6,5,7});
        System.out.println("-------------------------");
        reverseArray(new int[]{13,43,54,35,67,98});
        System.out.println("-------------------------");
        reverseArray(new int[]{123,456,435,456,375,987});
    }
}
