import java.util.Arrays;
public class ArrayEqualString {
  public static void main(String[] args) {
        String[] arr1 = {"ashu", "rooha", "jaanu", "rohith"};
        String[] arr2 = {"rohith", "ashu", "rooha", "jaanu"};
        String[] arr3 = {"ashu", "rohith", "gannu", "spoo"};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
    }
}
