package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI2 extends JFrame{ //복습(+)

	public GUI2() { //(1.~6. 은 거의 필수)
		
		setTitle("첫번째 화면!!"); //1.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2.
		Container c = getContentPane();  //3.
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); //6. new FlowLayout() -> (기본값: 왼쪽에서 오른쪽으로 배치...,)
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		c.add(btn1); 
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		
		
		setSize(300,300); //4.
		setVisible(true); //5.
	}
	
	
	public static void main(String[] args) {
		
		new GUI2();
		
	}

}
