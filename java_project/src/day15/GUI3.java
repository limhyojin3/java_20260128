package day15;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI3 extends JFrame{

	public GUI3() { //(1.~6. 은 거의 필수)
		
		setTitle("첫번째 화면!!"); //1.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2.
		Container c = getContentPane();  //3.
		c.setLayout(new BorderLayout(10,10)); 
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		c.add(BorderLayout.EAST, btn1); 
		c.add(BorderLayout.WEST, btn2);
		c.add(BorderLayout.NORTH, btn3);
		c.add(BorderLayout.SOUTH, btn4);
		c.add(BorderLayout.CENTER, btn5);
		
		
		setSize(300,300); //4.
		setVisible(true); //5.
	}
	
	
	public static void main(String[] args) {
		
		new GUI3();
		
	}

}
