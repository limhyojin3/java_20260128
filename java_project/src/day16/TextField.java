package day16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField extends JFrame{ 
	
	public TextField() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   ///배치관리자
		
		c.add(new JLabel("이름 : "));
		c.add(new JTextField(20)); //필드의 크기=20
		
		c.add(new JLabel("학과 : "));
		c.add(new JTextField("컴퓨터학과", 20)); //필드의 초기값, 필드의 크기=20
		
		c.add(new JLabel("주소 : "));
		JTextField addr = new JTextField(20);
		addr.setEditable(false);
		c.add(addr);
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new TextField();
	}
}
