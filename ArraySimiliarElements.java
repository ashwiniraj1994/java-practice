public class ArraySimiliarElements {

      public static void main(String a[]){
          int[] arr1 = {3,12,4,45,6};
          int[] arr2 = {3,2,12,9,45,54,6};
          for(int i=0;i<arr1.length;i++){
              for(int j=0;j<arr2.length;j++){
                  if(arr1[i]==arr2[j]){
                      System.out.println(arr1[i]);
                  }
              }
          }
      }
  }
