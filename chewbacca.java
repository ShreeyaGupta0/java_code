package Assignment_1;
/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting 
digits in them. Inverting digit t means replacing it with digit 9 - t.
Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some 
(possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.
Constraints
x <= 100000000000000000
Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. 
The number shouldn't contain leading zeroes.
Sample Input
4545
Sample Output
4444
*/
import java.util.*;
public class chewbacca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 0;
        long a = 0;
        long d = 0;
        long m = 0;
        while(n>0){
            d=n%10;
            m = m*10+d;
            n/=10;
        }
        int e = 0;
        while(m>0){
            d = m%10;
            long d1 = 9-d;
            if(d==9 && e==0){
                d = 9;
                e = 1;
            }
            else{
                if(d>d1){
                    d = d1;
                }
            }
            r = r*10+d;
            m = m/10;
            }
            System.out.println(r);
        }
    }
    

