package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	
	private JLabel [] keyMessage; 
	
	public KeyListenerEx() {
		
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		
		c.addKeyListener(new KeyAdapter() {  //컨테이너에 키어댑터 달기(부착하기)
			
			//키를 누르면 이벤트발동
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				
				keyMessage[0].setText(Integer.toString(keyCode));   // 해당키의 키코드
				keyMessage[1].setText(Character.toString(keyChar)); // 해당키의 유니코드문자
				keyMessage[2].setText(e.getKeyText(keyCode));    // 해당키의 이름문자열
			}
		});
			
		
		keyMessage = new JLabel [3]; 
		
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
	
		
		for(int i = 0; i < keyMessage.length; i++) {  //i=0,1,2
			
			c.add(keyMessage[i]);  //컨테이너에 JLabel 달기
			keyMessage[i].setOpaque(true);  //불투명성
			keyMessage[i].setBackground(Color.YELLOW);  //백그라운드 색깔 세팅
		}
		
		
		
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String [] args) {
		
		new KeyListenerEx();
	}
}
