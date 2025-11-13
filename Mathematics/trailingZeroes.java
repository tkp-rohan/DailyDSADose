package Mathematics;

import java.util.Scanner;
public class trailingZeroes {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
         int numOfZeroes = 0;
        
        
        // // int fact=1;
        // while(num>0){
        //     fact*=num--;
        // }
        // while(fact%10==0){
        //     numOfZeroes++;
        //     fact/=10;
        // }


        int i=5;
        while(i<=num){
            numOfZeroes += num/i;
            i*=5;
        }


        System.out.println(numOfZeroes);

        sc.close();
    }
}
