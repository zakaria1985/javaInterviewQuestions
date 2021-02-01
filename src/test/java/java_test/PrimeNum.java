package java_test;

import java.io.IOException;



public class PrimeNum {
	
	
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0)
			return false;
			
		}
		return true;
		
	}
	
	public static void getPrimeNum(int num) {
		for(int i=2; i<=num;i++) {
			if(isprime(i)) {
				System.out.print(" "+i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("is the number prime"+">>>>"+isprime(8));
		getPrimeNum(17);
	
	}
	

	

}













