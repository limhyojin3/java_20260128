package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2_영단어퀴즈_나의풀이 { //복습완료(+)

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		WordQuiz quiz = new WordQuiz(); //x001 -> ArrayList<Word> list;(x002)
		
		ArrayList<Word> quizList = quiz.getList(); //x001.getList(); -> x002->[Word, Word, Word,...]
												   //리스트는 인덱스로 접근
						   //x002.size(); ->17
		for(int i = 0; i < quizList.size(); i++) { 
			System.out.println(quizList.get(i).getEnglish()); 
										//Word.getEnglish();
		}
		
		
		System.out.println("-------------------------");
		
		Word w = quizList.get(2);  //리스트는 인덱스로 접근 //17개 : 0~16 
		System.out.print(w.getEnglish() + " : "); // 영단어 : (한글)
		String answer = s.next();
		
		if(w.getKorean().equals(answer)) {
			System.out.println("정답!!");
		} else {
			System.out.println("오답!! 정답은 \'" + w.getKorean() + "\'");
		}
		
	}

}
