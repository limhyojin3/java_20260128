package day16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioBtnEvent extends JFrame{  //이해(+)
	
	JRadioButton radio[] = new JRadioButton[3];
	String text[] = {"사과", "배", "체리"};
	ImageIcon image[] = {
			new ImageIcon("images/RYAN_1.jpg"),
			new ImageIcon("images/RYAN_2.jpg"),
			new ImageIcon("images/RYAN_3.jpg")
	};
	JLabel imageLabel = new JLabel();  //이미지라벨(이름표)
	
	
	public RadioBtnEvent() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());   ///배치관리자
		
		
		JPanel radioPanel = new JPanel();  //패널 생성(라디오패널)
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();  //버튼그룹생성
		
//		ImageIcon icon = new ImageIcon("images/RYAN_1.jpg"); 
//		Image img = image[0].getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
//		image[0] = new ImageIcon(img); 
		
		//이미지 아이콘들의 크기 바꾸기.(바꾼크기의 이미지 참조값을 이미지 아이콘에 갱신)
		for(int i = 0; i < image.length; i++) {
			Image img = image[i].getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지의 크기바꾸기
			image[i] = new ImageIcon(img); 
		}
		
		for(int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);  //라디오버튼생성
			g.add(radio[i]);  //버튼그룹 안에 라디오버튼을 추가
			
			radioPanel.add(radio[i]);  //라디오패널에 라디오버튼을 추가
			
			//라디오버튼에 아이템리스너 달기.
			radio[i].addItemListener(new ItemListener() {   //addItemListener(객체) <- 객체를 추가할수있는 메서드
															//new ItemListener() <- 이벤트를 처리하는 객체.
				
				@Override
				public void itemStateChanged(ItemEvent e) {  //클릭하면(ItemEvent e 발생) 메서드가 바로 실행됨.
					
					if(radio[0].isSelected()) {   //0번 라디오버튼이 선택되면,
						imageLabel.setIcon(image[0]); //이미지라벨에 아이콘을 세팅하기(0번 이미지를)
						
					} else if(radio[1].isSelected()) {
						imageLabel.setIcon(image[1]);
						
					} else {
						imageLabel.setIcon(image[2]);
					}
					
				}
			});
		}
		
		radio[2].setSelected(true);
		
		c.add(radioPanel, BorderLayout.NORTH); //컨테이너에 라디오패널 달기
		c.add(imageLabel, BorderLayout.CENTER); //컨테이너에 이미지라벨 달기
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지라벨 정렬(중앙으로)
		
		
		
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new RadioBtnEvent();
	}
}
