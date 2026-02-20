package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx1 extends JFrame {
	
	public LabelEx1() {
		
		setTitle("Label 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("images/beauty.jpg"); //상대경로에 있는 이미지를 객체로 담기. 
		JLabel label = new JLabel(img);  //img(참조값)을 JLabel 에 전달
		
		c.add(label); //컨테이너에 label 달기
		
		
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		new LabelEx1();
	}

}
