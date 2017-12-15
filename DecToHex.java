public class DecToHex {
  public static void DecToHex(int num){
     int Number = num;
     String hexa = "";
     char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     int rem = 0;
     while (num > 0){
        rem = num % 16;
        hexa =  hexaDecimals[rem] + hexa;
        num = num/16;
     }
     System.out.println("HexaDecimal Equivalent of " + Number + " is " + hexa);
    }
    public static void main(String[] args) {
      DecToHex(20);
      DecToHex(67);
    }
}
