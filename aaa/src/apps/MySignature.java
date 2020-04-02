package apps;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MySignature extends JFrame {
	
	public MySignature() {
		super("簽名");
		setLayout(new BorderLayout());
		
		
		
		
		
		setVisible(true);
		setSize(800,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MySignature();

	}

}
