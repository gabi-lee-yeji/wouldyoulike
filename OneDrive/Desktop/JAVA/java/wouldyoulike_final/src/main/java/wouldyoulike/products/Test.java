package wouldyoulike.products;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(24); list.add(64);
		list.add(22);
		list.add(29);
		list.add(21);
		list.add(34);
		list.add(27);
		list.add(74);
		
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(26);
		list.add(75);
		HashSet<Integer> set2 = new HashSet<Integer>(list);
		for(int a : set2) {
			list.remove(Integer.valueOf(a));
		}
		list.add(23);
		list.add(33);
		list.add(28);
		list.add(65);
		list.add(25);
		list.add(31);
		list.add(32);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(26);
		list.add(75);
		System.out.println(list);
		HashSet<Integer> set1 = new HashSet<Integer>(list);
		for(int a : set1) {
			list.remove(Integer.valueOf(a));
		}
		
		list.add(33);
		list.add(22);
		list.add(28);
		list.add(30);
		list.add(31);
		list.add(35);
		HashSet<Integer> set3 = new HashSet<Integer>(list);
		for(int a : set3) {
			list.remove(Integer.valueOf(a));
		}
		System.out.println(set2);
		System.out.println(set1);
		System.out.println(set3);
		System.out.println(list);
	}

}
