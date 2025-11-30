package Recursions;

import java.util.*;
public class p1 {

    public static void fun(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println("GFG");
        fun(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
        sc.close();
    }

}
