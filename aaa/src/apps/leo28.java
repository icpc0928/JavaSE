package apps;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    

import javax.swing.JButton;
import javax.swing.JFrame;


public class leo28 extends JFrame implements ActionListener {    //繼承 is a （leo28 is a JFrame ， is a ActionListener
		//繼承
	
	
	private JButton open, close, exit;   //我定義了三個按鈕
	
	public leo28() {
		super("我的視窗程式");// 只能放在第一句 
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));      //找ＡＰＩ    import  ---搞定     //這裏得.right是flowlayout裡面的 不是自己人所以要寫完整
		
		open = new JButton("Open");
		close = new JButton("Close");      //做出物件 但還沒擺到正確的位置
		exit = new JButton("Exit");
		
		add(open); add(close);add(exit);    //最後  加上這三個按鈕進去
		
		open.addActionListener(this);    // 這個this 是指向 leo28的這個類別（本類別），所產生出來的物件實體
		close.addActionListener(this);
		
		
		MyButtonListener myButtonListener = new MyButtonListener();
		exit.addActionListener(myButtonListener);
		open.addActionListener(myButtonListener);   //add 是用堆疊的方式顯示出來
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //這個exit on close 是在jframe裡面所以是自己人
		setVisible(true);
		setSize(640, 480);
		
	}
	
	// implements ActionListener之後 需要建立這樣的方法 不然leo28會發抖 ,且需要public才能使用
	public void actionPerformed(ActionEvent e) {   
		if(e.getSource()  == open) {		//==是比較reference  如果要比較兩個物件的內容 用equals
			System.out.println("openBtn");
		}
		if(e.getSource()  == close) {		
			System.out.println("closeBtn");
		}
	}
	
	
	

	public static void main(String[] args) {
		new leo28();
		
	}

}

class MyButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("exitBtn");
		
	}
	
}