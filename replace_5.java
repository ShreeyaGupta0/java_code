package Assignment_1;

import java.util.Scanner;

/*
Given a integer as a input and replace all the '0' with '5' in the integer
Input Format
Enter an integer n
Constraints
0<=n<=1000000000000
Output Format
All zeroes are replaced with 5
Sample Input
102
Sample Output
152
*/
public class replace_5 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = 0;
        long a = 0;
        long r = 0;
        if(n==0){
            a = 5;
        }else{
            while(n!=0){
                d = n%10;
                if(d==0){
                    d = 5;
                }
                r = r*10+d;
                n/=10;
            }
            while(r!=0){
                d = r%10;
                a = a*10+d;
                r/=10;
            }
        }
        System.out.println(a);
    }
}
    

