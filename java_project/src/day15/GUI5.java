package day15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI5 extends JFrame{ //복습(+)

	public GUI5() { //(1.~6. 은 거의 필수)
		
		setTitle("첫번째 화면!!"); //1.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2.
		Container c = getContentPane();  //3.
		c.setLayout(null);
		
		for(int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "번 버튼"); //메서드를 사용하기위해 참조값을 변수에 담아줌
			
			//크기,위치 정해줌
			btn.setSize(100,20);
			btn.setLocation(i*15, i*15);
			
			c.add(btn); //컨테이너에 부착시킴
			
//			c.add(new JButton(i+"")); //(X) 참조값없고, 크기,위치 지정안됨
		}
		
		
		setSize(300,300); //4.
		setVisible(true); //5.
	}
	
	
	public static void main(String[] args) {
		
		new GUI5();
		
	}

}
