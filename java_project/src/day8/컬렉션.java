package day8;

import java.util.ArrayList;

public class 컬렉션 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		ArrayList<String> list = new ArrayList<String>(); //[zz, zz]
		list.add("zz");
		list.add("zz");
//		list.add(11);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
//		list2.add("zz");
		
		ArrayList<Object> list3 = new ArrayList<Object>(); //[1, z, [zz, zz]]
		list3.add(1);
		list3.add("z");
		list3.add(list);
		System.out.println(list3);
		
	}

}
