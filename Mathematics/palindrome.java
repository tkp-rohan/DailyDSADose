package Mathematics;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int num = number;
        int revNum = 0;
        while(num>0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num/=10;
        }
        if(revNum==number){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}
