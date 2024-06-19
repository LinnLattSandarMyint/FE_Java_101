package Unit5;

public class J14BubbleSort2 {
 public static void main (String args[]) {
	 int m[]= {1,2,3,4,5};
	 for(int i=0;i<m.length;i++) {
		 for(int j=0;j<m.length-1;j++) {
			 if(m[j]<m[j+1]) {
				 int temp=m[j];
				 m[j]=m[j+1];
				 m[j+1]=temp;
			 }
		 }}
		 System.out.println("After sorted : ");
		 for(int i=0;i<m.length;i++) {
			 System.out.print(m[i]+" ");
		 }
	 }
 }

