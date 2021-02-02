package java_test;

import java.util.ArrayList;

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
	System.out.println();
	ArrayList<Integer>number= new ArrayList<Integer>();
	number.add(num[0]);
	for(int i=1;i<num.length;i++) {
		if(num[i]!=num[i-1]) {
			number.add(num[i]);
		}
	}
     for(int i=0;i<number.size();i++) {
    	 System.out.print("after sorting "+" "+number.get(i));
     }
}
	}
