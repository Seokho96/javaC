package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class InsertMenu extends JFrame implements ActionListener {

	JLabel label[];
	JButton bbtn[];
	JButton btn1, btn2;
	JPanel panel1, panel2;
	JTextField textField;
	JTextArea textArea;
	
	public BatterPanel batterPanel = null;
    public PitcherPanel pitcherPenel = null;
    
    
	
	
   public InsertMenu() {
	   

	   
	   JTextField textField;
		JTextArea textArea;
		
		
		InsertMenu win = new InsertMenu();            
        
        win.setTitle("frame test");
        win.batterPanel = new BatterPanel();
        win.pitcherPenel = new PitcherPanel();
        
        win.add(win.batterPanel);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(500,700);
        win.setVisible(true);   
				
			JPanel panel1 = new JPanel();
			
			textArea = new JTextArea();
			textArea.setLineWrap(true);
			
			JScrollPane scrPane = new JScrollPane(textArea);
			scrPane.setPreferredSize(new Dimension(400, 300));
			
			
			
			
			
			
			JPanel botpan = new JPanel();
			
			textField = new JTextField(20);
			
			
			bbtn = new JButton[2];
			String btnTitle[] = { "투수", "타자"};
			
			for (int i = 0; i < btnTitle.length; i++) {
				
				bbtn[i] = new JButton(btnTitle[i]);
				
				bbtn[i].setBounds(90+ (i *100) , 125 , 150, 50);
				botpan.add(bbtn[i]);
			}
			
		
			bbtn[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					botpan.add(textField);
					
				}
			}  );
			
			
			btn1 = new JButton("next insert");
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				//	JOptionPane.showMessageDialog(null, "next insert");	
					if(!textField.getText().equals("")) {
						String msg = textField.getText() + "\n";
						textArea.append(msg);	
						
						textField.setText("");
					}
				}
			});
			
			btn2 = new JButton("prev insert");
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						
						textArea.insert(textField.getText() + "\n", 
										textArea.getLineStartOffset(0));
						
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			
			botpan.add(btn1);
			botpan.add(btn2);
			
			
			Container contentPane = getContentPane();
			
			contentPane.add(panel1, BorderLayout.CENTER);
			contentPane.add(botpan, BorderLayout.SOUTH);		
			
		
			setBounds(0, 0, 640, 480);
			setVisible(false);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		}

		
		
		
   

		
	   @Override
		public void actionPerformed(ActionEvent e) {
			

		}

	   public void change(String panelName){        
	        
	        if(panelName.equals("batterPanel")){
	            getContentPane().removeAll();
	            getContentPane().add(batterPanel);
	            revalidate();
	            repaint();
	        }else {
	            getContentPane().removeAll();
	            getContentPane().add(pitcherPenel);
	            revalidate();
	            repaint();
	        }
	   
	   }
	
}

