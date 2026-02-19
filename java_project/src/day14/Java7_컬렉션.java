package day14;

import java.util.ArrayList;
import java.util.Random;

public class Java7_컬렉션 {  //복습(+)

	public static void main(String[] args) {

		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> haveToBeChecked = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			haveToBeChecked.add(i);
		}
//		System.out.println(willBeChecked); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		for(int i = 0; i < 10; i++) {
			
			int num = ran.nextInt(10) + 1; //1~10사이 랜덤숫자
			
			if(!(haveToBeChecked.contains(num))) {
				i--;
				continue;
			}
			
			list.add(num); //10
			haveToBeChecked.remove(Integer.valueOf(num)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
			
		}
		System.out.println(list);
		
		
//		
//		for(int i = 0; i < 10; i++) {
//			
//			int num = ran.nextInt(10) + 1;
//			
//			if(list.contains(num)) {
//				i--;
//				continue;
//			}
//			
//			list.add(num);
//		}
//		
//		System.out.println(list);
	}

}
