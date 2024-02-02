package gittestpackage;
import java.util.Scanner;

public class NumberTest {
	public static void main(String[] arg) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int n=scn.nextInt();
		if(n<2)
		{
			System.out.println("not a prime number");
			return;
		}
		else {
		for(int i=2; i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" not a prime number");
				return;
			}
		}
			System.out.println("Prime Number");
	}
scn.close();
}
}
