package apps;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class leo62hwTalking extends JFrame implements ActionListener{
	
	private JButton send; //3
	private JTextArea topText ,inputText;
	
	
	
	public leo62hwTalking() {
		super("群聊天室");  //1
		
		initView();
		send.addActionListener(this);   //應該是這樣沒錯 send監聽事件寫在下面override
		
		setSize(480,720);						//1.
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initView() {
		setLayout(new BorderLayout());					//4
		JPanel butLine = new JPanel(new BorderLayout());
		send = new JButton("發送");
		inputText = new JTextArea();
		
		butLine.add(inputText,BorderLayout.CENTER);
		butLine.add(send,BorderLayout.EAST);
		add(butLine,BorderLayout.SOUTH);
		
		topText = new JTextArea();						//5
		JScrollPane jsp = new JScrollPane(topText);
		add(jsp, BorderLayout.CENTER);
	}
	
	

	public static void main(String[] args) {
		
		new leo62hwTalking(); //2
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {       //send的監聽事件
		// TODO Auto-generated method stub
		String userInput = inputText.getText();
		topText.append("使用者ＸＸ說： "+ userInput + "\n");
		inputText.setText("");
	}

}

