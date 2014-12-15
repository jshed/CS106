import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Jordan");
		list.add("is");
		list.add("awesome");
		
		Iterator<String> i = new list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
