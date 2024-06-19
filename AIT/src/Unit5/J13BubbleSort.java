package Unit5;

public class J13BubbleSort {
 public static void main (String args[]) {
	 int marks[]= {50,40,30,20,10};
	 int temp;
	 System.out.print("Before Sorting : ");
	 for(int i=0;i<marks.length;i++) {
		 System.out.print(marks[i]+" ");
	 }
	 for(int i=0;i<marks.length;i++) {
		 for(int j=0;j<marks.length-1;j++) {
			 if(marks[j]>marks[j+1]) {
				temp=marks[j];
				marks[j]=marks[j+1];
				marks[j+1]=temp;
			 }
		 }
	 }
	 System.out.print("\nAfter Sorting : ");
	 for(int i=0;i<marks.length;i++) {
		 System.out.print(marks[i]+" ");
	 }
 }
}
