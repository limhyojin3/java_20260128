package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 수도퀴즈_선생님풀이 { //복습(+)
	
	public static void main(String[] args) {  
		
		Scanner s = new Scanner(System.in);
		CapitalQuiz obj = new CapitalQuiz();
		ArrayList<Quiz> quizList = obj.getList();//[0~31개?]
		
		ArrayList<String> questionList = new ArrayList<>(); //출제된 문제 리스트
		
		ArrayList<Integer> selectList = new ArrayList<>(); // 보기 인덱스 관리 리스트
		//selectList에는 정답인덱스를 포함해서, 다른 퀴즈들 인덱스가 밸류값으로 들어가있음.
		//[13,14,5,7] 예를들어 7이 정답.
		
		Random ran = new Random();
		
		int count = 0;
		while(true) {
			System.out.print("몇문제 풀래? : ");
			count = s.nextInt();
			if(count > quizList.size() || count < 3) {
				System.out.println("최대 문제 수는 " + quizList.size() + ", 최소 문제 수는 3문제 입니다.");
				continue;
			} 
			break;
		}
		for(int i=1; i<=count; i++) {
			selectList.clear();///
			int ranNum = ran.nextInt(quizList.size());
			Quiz quiz = quizList.get(ranNum); //17번 인덱스에 있는 퀴즈 가져옴.
			
			if(questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}
											   
			int correctIndex = ran.nextInt(4); //3번에 정답위치
			for(int j=0; j<4; j++) {//0~3번 보기
				
				int index = ran.nextInt(quizList.size()); //문제인덱스 총4개 나오겠지만 하나는 활용안함.
				
				if(correctIndex == j) { //정답위치(3번)==3번보기
					selectList.add(ranNum); //17번인덱스퀴즈
					
				} else if(selectList.contains(index) || index == ranNum) { // 이미 보기에 있거나 정답과 같을 경우 다시 시도
					j--;
				} else { // 정답 외 값들 보기에 추가
					selectList.add(j, index);
				}
			}
			
			//selectList에는 정답인덱스를 포함해서, 다른 퀴즈들 인덱스가 밸류값으로 들어가있음.
			//[13,14,5,7] 예를들어 7이 정답.
			
			
			
			questionList.add(quiz.getCountry());
			
			System.out.println(i + ") " + quiz.getCountry() + " 수도? ");
			
			for(int j = 0; j < 4; j++) {  //보기 작성하기 [1][2][3][4]
				System.out.print("["+(j+1)+"] " + quizList.get(selectList.get(j)).getCapital() + " ");
			}
			System.out.print(": ");
			int answer = s.nextInt();//1~4
			
			//answer-1=> 0~3   , selectList.get(0~3);=>[17,14,5,6]
			if(quizList.get(selectList.get(answer-1)).getCapital().equals(quiz.getCapital())) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!"); 
			}
			
		}
		
		///예시를 눈으로 보면서 해야한다. 안그럼 이해가 잘안됨.
		
	}
}
