package day16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame{ 
	
//	JButton[] btn = new JButton[10];
	
	int num = 1;  //숫자와 똑같은 애들만 제거되도록.
	Container c; 
	Random ran = new Random();
	long startTime;
	
	public Quiz1() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);   ///배치관리자  => 내가 원하는 위치에 배치하고싶으면 배치관리자를 null 로 해야함.
		
		//1.1~10 텍스트를 가지는 버튼 10개 만들어서 부착하기
		// ->랜덤한 위치에
		// ->버튼의 크기는 50x50
		
		
		
		setSize(600, 600);
		setVisible(true);
		
//		int width = c.getWidth();
//		int height = c.getHeight();
//		System.out.println(width); //584  //타이틀을 제외한 컨테이너 가로길이
//		System.out.println(height); //561 //타이틀을 제외한 컨테이너 세로길이
		
		createBtn(); //화면에 버튼을 뿌려줌.
		
	}

	void createBtn() {
		
		for(int i = 1; i <= 10; i++) {  ///1~10까지 끝나면 다시 처음부터 진행되도록. => createBtn() 메소드, 재귀
			
			JButton btn = new JButton(i + ""); //[1,2,3,4,5,6,7,8,9,10]
			
//			int x = ran.nextInt(width - 50); //타이틀을 제외한 컨테이너 가로길이 - 버튼크기
//			int y = ran.nextInt(height - 50); //타이틀을 제외한 컨테이너 세로길이 - 버튼크기
			int x = ran.nextInt(500);
			int y = ran.nextInt(500);
			btn.setLocation(x, y);
			
			btn.setSize(50, 50);  //버튼 좌표(x,y)는 버튼의 좌상단의 x,y 좌표 위치임.
			
			c.add(btn); //컨테이너에 버튼달기
			
			btn.addActionListener(new ActionListener() {  //버튼 하나하나에 액션리스너 달기
				
				@Override
				public void actionPerformed(ActionEvent e) { //버튼을 클릭하면

					JButton selectBtn = (JButton) e.getSource(); //버튼을 선택
					
					String removeNum = num + "";
					
					if(selectBtn.getText().equals(removeNum)) {
						
						if(num == 1) {
							startTime = System.currentTimeMillis();
							System.out.println(startTime);
						}
						
						c.remove(selectBtn);
						c.repaint();
						num++;
						
						if(num == 11) {
							long lastTime = System.currentTimeMillis();
							System.out.println((lastTime - startTime) / 1000.0);
							
							num = 1;  //1 로 초기화.
							createBtn(); ///재귀함수 : 메서드 내에서 자기를 다시 호출.
							
						}
					}
					
//					if(Integer.parseInt(selectBtn.getText()) == num) {
//						
//						c.remove(selectBtn);
//						num++;
//					}
					
//					if(Integer.valueOf(selectBtn.getText()) == num) {
//						
//						c.remove(selectBtn);
//						num++;
//					}
					
					//조건 : 삭제하려면 1부터 삭제해야함
					
//					c.repaint();
					///렌더링 : 변화가 생기면 화면을 갱신하며 다시 새롭게 그려줌
					
				}
			});

		}
	}

	public static void main(String[] args) {
		
		new Quiz1();
	}
}
