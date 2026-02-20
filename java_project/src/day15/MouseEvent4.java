package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent4 extends JFrame{

	public MouseEvent4() {   // 생성자 안에서 익명클래스 처리함.
		
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA"); // 이름표(?)
		label.setSize(150,20);
		label.setLocation(50,50);
		
		c.add(label);  // 컴포넌트에 label 달기
		c.addMouseListener(new MouseAdapter() {  // 컨테이너 컴포넌트에 마우스어댑터 달기  // 익명클래스.
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				if(e.getClickCount() == 2) {

					Random ran = new Random();
					
					int r = ran.nextInt(256);
					int g = ran.nextInt(256);
					int b = ran.nextInt(256);
					
					c.setBackground(new Color(r, g, b)); // 컨테이너 배경색상 세팅
				}
			}
			
						
		});
		
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MouseEvent4();

	}

}
