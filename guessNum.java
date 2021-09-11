import java.util.*;

public class guessNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Guesss number in between 0 to 100: ");
        

        int r=rand.nextInt(100);
        
        int a=sc.nextInt();
        int i;
        for(i=0;i<100;i++){
            if(a==r){
                System.out.println("you guessed right number");
                break;
            }
            else if(a<r){
                System.out.print("you guessed wrong please tell bigger number: ");
                a=sc.nextInt();
                continue;
            }
            else if(a>r){
                System.out.print("you guessed wrong please tell smaller number: ");
                a=sc.nextInt();
                continue;
            }

        }
        System.out.println("In just "+i+" attempts");
    }
}