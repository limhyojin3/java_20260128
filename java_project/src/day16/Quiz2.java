package day16;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz2 extends JFrame{ 
	
	Random ran = new Random();
	Container c;
	ArrayList<Integer> list = new ArrayList<>();
	int num = 1;
	
	public Quiz2() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new GridLayout(5,5,3,3));   ///배치관리자           //GUI4
		
		
//		GridLayout
//		실행시마다 랜덤한 배치
//		------
//		1부터 순차적으로 삭제됨.
//		ArrayList(중복된숫자 나오지않도록)
		
		createBtn();
		
		
		setSize(600, 600);
		setVisible(true);
	}

	void createBtn() {
		
		for(int i = 1; i <= 25; i++) {  
			
			int ranNum = (ran.nextInt(25) + 1);//0~24+1 => 1~25
			
			if(list.contains(ranNum)) { //중복없도록함.
				i--;
				continue;
			}
			
			list.add(ranNum);
			JButton btn = new JButton(ranNum + ""); 
			
			c.add(btn); //컨테이너에 버튼 달기
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JButton selectBtn = (JButton) e.getSource(); //버튼을 선택
					
					String removeNum = num + "";
					
					if(selectBtn.getText().equals(removeNum)) {
						c.remove(selectBtn);
						c.repaint();
						num++;
					}
					
					if(num == 26) {
						
						num = 1; //num 을 초기화
						
//						for(Integer num: list) {
//							
//							list.remove(num);
//						} //list를 초기화    => 안되네.
						
						list = new ArrayList<>(); //list 초기화.
						
						createBtn(); //게임 다시시작되도록 자기자신을 호출
						
					}
				}
			});
			
		} //1~25까지 버튼 컨테이너에 달음.
		
	}

	public static void main(String[] args) {
		
		new Quiz2();
	}
}
