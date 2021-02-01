package java_test;

public class Int_1 {

	public static void main(String[] args) {
		String st= "Madam";
		String [] letter= st.toLowerCase().split("");
		String rev="";
	for(int i=letter.length-1;i>=0;i--) {
		rev= rev+letter[i];
}	
	System.out.println(rev);
	
	if(rev.equalsIgnoreCase(st)) {
		System.out.println("this is palindorme");
	}
	else {
		System.out.println("this is not palindorme");
	}
	
	
	}
	

}
