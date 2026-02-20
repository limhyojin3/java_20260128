package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {

	public IndepClassListener() {
		
		setTitle("Action 이벤트 리스너 작성");  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new MyActionListener()); // Action 리스너달기
		
		
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		
		new IndepClassListener();
		
	}
}
	
class MyActionListener implements ActionListener { 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton eventBtn = (JButton)e.getSource(); //누가 이벤트가 발생했는지 구별하기위한용도
		
		if(eventBtn.getText().equals("Action")) {
			eventBtn.setText("액션");
		} else {
			eventBtn.setText("Action");
		}
	}
}
