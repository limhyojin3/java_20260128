package day11;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("Hello GUI");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new MyFrame();
	}

}
