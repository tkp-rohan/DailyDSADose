

package Mathematics;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numOfDigits = 0;
        int lastDigit = 0;
        while(num!=0){
            lastDigit = Math.floorDiv(num, 10);
            num/=10;
            numOfDigits++;
        }
        System.out.println(numOfDigits);
        sc.close();
    }
}
