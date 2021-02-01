package java_test;

public class Febannaci {

	public static void main(String[] args) {
		
		
		System.out.println(fabannoci(7));

	}
	
	public static  int fabannoci(int num) {
		if(num<=1) {
			
			return num ;
		}
		else {
			return (fabannoci( num-1)+fabannoci(num-2));
		}
	}

}
