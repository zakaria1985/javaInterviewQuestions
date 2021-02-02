package java_test;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupliWord {

	public static void main(String[] args) {
		String st= "hellow hellow world begin new world";
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
		System.out.println(map);
		System.out.println();
		
		for(String z:map.keySet()) {
			if(map.get(z)>1) {
			System.out.print(" "+z+" "+map.get(z));
		}}
	}

	
	
}
