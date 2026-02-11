package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java3_영단어퀴즈_선생님풀이v1 {  //복습완료(+)

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		WordQuiz quiz = new WordQuiz(); //ArrayList<Word> list; => Word 가 17개..
		
		// 변수 선언
		ArrayList<Word> quizList = quiz.getList(); //ArrayList<Word> list; 
												   //[Word, Word, Word,...] 총단어리스트
		
		ArrayList<String> questionList = new ArrayList<String>(); //출제된영단어리스트
		
		
		// 랜덤 문제 10개 출제
		// 맞추면 '정답!', 틀리면 '오답!' 출력
		
		for(int i = 0; i < 10; i++) {
			
			int index = ran.nextInt(quizList.size()); //0~16 // 2.반복문 안에서 랜덤 되도록
			
			Word word = quizList.get(index); //ArrayList는 인덱스로 접근-> Word 리턴
			
			//출제된영단어리스트에 , 방금뽑은랜덤한 word 의 영어이름(getEnglish())가 있는지 확인
			boolean quizFlg = questionList.contains(word.getEnglish()); //ArrayList.contains(value);
																		//ArrayList.contains(String);
			
			//출제된 영단어리스트에 word 의 영어이름이 있는경우!
			if(quizFlg) {
				i--; //i++로 가기전에 i--해준다.
				continue; //다시 뽑아! i++로 간다.
			}
			
			//출제된 영단어리스트에 word 의 영어이름이 없는경우!
			//정상로직
			System.out.println("["+ (i+1) + "번 문제] ");
			System.out.print(word.getEnglish() + " : ");
			String answer = s.next();
			
			if(answer.equals(word.getKorean())) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("오답입니다! 정답은 \'" + word.getKorean()+ "\'");
			}
			
			//출제된 영단어리스트에,  word 의 영어이름을 추가해준다.
			questionList.add(word.getEnglish()); //ArrayList.add(String);
			
			System.out.println("questionList = " + questionList);//출제된 영단어리스트
		}
	}

}
