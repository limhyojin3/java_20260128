package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent3 extends JFrame{

	public MouseEvent3() {   // 생성자 안에서 익명클래스 처리함.
		
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA"); // 이름표(?)
		label.setSize(150,20);
		label.setLocation(50,50);
		
		c.add(label);  // 컴포넌트에 label 달기
		c.addMouseListener(new MouseAdapter() {  // 컴포넌트에 마우스어댑터 달기  // 익명클래스.
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			
				c.setBackground(Color.yellow); // 컨테이너 백그라운드 세팅
			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

				c.setBackground(Color.LIGHT_GRAY);
			}
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("마우스 클릭 위치(" + e.getX() + ", " + e.getY() + ")");
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("마우스 떼는 위치(" + e.getX() + ", " + e.getY() + ")");
			}
			

			
			
		});
		
		c.addMouseMotionListener(new MouseAdapter() { // 컨테이너에 마우스 어댑터 달기  // 익명클래스
		
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
				label.setText("마우스 현재 위치(" + e.getX() + ", " + e.getY() + ")");
			}
		
		
		});
		
		
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MouseEvent3();

	}

}
