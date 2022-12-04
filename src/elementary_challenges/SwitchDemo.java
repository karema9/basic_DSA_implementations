package elementary_challenges;

/**
 * Write a program to display according to the marks obtained
 */
public class SwitchDemo {
    public static void main(String[] args){
        int marks = Integer.parseInt(args[0]);

        switch(marks/10){
            case 10:
                System.out.println("Excellent");
            case 9:
                System.out.println("Average");
            case 8:
                System.out.println("Below Average");

            System.out.println("Excellent");
            break;
        }
    }
}
