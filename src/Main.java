import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //rock=0
        //paper=1
        //scissor=2
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 0 For Rock Or Press 1 For Paper Else Press 2 For Scissor");
        int User_Input= sc.nextInt();
        System.out.println(User_Input);

        Random rnd= new Random();
        int Computer_Input= rnd.nextInt(3);

        if (Computer_Input==User_Input){
            System.out.println("The Match is Draw");

        } else if (Computer_Input==0 && User_Input==1 || Computer_Input==1 && User_Input==2 || Computer_Input==2 && User_Input==0){
            System.out.println("Great! You Wins");

        } else{
            System.out.println("You Loose :( ...Computer Wins");
        }

        System.out.println("Computer's Choice was " + Computer_Input);

        if (Computer_Input==0){
            System.out.println("Computer's Choice Was Rock");

        }else if (Computer_Input==1){
            System.out.println("Computer's Choice Was Paper");

        }else {
            System.out.println("Computer's Choice Was Scissor");
        }

    }
}