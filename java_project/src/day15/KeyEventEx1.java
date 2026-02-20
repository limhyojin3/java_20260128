package day15;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventEx1 extends JFrame { //복습(+)
	
	public KeyEventEx1() {

		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA");
		label.setBounds(50, 50, 50, 30);
		c.add(label);
		
		c.addKeyListener(new KeyAdapter() { //컨테이너에 키어댑터 달기
		
			@Override
			public void keyPressed(KeyEvent e) {

				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX() + 10, label.getY());
					
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX() - 10, label.getY());
					
				} else if(e.getKeyCode() == KeyEvent.VK_UP) {
					label.setLocation(label.getX(), label.getY() - 10);  //위로갈수록 0에 가까워짐.
					
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					label.setLocation(label.getX(), label.getY() + 10);
				} 
				
			}
			
			
			
		});
		
		setSize(500, 500);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	
	}

	public static void main(String[] args) {
		new KeyEventEx1();

	}

}
