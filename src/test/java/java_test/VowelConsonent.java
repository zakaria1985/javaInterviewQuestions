package java_test;

public class VowelConsonent {

	public static void main(String[] args) {
		String st = "AbcdEfoudvnhiun";
		String [] letter = st.toLowerCase().split("");
		
		for(int i=0;i<letter.length;i++) {
			if(letter[i].matches("a")||letter[i].matches("e")||letter[i].matches("i")||letter[i].matches("o")||letter[i].matches("u")) {
				System.out.print(" "+ letter[i]);
			}
			
			else {
			
				System.out.print("");
			}
		}

	}

}
