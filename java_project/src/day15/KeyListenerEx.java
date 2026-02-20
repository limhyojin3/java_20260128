package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame { //복습(+)
	
	private JLabel [] keyMessage;  //이름표 배열
	
	public KeyListenerEx() {
		
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		
		c.addKeyListener(new KeyAdapter() {  //컨테이너에 키어댑터 달기(부착하기)
			
			//키를 누르면 이벤트발동
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				
				keyMessage[0].setText(Integer.toString(keyCode));   // 이름표의 텍스트를 세팅 -> 해당키의 키코드를
				keyMessage[1].setText(Character.toString(keyChar)); // 이름표의 텍스트를 세팅 -> 해당키의 유니코드문자를
				keyMessage[2].setText(e.getKeyText(keyCode));    // 이름표의 텍스트를 세팅 -> 해당키의 이름문자열을
			}
		});
			
		
		keyMessage = new JLabel [3]; 
		
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
	
		
		for(int i = 0; i < keyMessage.length; i++) {  //i=0,1,2
			
			c.add(keyMessage[i]);  //컨테이너에 JLabel(이름표) 달기
			keyMessage[i].setOpaque(true);  //이름표의 불투명성
			keyMessage[i].setBackground(Color.YELLOW);  //이름표의 백그라운드 색깔 세팅
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
