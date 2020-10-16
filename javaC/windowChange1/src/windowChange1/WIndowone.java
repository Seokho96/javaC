package windowChange1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WIndowone extends Frame {
	
	public WIndowone() {

		Button btn = new Button("move window");
		btn.setBounds(100, 100, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.exit(0);  // 함부로 쓰면 안됨 프로세스까지 닫아버림(부분 멈춤때는 사용금지)
				dispose(); // 자신의 창만 닫음
				
				new WindowTwo();
				
			}
		});
		
		add(btn);

		setLayout(null);
		setBounds(0, 0, 640, 480);		
		setVisible(true);
		setBackground(Color.red);

	} 

}
