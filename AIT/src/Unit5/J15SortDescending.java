package Unit5;
import java.util.Arrays;
public class J15SortDescending {
 public static void main (String args[]) {
	 int [] arr= {10,14,36,27,43,18};
	 System.out.println("Before Sorting : ");
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 Arrays.sort(arr);
	 System.out.println("\nAfter sorting : ");
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }
 }
}
