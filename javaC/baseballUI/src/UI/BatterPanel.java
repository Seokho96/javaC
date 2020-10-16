package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BatterPanel extends JPanel{
	JPanel batterPanel;
	JButton jbt1, jbt2;
	JTextField bjt;
	private InsertMenu in;
	public BatterPanel() {
		
		jbt1 = new JButton("투수");
		jbt1.setBounds(20, 20, 100, 150);
		add(jbt1);
		jbt1.addActionListener(new MyActionListener());
		
		
		JLabel jbl1 = new JLabel("이름 ");
		jbl1.setBounds(0, 0, 67, 15);
		add(jbl1);
		
		 bjt = new JTextField();
		bjt.setBounds(40, 40, 120, 150);
		add(bjt);
		
		
	}
	class MyActionListener implements ActionListener {         // 버튼 키 눌리면 패널 1번 호출
		   
		@Override
		public void actionPerformed(ActionEvent e) {
			in.change("p");
			
		}
    }

}
