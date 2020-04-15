import java.util.Scanner;

public class CountDown {
    public static void main(String args[]) {
        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();
        int i;
        for (i = userInput; i > 0; i -= 1){
            System.out.println(i);
        }


        // use for loop

    }
}