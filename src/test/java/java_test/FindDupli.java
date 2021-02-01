package java_test;

import java.util.HashMap;
import java.util.Map;

public class FindDupli {

	public static void main(String[] args) {
	String st = "hellow how are are you hellow";
	String [] word =st.split(" ");

	Map<String,Integer>map= new HashMap<String,Integer>();
	
	for(String x:word) {
		if(map.containsKey(x)) {
			map.put(x, map.get(x)+1);
				
			}
		else {
			map.put(x, 1);
		}
	}
	System.out.print(" "+map);
	System.out.println();
	
	for(String y:map.keySet()) {
		if(map.get(y)>1) {
			System.out.print(y +" "+map.get(y));
		}
	}
	}
	

}








