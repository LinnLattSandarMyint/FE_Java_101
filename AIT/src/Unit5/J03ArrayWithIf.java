package Unit5;

public class J03ArrayWithIf {
 public static void main(String args[]) {
	 boolean flag=false;
	 int[] mark=new int[5];
	 for(int i=0;i<5;i++) {
		 mark[i]=100+(100*i);
		 System.out.println(mark[i]);
	 }
	 for(int j=0;j<5;j++) {
		 if(mark[j]==200) {
			 flag=true;
			 if(flag==false) {
				 System.out.println("Not found!!!");
			 }else {
				 System.out.println("Found!!");
			 }
		 }
	 }
	 
 }
}
