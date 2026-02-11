package day11;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

	public GridLayoutEx() {
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4,5,5));
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
		
		setSize(400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
