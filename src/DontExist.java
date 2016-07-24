import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DontExist extends JPanel implements ActionListener{
	JButton back=new JButton("Back");
	JLabel label;
	public DontExist(int i){
		switch(i){
		case 1:
			label=new JLabel("Username or Password is wrong!");
			break;
		case 2:
			label=new JLabel("Password is wrong!");
			break;
		case 3:
			label=new JLabel("Passwords don't match!");
			break;
		case 4:
			label=new JLabel("Username Already Exists!");
			break;
		}
		add(label);	
		back.addActionListener(this);
		add(back);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back){
			Login login=(Login)getParent();
			login.cl.show(login, "login");
		}
	}
}
