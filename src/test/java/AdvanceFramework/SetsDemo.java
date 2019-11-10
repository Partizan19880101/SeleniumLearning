package AdvanceFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		// HashSet - Does not maintain order
		Set<String> set = new HashSet<String>();

		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Honda");
		//System.out.println(set);

		for (String item: set){
			System.out.println(item);
		}
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lHset = new LinkedHashSet<String>();
		lHset.add("BMW");
		lHset.add("Audi");
		lHset.add("Honda");
		System.out.println("Linked");
		for (String item: lHset){
			System.out.println(item);
		}

		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> tset = new TreeSet<String>();
		tset.add("BMW");
		tset.add("Audi");
		tset.add("Honda");
		System.out.println("Tree");
		for (String item: tset){
			System.out.println(item);
		}

		List<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		list.add("Honda");
		//System.out.println(list);

		
	}

}
