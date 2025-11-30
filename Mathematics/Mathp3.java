package Mathematics;


// Java program to find the factorial of a number.

import java.util.Scanner;
public class Mathp3 {

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int fact = 1;
        // for(int i=1; i<=num; i++){
        //     fact *= i;
        // }
        
        int fact = factorial(num);
        System.out.println("Factorial of "+num+" is: "+fact);
        sc.close();
    }   
    
}
