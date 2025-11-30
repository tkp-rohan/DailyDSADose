package Mathematics;

// Java program to find the number of trailing zeroes in the factorial of a number.

import java.util.Scanner;
public class Mathp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0; 
        for(int i=5; num/i>=1; i*=5){
            count += (int)Math.floor(num/i);
        }
        System.out.println("Number of trailing zeroes in "+num+"! is: "+count);
        sc.close();
    }
}
