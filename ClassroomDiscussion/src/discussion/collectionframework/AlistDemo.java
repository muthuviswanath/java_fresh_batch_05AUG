package discussion.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;


public class AlistDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("John");
		al.add("David");
		al.add("Scott");
		al.add("Smith");
		al.add("John");

		//iterate the arraylist
		System.out.println(al);

		//iterate using for loop
		for(int i =0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//iterate using while loop
		int j = 0;
		while (j < al.size()) {
			System.out.println(al.get(j));
			j++;
		}
		
		//iterate using do-while loop
		int k = 0;
		do {
			System.out.println(al.get(k));
			k++;
		} while (k < al.size());
		
		//iterate using for-each loop
		for (String s : al) {
			System.out.println(s);
		}
		
		//iterate using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}

