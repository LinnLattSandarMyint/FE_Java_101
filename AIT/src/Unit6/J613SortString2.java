package Unit6;

public class J613SortString2 {
	public static void main(String args[]) {
		String[] students= {"LinLin","AyeAye","LuLu","AaeAae","BonBon","BiBi"};
		System.out.println("Before sorting : ");
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i]+" ");
		}
		System.out.println("\nAfter sort : ");
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<students.length-1;j++) {
				if((students[j].compareTo(students[j+1])<0)) {
					String temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i]+" ");
		}
	}
}
