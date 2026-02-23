package day16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField extends JFrame{  //복습(+)
	
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
		JTextField addr = new JTextField(20); //텍스트필드생성
		addr.setEditable(false); //addr 편집을 비활성화
		c.add(addr); //컨테이너에 텍스트필드를 달기
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new TextField();
	}
}
