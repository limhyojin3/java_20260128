package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEvent extends JFrame{
	
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	private int sum = 0;
	
	
	public CheckBoxEvent() {
		
		setTitle("체크박스 item 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   //배치관리자
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원")); //컨테이너에 이름표 붙이기
		
		for(int i = 0; i < fruits.length; i++) { //i=0,1,2
			
			fruits[i] = new JCheckBox(names[i]);  //체크박스 객체생성
			fruits[i].setBorderPainted(true);
			
			fruits[i].addItemListener(new ItemListener() {    //체크박스에 아이템리스너 달기
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					
					//체크박스에 체크되었을때
					if(e.getStateChange() == ItemEvent.SELECTED) {
						
						if(e.getItem() == fruits[0]) {  //'사과'체크박스를 선택한경우
							sum += 100;
							
						} else if (e.getItem() == fruits[1]){
							sum += 500;
							
						} else {
							sum += 20000;
						}
						
					} else { //체크박스 해제되었을때
						
						if(e.getItem() == fruits[0]) {  //'사과'체크박스를 해제한경우
							sum -= 100;
							
						} else if (e.getItem() == fruits[1]){
							sum -= 500;
							
						} else {
							sum -= 20000;
						}
					}
					
					sumLabel.setText("현재 " + sum + "원 입니다.");
					
				}
			});
			
			c.add(fruits[i]);  //컨테이너에 체크박스 달기
		}
		
		sumLabel = new JLabel("현재 " + sum + "원 입니다.");
		c.add(sumLabel); //컨테이너에 이름표 붙이기 
		
		setSize(250, 250);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new CheckBoxEvent();
	}
}
