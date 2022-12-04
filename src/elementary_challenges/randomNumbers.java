package elementary_challenges;

/**
 * Generate a program to generate 5 random numbers between 0 and 100
 */
public class randomNumbers {

    public static void main(String[] args){
        System.out.println("  ");
        for (int i = 1; i<= 5; i++){
            System.out.println((int) Math.random()*100);
        }
    }
}
