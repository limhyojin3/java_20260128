package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx1 extends JFrame{ 
	
	public ButtonEx1() {
		
		setTitle("버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn1 = new JButton("첫번째 버튼!");
		JButton btn2 = new JButton("두번째 버튼!");
		JButton btn3 = new JButton("세번째 버튼!");
		
		c.add(btn1);
		btn1.setBackground(new Color(0,150,220));
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("궁서체", Font.BOLD, 20));
		
		c.add(btn2);
		btn2.setEnabled(false);
		
		c.add(btn3); //컨테이너에 버튼3 달기 (+)
		
		btn3.addActionListener(new ActionListener() {  // 버튼에 액션 리스너 달기
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Random ran = new Random();
				btn3.setForeground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				
			}
		});
		
		
		
		
		
		
		
		
		
		//버튼에 마우스어댑터 달기(+)
//		btn3.addMouseListener(new MouseAdapter() { 
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				Random ran = new Random();
//				
//				int r = ran.nextInt(256);
//				int g = ran.nextInt(256);
//				int b = ran.nextInt(256);
//				
//				btn3.setForeground(new Color(r, g, b)); //버튼에 글자색 세팅
//			}
//			
//		});
		
		
		
		
		setSize(300, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new ButtonEx1();
	}
}


