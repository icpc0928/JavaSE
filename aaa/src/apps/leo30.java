package apps;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class leo30 extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public leo30() {
		super("猜數字遊戲視窗版");
		
		initView();
		
		initRound();
		guess.addActionListener(this);
		
		
		setVisible(true);
		setSize(480,320);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //關閉就離開
		
		
		
	}
	
	private void initRound() {				//每回合做這個事情
		counter = 0;
		answer = createAnswer(3);      
		log.setText("");
		System.out.println(answer);
	}
	
		private void initView() {   //=================版面初始化
		setLayout(new BorderLayout());   //能排版的視窗 東南西北海底
		
		JPanel topLine = new JPanel(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		topLine.add(guess,BorderLayout.EAST);
		topLine.add(input,BorderLayout.CENTER);
		
//		this.add(topLine,BorderLayout.NORTH);  //THIS的用法 （跟下面一樣）,因為this指的是leo30所以省略
		add(topLine,BorderLayout.NORTH);
		
		
		log = new JTextArea();
		log.setEditable(false);
		JScrollPane jsp = new JScrollPane(log);    //新增捲軸
		
		add(jsp , BorderLayout.CENTER);
		
//		log = new JTextArea();
//		add(log,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new leo30();
	}

	

	@Override
	public void actionPerformed(ActionEvent event) {
		counter++;
		String userInput = input.getText();
		String result = checkAB(answer,userInput);
		log.append(counter +". "+userInput + " => " + result + "\n");
		
		input.setText("");
		
		if(result.equals("3A0B")) {
			// win
			showPromptDialog(true);
		}else if(counter == 10) {
			// loser
			showPromptDialog(false);
		}
		
	}
	
	private void showPromptDialog(boolean isWinner) {
		String mesg = isWinner?"Winner":"loser: "+answer;
		int yesOrNo =JOptionPane.showConfirmDialog(
				this, mesg+" Play new game?" , "Resule" , JOptionPane.YES_NO_OPTION);
		if(yesOrNo == JOptionPane.YES_OPTION) {
			initRound();								//又產生新局
		} else if(yesOrNo == JOptionPane.NO_OPTION) {
			System.exit(0);          					//離開 且回傳值為0是正常結束
		}
		
		
	}
	
	private String createAnswer(int d) {    		//產生密碼 
		int[] poker = new int[10];  //0
		for ( byte i=0; i<poker.length;  i++  ) poker[i] = i;   
		for (int i= poker.length-1;i>0  ;i--) {
			int rand = (int)(Math.random()*(i+1));  //
			int r;
			r = poker[rand] ;
			poker[rand]=poker[i];
			poker[i]=r;
		}
		
		StringBuffer sb= new StringBuffer() ;   // string | stringBuffer |stringBulider
		for(int i = 1; i<=d ;i++) {
			sb.append(poker[i]);    //StringBuffer.append 從後面增加
		}
		return sb.toString() ;
	}
	
	private String checkAB(String a,String g) {
		int A , B; A = B = 0;
		for(int i = 0 ; i<a.length(); i++) {
			if(a.charAt(i)==g.charAt(i)) {				//a中第i碼 有沒有跟 g中第i碼吻合
				A++;
			} else if(a.indexOf(g.charAt(i)) != -1){   //g中第i碼有沒有存在於a中
				B++;
				
			}
		}
		
		return A + "A" + B + "B";
	}

}
