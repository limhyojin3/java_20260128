package day16;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2_선생님풀이 extends JFrame{  //복습(+)
	
	Random ran = new Random();
	ArrayList<Integer> list = new ArrayList<>();
	int num = 1;
	Container c;
	
	public Quiz2_선생님풀이() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new GridLayout(2,3,5,5));   ///배치관리자
		
		createBtn();
		
		setSize(600, 600);
		setVisible(true);
	}

	void createBtn() {
		
		for(int i = 1; i <= 6; i++) {
			
			int ranNum = ran.nextInt(6) + 1;
			
			if(list.contains(ranNum)) {
				i--;
				continue;
			}
			
			list.add(ranNum);
			
			JButton btn = new JButton(ranNum + "");
			c.add(btn);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					
					JButton removeBtn = (JButton) e.getSource();
					
					if(removeBtn.getText().equals(num + "")) {
						
						c.remove(removeBtn);
						c.repaint(); //변화생기면 렌더링
						num++;
					}
					
					if(num == 7) {
						num = 1;
						list.clear(); //ArrayList를 비워줌
						
						c.revalidate(); //컨테이너를 재정렬(배치관리자가 null 이 아니기때문에 재정렬 해줘야함)
						createBtn(); //자기자신을 호출(재귀)
					}
					
					
				}
			});
		}
	}
	
	public static void main(String[] args) {
		
		new Quiz2_선생님풀이();
	}
}
