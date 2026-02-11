package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java4_영단어퀴즈_선생님풀이 { //Java3_영단어퀴즈_선생님풀이v1 에 이어서.. //복습완료(+)
	
											 //총문제리스트               //(출제된 영단어리스트) 
	public static void runQuiz(ArrayList<Word> quizList, ArrayList<String> questionList) {
		
		Scanner s = new Scanner(System.in);
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) { //0<=i<17
			
			//검증
			// 총문제리스트 크기 == 출제된 영단어리스트 크기
			if(quizList.size() == questionList.size()) {
				System.out.println("남은 문항이 존재하지않습니다.");
				break; // for 문을 빠져나간다.
			}
			
			
			
			int index = ran.nextInt(quizList.size()); //0~16 // 2.반복문 안에서 랜덤 되도록
			
			Word word = quizList.get(index); //apple:사과
			
			//출제된리스트에 포함되어있는지 확인
			boolean quizFlg = questionList.contains(word.getEnglish());
			
			if(quizFlg) {
				i--; //i++로 가기전에 i--해준다
				continue; //랜덤숫자 다시뽑아 i++로간다
			}
			
			System.out.println("["+ (i+1) + "번 문제] ");
			System.out.print(word.getEnglish() + " : ");
			String answer = s.next();
			
			if(answer.equals(word.getKorean())) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("오답입니다! 정답은 " + word.getKorean());
			}
			
			questionList.add(word.getEnglish()); //출제된리스트에 영단어를담아두기
			
		} //문제 전부 출제됨.
		
		
	}
	
	public static void addQuiz(WordQuiz quiz) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("영어 : ");
		String english = s.next();
		
		System.out.print("한국어 : ");
		String korean = s.next();
		
		quiz.setWord(english, korean); // 참조값으로 바로 가서 , 문제등록[영어:한국어]
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		WordQuiz quiz = new WordQuiz(); //x001  ArrayList<Word> list;(x002)
		ArrayList<Word> quizList = quiz.getList(); //x001.getList(); ->x002  //총문제리스트
		
		ArrayList<String> questionList = new ArrayList<String>(); 
		//출제된 문제 담아두기(출제된 영단어리스트)
		
		while(true) {
			System.out.print("[1. 문제 풀이, 2. 문제 추가, 3. 문제 수 확인 ] : ");
			int menu = s.nextInt();
			
			switch (menu) {
				case 1:
					runQuiz(quizList, questionList);
					break;
				case 2:
					addQuiz(quiz); //addQuiz(x001);
					break;
				case 3: ///////////////(+)
					System.out.println("현재 등록된 문제 수는 " + quizList.size() + "개 입니다.");
					break;
				default:
					break;
			
			}
		}
	}
}
