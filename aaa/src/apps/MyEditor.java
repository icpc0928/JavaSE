package apps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class MyEditor extends JFrame {

	private JButton open, save, saveas , chcolor; // 3.		//26chcolor   // TODO 找JTextArea 做調色盤給換顏色
	private JTextArea jta; // 6

	public MyEditor() { // 1.
		super("My Editor");

		setLayout(new BorderLayout()); // 4.
		JPanel topLine = new JPanel(new FlowLayout()); // 5
		open = new JButton("Open");
		topLine.add(open);
		save = new JButton("Save");
		topLine.add(save);
		saveas = new JButton("Save as");
		topLine.add(saveas);
		chcolor = new JButton("Change Color");
		topLine.add(chcolor);
		add(topLine, BorderLayout.NORTH); // --5
		
		

		jta = new JTextArea(); // 7
		jta.setFont(new Font("",Font.BOLD + Font.ITALIC,24));  //25
		jta.setForeground(Color.blue);
		// 捲軸
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp, BorderLayout.CENTER); // 7

		initEvent(); // 8 分開乾淨點

		setSize(640, 480); // 1
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// --1
	}

	private void initEvent() { // 8
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openFile(); // 9.1

			}
		});
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile(); //9.2

			}
		});
		saveas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveasFile(); //9.3

			}
		});
	}

	private File openFile;						//11
	
	private void openFile() { // --9.1
		JFileChooser jfc = new JFileChooser(new File("."));		//10			//17.new File（“."）目前所在路徑
		if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {			//jfc已經選了 值就在他身上
			openFile = jfc.getSelectedFile();		//12
			readFile();								//--13
			
		}
	}
	
	private void readFile() {						//13
		if(openFile == null) return;				//14  不是file就先踢掉
		
		try {										//15
			BufferedReader reader = new BufferedReader(new FileReader(openFile));	//15
			jta.setText(""); String line;			//16
			while((line = reader.readLine())!= null ) {
				jta.append(line + "\n");	   		//--16
			}
			
			reader.close(); 						//15
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	private void saveFile() { // --9.2
		if(openFile == null) {						//18
			saveasFile();							//21
		}else {
		//19-20
		writeFile();
				}
		}

	private void saveasFile() { // --9.3
		JFileChooser jfc = new JFileChooser(new File("."));		//22
		if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) { //23
			openFile = jfc.getSelectedFile();
			writeFile();
			}	
	}
	
	private void  writeFile() {						//24---1920
		try {										//19
			BufferedWriter writter = new BufferedWriter(new FileWriter(openFile));  //20
			writter.write(jta.getText());			//20
			writter.flush();
			writter.close();						//--20
			JOptionPane.showMessageDialog(this,	"Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {

		new MyEditor(); // 2.

	}
}
