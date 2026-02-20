package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame{ 
	
	public CheckBoxEx1() {

		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   //배치관리자
		
		
		JCheckBox box1 = new JCheckBox("자바");
		JCheckBox box2 = new JCheckBox("오라클");
		
		ImageIcon img1 = new ImageIcon("images/RYAN_1.jpg"); 
		Image image = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		img1 = new ImageIcon(image); 
		
		ImageIcon img2 = new ImageIcon("images/RYAN_2.jpg");
		image = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		img2 = new ImageIcon(image); 
		
		JCheckBox box3 = new JCheckBox(img1);
		box3.setBorderPainted(true); //체크박스의 경계(border) 표시해줌
		box3.setSelectedIcon(img2); //체크박스가 선택되면 img2 보여줌
		
		
		
		
		
		
		c.add(box1); //컨테이너에 체크박스 달기
		c.add(box2);
		c.add(box3);
		
		
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new CheckBoxEx1();
	}
}
