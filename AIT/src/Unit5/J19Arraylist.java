package Unit5;
import java.util.ArrayList;
import java.util.Iterator;
public class J19Arraylist {

	public static void main(String [] args) {
		ArrayList town=new ArrayList();
		town.add("Wundwin");
		town.add("Meiktila");
		town.add("Thedaw");
		town.add("Mandalay");
		Iterator itr=town.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		town.remove("Meiktila");
		System.out.println("Whole list : "+town);
		System.out.println("Position 1 "+town.get(1));
	}
}
