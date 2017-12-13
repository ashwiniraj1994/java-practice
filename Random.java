import java.util.concurrent.ThreadLocalRandom;
public class Random {
    public static void main(String[] args){
      System.out.println("Random integers");
        for(int i = 0; i < 3; i++){
            System.out.println("Random Integers : "+ThreadLocalRandom.current().nextInt());
        }
        System.out.println("Random doubles");
         for(int i = 0; i < 3; i++) {
            System.out.println("Random Doubles : "+ThreadLocalRandom.current().nextDouble());
        }
        System.out.println("Random booleans");
        for(int i = 0; i < 3; i++){
            System.out.println("Random booleans : "+ThreadLocalRandom.current().nextBoolean());
        }
    }
}
