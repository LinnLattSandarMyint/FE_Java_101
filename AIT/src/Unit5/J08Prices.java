package Unit5;

public class J08Prices {
 public static void main (String args[]) {
	 double prices[]= {2.34,7.89,1.34,2.45,3.35,2.25,4.45,5.15,5.16,2.16};
	 
	 double sum=0;
	 for(int i=0;i<prices.length;i++) {
		 sum+=prices[i];
	 }
	 System.out.println("The sum of the prices : "+sum);
	 System.out.println("Less than 5 : ");
	 for(int i=0;i<prices.length;i++) {
		 if(prices[i]<5) {
			 System.out.println(prices[i]);
		 }
	 }
	 double avg=sum/prices.length;
	 System.out.println(" Avg of the price : "+avg);
	 System.out.println("Higher than avg : ");
	 for(int i=0;i<prices.length;i++) {
		 if(prices[i]>avg) {
			 System.out.println(prices[i]);
		 }
	 }
 }
}
