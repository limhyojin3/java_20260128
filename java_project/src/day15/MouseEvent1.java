package day15;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame{

	public MouseEvent1() {   // 생성자 안에서 익명클래스 처리함.
		
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA"); // 이름표(?)
		label.setSize(50,20);
		label.setLocation(50,50);
		
		c.add(label);  // 컴포넌트에 label 달기
		c.addMouseListener(new MouseListener() {  // 컴포넌트에 마우스리스너 달기  // 익명클래스.
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y); // label 의 위치 세팅
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MouseEvent1();

	}

}
