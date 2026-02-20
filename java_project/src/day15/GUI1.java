package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 extends JFrame{ //복습(+)

	public GUI1() { //(1.~6. 은 거의 필수)
		
		setTitle("첫번째 화면!!"); //1.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2.
		Container c = getContentPane();  //3.
		c.setLayout(new FlowLayout()); //6.
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		c.add(btn1); //컴포넌트에 버튼을 부착시킴
		c.add(btn2);
		
		
		setSize(300,300); //4.
		setVisible(true); //5.
	}
	
	
	public static void main(String[] args) {
		
		new GUI1();
		
	}

}
