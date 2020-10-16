package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.BaseballDao;
import dto.Human;
import dto.Pitcher;

public class DeleteView extends JFrame implements ActionListener{
	
	JLabel label;
	JButton menuBtn, deleteBtn;
	JTextField textField;
	DeleteView deleteview;
	
	public DeleteView() {
		setLayout(null);
		
		
			label = new JLabel();
			label.setText( "삭제할 선수의 이름");
			label.setFont(new Font("돋움", Font.BOLD, 18));
			label.setBounds(30, 50 + 40 , 100, 30);
			
			textField = new JTextField();
			textField.setBounds(180, 50 + 40, 200, 30);
			
			add(label);
			add(textField);
		
		
		menuBtn = new JButton("메뉴");
		menuBtn.setBounds(150, 320, 150, 50);
		menuBtn.addActionListener(this);
		add(menuBtn);
		
		deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(320, 320, 150, 50);
		deleteBtn.addActionListener(this);
		add(deleteBtn);
				
		setBounds(0, 0, 640, 480);
		setBackground(Color.red);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == menuBtn) {
		//	JOptionPane.showMessageDialog(null, "menuBtn");
			deleteview.dispose();
			new MenuView();
		}
		else if(obj == deleteBtn) {
			
			BaseballDao ball = BaseballDao.getInstance();	
			Human human = null;
			for (int i = 0; i < ball.list.size(); i++) {
				
				if(textField.getText().equals(ball.list.get(i))) {
					  ball.list.remove(i);
					  JOptionPane.showMessageDialog(null, "성공적으로 삭제하였습니다");
				}else if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null, " 이름을 입력해주세요 ");
				}else {
					JOptionPane.showMessageDialog(null, "없는 선수입니다");
				}
			}
		
			
		
		}
	}
}
