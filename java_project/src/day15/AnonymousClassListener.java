package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame { //복습(+)

	public AnonymousClassListener() {
		
		setTitle("Action 이벤트 리스너 작성");  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("Action");
		c.add(btn); 
		
		// 버튼에 Action 리스너달기
		btn.addActionListener(new ActionListener() {  // interface ActionListener => 익명클래스 구현  
			
			@Override
			public void actionPerformed(ActionEvent e) { // ActionEvent e => 이벤트객체
				
				JButton eBtn = (JButton) e.getSource(); //getSource()로 이벤트 객체 가져옴.
				
				System.out.println(eBtn.getText());
				
				if(eBtn.getText().equals("Action")) {
					eBtn.setText("액션");
				} else {
					eBtn.setText("Action");
				}
				
			}
		}); 
		
		
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		
		new AnonymousClassListener();
		
	}
}

