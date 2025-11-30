package Mathematics;


// Java program to check if the given number is palindrome.

import java.util.Scanner;
public class Mathp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while(temp>0){
            int dig = temp%10;
            rev = rev*10 + dig;
            temp= (int)Math.floor(temp/10);
        }

        if(rev == num){
            System.out.println(num+" is a Palindrome number.");
        }
        else{
            System.out.println(num+" is not a Palindrome number.");
        }
        sc.close();
    }
}
