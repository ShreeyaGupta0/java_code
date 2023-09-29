package Assignment_1;
import java.util.*;
public class check_prime_no {
    
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),f=0;
		for(int i=2;i<=N/2;i++){
			if(N%i==0){
				f=1;
				break;
			}
		}
		if(f==0)
		System.out.println("Prime");
		else
		System.out.println("Not Prime");
	}
}

