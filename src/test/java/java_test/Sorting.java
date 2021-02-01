package java_test;

public class Sorting {

	public static void main(String[]args) {
	int [] num = {50,84,61,12,12,5,2};
	
	int temp;
	for(int i=1;i<num.length;i++) {
		for(int j=i;j>0;j--) {
			if(num[j]<num[j-1]) {
				temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
				
				
			}
		}
	}
	for(int i=0; i<num.length;i++) {
		System.out.print(" "+num[i]);
	}
     
}
	}
