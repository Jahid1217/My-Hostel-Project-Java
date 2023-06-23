import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employee extends JFrame implements ActionListener

{
	JPanel panel;
	JLabel L1,L2,L3;
	JTextField nameTF,idTF;
    JButton btnE;
	
	public Employee()
	{
		super ("Employee");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		L1 = new JLabel("Name:");
		L1.setBounds(180,50,80,50);
		panel.add(L1);
		
		nameTF = new JTextField();
		nameTF.setBounds(250, 50, 100, 30);
		panel.add(nameTF);
		
		L2 = new JLabel("ID:");
		L2.setBounds(180,120,80,50);
		panel.add(L2);
		
	    idTF = new JTextField();
		idTF.setBounds(250, 120, 100, 30);
		panel.add(idTF);
		
		btnE = new JButton("Enter");
		btnE.setBounds(210,400,80,30);
		btnE.addActionListener(this);
		panel.add(btnE);
		
		
		this.add(panel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnE){
			this.dispose();
			ConfirmMeal me = new ConfirmMeal();
			me.setVisible(true);
		}
		
	}
	
}
