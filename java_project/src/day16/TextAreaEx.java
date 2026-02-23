package day16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{ //복습(+)
	
	JTextField tf = new JTextField(20);  //20글자
	JTextArea ta = new JTextArea(7, 20);  //7줄 20글자
	
	
	public TextAreaEx() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   ///배치관리자
		
		c.add(tf); //컨테이너에 텍스트필드를 달기
		c.add(new JScrollPane(ta)); //컨테이너에 추가하기(텍스트에어리어가 스크롤가능하도록하는 객체호출)
		
		tf.addActionListener(new ActionListener() { //텍스트필드에 액션리스너 달기
													//new ActionListener() 객체를 호출
			
			@Override
			public void actionPerformed(ActionEvent e) { //텍스트필드에 작성후 엔터를 누르면
				
				ta.append(tf.getText() + "\n");
				tf.setText("");
				
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new TextAreaEx();
	}
}
