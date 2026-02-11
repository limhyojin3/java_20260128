package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java3_영단어퀴즈_선생님풀이v2 {   //이해완료(+) last 복습 할까?(+)
	
	//// 4. 출제된 적 있는 인덱스는 지워나가는 로직(성능좋은!)
 
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		WordQuiz quiz = new WordQuiz(); //x001
										//ArrayList<Word> list; x002 
										// => list 에 Word 가 17개..
		
		// 변수 선언
		ArrayList<Word> quizList = quiz.getList(); //ArrayList<Word> list; x002
												   //[Word, Word, Word,...] 남은 문제리스트**
		
		//기존 문제리스트
		WordQuiz previousQuiz = new WordQuiz(); //x005
		int previousQuizSize = previousQuiz.getList().size();  
								//ArrayList<Word> list.size(); //x006.size(); //17
		/// **기존의 남은문제리스트의 크기의 값을 복사해서 담아둔다!
		
		//// 4. 출제된 적 있는 인덱스는 지워나가는 로직**
		
		// 랜덤 문제 5개 출제
		// 맞추면 '정답!', 틀리면 '오답!' 출력
		
		for(int i = 0; i < previousQuizSize; i++) { // quizList.size()만큼반복(X) //17 //i=0~16
			
			///** 의문-가설-디버깅-결론
//			(의문) quizList.size()일때는 왜 안되지? 왜 문제 9번에서 멈출까? 
//				 17일때는 잘되는데 
			// => 디버깅 : 조건식 i < quizList.size()가 영향받는것같다.(가설)
			// quizList.size()가 9가 된이후, 다음실행에서 i=8 ,
			// 이때 조건식 i < quizList.size();  8<9 여서 i=8일때는 반복문안의 내용이 실행된다.
			// i=8 반복문 안에서 quizList.size() 는 8이 된다. 그다음실행은 i=9,
			// 이때 조건식 i < quizList.size();  9<8 이라서 반복문을 실행하지않는다!!
			// (10(i+1)번문제가 출력되지않는다!)
			/// 결론: (주의!) 조건식의 변수는, 반복문 안의 실행때문에 영향받을수있다!!**
			
			
			
			int index = ran.nextInt(quizList.size()); //0~16 // 2.반복문 안에서 랜덤 되도록
		
			Word word = quizList.get(index);//리스트는 인덱스로 접근 //남은문제리스트에 접근
			
			Word removed = quizList.remove(index); /// 지워나가는방식 
												   /// ArrayList.remove(인덱스)**
												   /// => 지워진 value 값(Word)을 반환한다
							//x002.remove(index); <-참조값으로 바로 가서 업데이트한다.
							//x002(quizList)에 변화가 생긴다!
			
			
			System.out.println("["+ (i+1) + "번 문제] ");
			System.out.print(word.getEnglish() + " : ");
			String answer = s.next();
			
			if(answer.equals(word.getKorean())) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("오답입니다! 정답은 \'" + word.getKorean() + "\'");
			}
			
			System.out.println("남은문제리스트에서 지금 지워진 문항 : " + removed);
			
			System.out.println("남은 문제 리스트 : " + quizList);
			
			System.out.println("남은 문제 리스트 크기: " + quizList.size());
			
			System.out.println("-----------------------");
		}

		System.out.println("모든 문제가 출제되었습니다. 끝.");
		
		System.out.println("-----------------------");
		System.out.println("기존문제리스트 : " + previousQuiz.getList()); //[Word, Word,...]
		System.out.println("기존문제리스트 크기 : " + previousQuizSize);
	}

}
