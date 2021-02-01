package java_test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class RemoveWord {

	public static void main(String[] args) {
		String st= "sillyspiders";
		String [] word =st.split("");
		
		Set<String>set= new LinkedHashSet<String>();
		for(String x:word) {
			set.add(x);
		}
		Iterator<String> itr =set.iterator();	
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
	}

}
