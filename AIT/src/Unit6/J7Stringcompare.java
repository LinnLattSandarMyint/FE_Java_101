package Unit6;

public class J7Stringcompare {

	public static void main(String[] args) {
		int r;
		String s1="AIT";
		String s2="MIT";
		
		r=s1.compareTo(s2);
		if(r<0) {
			System.out.println("S1 is less than S2");
			
		}else if(r>0) {
			System.out.println("S2 is greater than S1");
		}else {
			System.out.println("They are same");
		}

	}

}
