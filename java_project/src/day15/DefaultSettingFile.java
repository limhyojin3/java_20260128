package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class DefaultSettingFile extends JFrame{ //기본 6줄  //복습(+)
	
	public DefaultSettingFile() {

		setTitle("시작");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());   //배치관리자
		
		
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new DefaultSettingFile();
	}
}
