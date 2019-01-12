package cn.itcast.booktest;

import java.util.*;

import cn.itcast.domain.Item;


public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster",1234));
		parts.add(new Item("Widget",4562));
		parts.add(new Item("Modm",9912));
		System.out.println(parts);
		
		NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}

}
