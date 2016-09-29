package Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("susane");
		al.add("yashik");
		al.add("honn");

		System.out.println(al.get(0));
    
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			if (element.equals("y"))   itr.remove();
			System.out.print(element + " ");
		}

	}

}
