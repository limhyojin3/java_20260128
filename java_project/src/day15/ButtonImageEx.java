package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{

	public ButtonImageEx() {
		
		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("images/RYAN_1.jpg"); 
		Image image = img1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		img1 = new ImageIcon(image); 
		
		ImageIcon img2 = new ImageIcon("images/RYAN_2.jpg");
		image = img2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		img2 = new ImageIcon(image); 
		
		ImageIcon img3 = new ImageIcon("images/RYAN_3.jpg");
		image = img3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		img3 = new ImageIcon(image); 
		
		JButton btn = new JButton(img1);  // 버튼에 참조값 전달
		btn.setRolloverIcon(img2);    //마우스를 갖다대면 img2
		btn.setPressedIcon(img3);     //마우스를 누르면 img3
		
		
		c.add(btn); //컨테이너에 버튼을 달기(부착하기)
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
