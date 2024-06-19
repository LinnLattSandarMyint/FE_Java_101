package Unit5;

public class j02Arraywithlooping {
	public static void main(String[] args) 
	 { int[] mark=new int[5];
	  for(int i=0;i<5;i++) {
		  mark[i]=100 *(i+1);
	  }
	  for(int j=0;j<5;j++) {
		  System.out.println(mark[j]);
	  }
	 }
}
