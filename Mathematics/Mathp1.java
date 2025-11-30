package Mathematics;


// Java program to count number of digits in an integer
import java.util.Scanner;
public class Mathp1 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;

        while(temp>0){
            count++;
            temp/=10;
        }
        System.out.println("Number of digits in "+num+" is: "+count);
        sc.close();
    }
}
