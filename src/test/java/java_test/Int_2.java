package java_test;

import java.util.ArrayList;

import org.testng.Assert;

public class Int_2 {

	public static void main(String[] args) {
		int[] num = {6,2,1,8,9,4,2,7,3,10,5,6};
		
		int temp;
		
		for(int i=1;i<num.length;i++) {
			for(int j=i;j>0;j--) {
				if(num[j]<num[j-1]) {
					temp= num[j];
					num[j]=num[j-1];
					num[j-1]=temp;
				}
			}
		}
		
		for(int k=0;k<num.length;k++) {
			System.out.print(" "+num[k]);
		}
		System.out.println();
		ArrayList<Integer> number= new ArrayList<Integer>();
		number.add(num[0]);
		
		for(int i=1;i<num.length;i++) {
			if(num[i]!=num[i-1]) {
				number.add(num[i]);
			}
		}
		for(int i=0;i<number.size();i++) {
			System.out.print(" "+number.get(i));
		}
	}

}



















