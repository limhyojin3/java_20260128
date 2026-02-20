package day15;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI4 extends JFrame{ //복습(+)

	public GUI4() { //(1.~6. 은 거의 필수)
		
		setTitle("첫번째 화면!!"); //1.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //2.
		Container c = getContentPane();  //3.
		c.setLayout(new GridLayout(4,4,5,5)); //(4,4) => 4행4열
		
		String str[] = {
				"7", "8", "9", "*",
				"4", "5", "6","-",
				"1", "2", "3", "+",
				"/", "0", ".", "="
		};
		
		for(int i = 0; i < str.length; i++) {
			
//			c.add(new JButton(Integer.toString(i)));  ->숫자를 문자로.,
//			c.add(new JButton(i+""));  //위와 똑같다
			c.add(new JButton(str[i]));
		}
		
		
		setSize(300,300); //4.
		setVisible(true); //5.
	}
	
	
	public static void main(String[] args) {
		
		new GUI4();
		
	}

}
