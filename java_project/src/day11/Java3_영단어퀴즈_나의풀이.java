package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java3_영단어퀴즈_나의풀이 {  //복습완료(+)

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		WordQuiz quiz = new WordQuiz(); //ArrayList<Word> list; => Word 가 17개..
		
		// 변수 선언
		ArrayList<Word> quizList = quiz.getList(); //ArrayList<Word> list; 
												   //[Word, Word, Word,...] 
												   //리스트는 인덱스로 접근(0~16)
		
		
		// 랜덤 문제 5개 출제
		// 맞추면 '정답!', 틀리면 '오답!' 출력
		
		//3. 같은 영단어 문제가 출제되지않도록.. -> 영단어를 담아둘 리스트를 생성..
		ArrayList<String> englishList = new ArrayList<>(); //[String,String..]
		
		
		for(int i = 0; i < 5; i++) { //랜덤 문제 5개 출제
			
			int random = ran.nextInt(17); //랜덤숫자 : 0~16 // 2.반복문 안에서 랜덤 되도록
			
			Word word = quizList.get(random); //리스트는 인덱스로 접근(0~16)
			
			
			//검증
			//영단어 리스트에 있는지 없는지 확인        //ArrayList.contains(value);
			boolean check = englishList.contains(word.getEnglish());
			
			//영단어 리스트에 있다!
			if(check) {
				i--; //i++로 가기전에 i--해준다.
				continue; //랜덤숫자 다시 뽑는다 //i++로 간다
			}
			// 영단어 리스트에 없다!
			
			System.out.println("["+ (i+1) + "번 문제] ");
			System.out.print(word.getEnglish() + " : "); //영어 : 한글
			String answer = s.next();
			
			if(answer.equals(word.getKorean())) { //영어 : 한글
				System.out.println("정답입니다!");
			}else {
				System.out.println("오답입니다! 정답은 \'" + word.getKorean() + "\'");
			}
			
			englishList.add(word.getEnglish()); //ArrayList.add(value);
												//ArrayList.add(String);
			
		}
		
		System.out.println("englishList = " + englishList); 
		
	}

}
