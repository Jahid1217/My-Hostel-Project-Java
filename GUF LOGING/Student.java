import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student  implements ActionListener
{
	JFrame J;
	JPanel panel;
	JLabel L1,L2,L3;
	JTextField nameTF,idTF,roomTF;
    JButton btnE,backb;
	
	public Student()
	{
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
		
		L3 = new JLabel("Room No:");
		L3.setBounds(180,190,80,50);
		panel.add(L3);
		
	    roomTF = new JTextField();
		roomTF.setBounds(250, 190, 100, 30);
		panel.add(roomTF);
		
		btnE = new JButton("Enter");
		btnE.setBounds(210,400,80,30);
		btnE.addActionListener(this);
		panel.add(btnE);

		Icon icon = new ImageIcon("icon.jpg");

		backb = new JButton("Back");
		backb.setBounds(350,400, 80,30);
		backb.addActionListener(this);
		panel.add(backb);
		
		J = new JFrame("Student");
		J.setSize(600,600);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setVisible(true);
		J.add(panel);

		/*btnE.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ConfirmMeal me = new ConfirmMeal();
				me.setVisible(true);
			}
		});
		
		
		this.add(panel);
		
	}*/
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnE){
			J.dispose();
			ConfirmMeal me = new ConfirmMeal();
		}
		else if(e.getSource()==backb){
			J.dispose();
			Admin a = new Admin();
		}
		
	}
	
}

