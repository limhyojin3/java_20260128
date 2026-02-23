package day16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtn extends JFrame{ 
	
	public RadioBtn() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   //배치관리자
		
		
		ImageIcon icon = new ImageIcon("images/RYAN_1.jpg"); 
		Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		icon = new ImageIcon(image); 
		
		ImageIcon selectIcon = new ImageIcon("images/RYAN_2.jpg");
		image = selectIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
		selectIcon = new ImageIcon(image); 
		
		//라디오버튼은 같은 그룹내에 있으면 중복이 안됨. 한개 선택하면 다른건 해제됨.
		
		ButtonGroup btnGroup = new ButtonGroup(); //버튼그룹 생성하기
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true); //기본 selected 값을 true 로 해줌.(처음화면에서 selected 됨)
		JRadioButton cherry = new JRadioButton(icon);  //new JRadioButton(ImageIcon icon); <-버튼에 이미지아이콘 달아줌.
		
		cherry.setSelectedIcon(selectIcon);
		cherry.setBorderPainted(true); //경계선 생기도록함.
		
		//버튼그룹에 버튼(apple, pear, cherry)을 넣어주기.
		btnGroup.add(apple);
		btnGroup.add(pear);
		btnGroup.add(cherry);
		
		//컨테이너에 버튼(apple, pear, cherry)을 붙이기.
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new RadioBtn();
	}
}
