package java_test;

public class Encripted {

	public static void main(String[] args) {
		String st = "zakaria motin";
		int key=1;
		char encripted ;
		
		char [] letter =st.toLowerCase().toCharArray();
		for(char x:letter) {
			encripted =(char)(x+key);
			System.out.print(encripted);
		}
		
	}

}
