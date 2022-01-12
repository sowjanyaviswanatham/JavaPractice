package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("sowjanya");
		list1.add("prasad");
	//	Iterator itr = list1.iterator();
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
