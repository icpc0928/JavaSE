package apps;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class leo35 extends JFrame {
	// 滑鼠偵測事件 5-9第一招 10-12第二招 13第三招

	private JTextField mesg;

	public leo35() {
		super("leo35");

		setLayout(new BorderLayout()); // 4.把text放在北邊
		mesg = new JTextField();
		add(mesg, BorderLayout.NORTH);

		JPanel content = new JPanel();
		add(content, BorderLayout.CENTER);
		// content.addMouseListener(new MyListener(this)); //2.目前為止做出這樣的物件實體，全部拿來實作但都是空的
		// 6.(this)之後就你們兩個就認識了
		// content.addMouseListener(new MyListenerV2());
		// //12.內部類別的寫法方便存取外部的屬性及方法（都同國的）（寫出來的結果跟5-9一樣）
		content.addMouseListener(new MouseAdapter() { // 13. 直接寫在裡面 （匿名類別,不用名字有實作就好了 new MouseAdapter(){}有大括號就有物件實體
			@Override
			public void mouseClicked(MouseEvent e) {
				mesg.setText(e.getX() + ", " + e.getY());
			}
		});
		content.addMouseMotionListener(new MouseAdapter() { // 14.用相同方式再來一次
			@Override
			public void mouseMoved(MouseEvent e) {
				mesg.setText(e.getX() + ", " + e.getY());
			}
		});

		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setMesg(String info) { // 8.自己設計一個功能提供另一個類別叫用
		mesg.setText(info);
	}

	public static void main(String[] args) {
		new leo35();

	}

	private class MyListenerV2 extends MouseAdapter { // 10.類別中又有類別(內部類別）
		@Override
		public void mouseClicked(MouseEvent e) {
			mesg.setText(e.getX() + ", " + e.getY()); // 11.定義完畢 但沒有物件實體 //有很強烈的相依性 基本上用來就是要呼叫外部類別的
		}
	}

}

class MyListener extends MouseAdapter { // 1.mouseadapter 有三張證照 而且他是抽象類別 但內部又沒有抽象方法 所以我現在繼承他不需要實作方法

	private leo35 win; // 5.宣告上面那個是win 做建構式

	public MyListener(leo35 win) {
		this.win = win;
	}

	// 3.這裏按右鍵 source -> override
	@Override
	public void mouseClicked(MouseEvent e) { // 3.我只需要實作我需要的方法 7.因為6的this 你就能跟win (leo3５）認識了
		// System.out.println("click" + e.getX() + ", " + e.getY()) ;
		win.setMesg(e.getX() + ", " + e.getY()); // 9.就能提供win的方法惹

	}

}
