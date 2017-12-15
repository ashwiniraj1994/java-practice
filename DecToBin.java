import java.util.Scanner;

public class DecToBin {

  public static void DecToBin(int num){
    int Number = num;
    String binary = "";
    int rem = 0;
    while (num > 0){
      rem = num % 2;
      binary =  rem + binary;
      num = num/2;
    }
    System.out.println("Binary Equivalent of " + Number + " is " + binary);
}
public static void main(String[] args){
  DecToBin(50);
  DecToBin(34);
}
}
