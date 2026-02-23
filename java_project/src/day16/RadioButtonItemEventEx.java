package day16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame{ //이해(+)
	
	private JRadioButton[] radio = new JRadioButton[3];   //라디오버튼 3개
	private String[] text = { "사과", "배", "체리" };
	private ImageIcon[] image = {                 //이미지아이콘 3개
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};
	private JLabel imageLabel = new JLabel();  //이미지라벨(이름표)
	

	public RadioButtonItemEventEx() {
		
		setTitle("라디오버튼Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//패널은 영역을 잡기위한 용도
		//radio 영역
		//image 영역
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();  //버튼그룹 생성
		
		for (int i = 0; i < radio.length; i++) { //i=0,1,2
			radio[i] = new JRadioButton(text[i]);//{ "사과", "배", "체리" };  //버튼생성
			g.add(radio[i]);   //그룹에 버튼추가
			
			radioPanel.add(radio[i]); //라디오패널에 버튼을 달기
			radio[i].addItemListener(new MyItemListener());  //버튼에 리스너 달기
		}
		
		radio[2].setSelected(true); //기본 "배"버튼이 selected 됨.
		
		c.add(radioPanel, BorderLayout.NORTH);   //컨테이너에 라디오패널 달기(상단에)
		c.add(imageLabel, BorderLayout.CENTER);  //컨테이너에 이미지라벨 달기(센터에)
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지라벨을 정렬.
		
		
		
		setSize(250, 200);
		setVisible(true);
	}

class MyItemListener implements ItemListener{

	public void itemStateChanged(ItemEvent e) {
		
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			return;
		}
			
		if (radio[0].isSelected()) {
			imageLabel.setIcon(image[0]);  //이미지 라벨에 아이콘을 세팅(0번째 이미지로)
			
		} else if (radio[1].isSelected()) {
			imageLabel.setIcon(image[1]);
			
		} else {
			imageLabel.setIcon(image[2]);
			
		}
	}
}

	public static void main(String[] args) {
		
		new RadioButtonItemEventEx();
	}
}