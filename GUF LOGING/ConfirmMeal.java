import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmMeal extends JFrame implements ActionListener
{
	JPanel panel;
	JCheckBox r1,f1,d1,m1,v1,e1;
	JComboBox r2,f2,d2,m2,v2,e2;
	JButton C,b;
	
	public ConfirmMeal()
	{
		super ("ConfirmMeal");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		r1 = new JCheckBox("Rice");
		r1.setBounds(20, 10, 80, 20);
		panel.add(r1);
		
		String rice[] = {"1R", "2R", "3R"};
		r2 = new JComboBox(rice);
		r2.setBounds(20, 50, 80, 20);
		panel.add(r2);
		
		f1 = new JCheckBox("Fish");
		f1.setBounds(220, 10, 80, 20);
		panel.add(f1);
		
		String fish[] = {"1F", "2F", "3F"};
		f2 = new JComboBox(fish);
		f2.setBounds(220, 50, 80, 20);
		panel.add(f2);
		
		d1 = new JCheckBox("Dal");
		r1.setBounds(420, 10, 80, 20);
		panel.add(r1);
		
		String dal[] = {"1D", "2D", "3D"};
		d2 = new JComboBox(dal);
		d2.setBounds(420, 50, 80, 20);
		panel.add(d2);
		
		m1 = new JCheckBox("Meat");
		m1.setBounds(20, 80, 80, 20);
		panel.add(m1);
		
		String meat[] = {"1M", "2M", "3M"};
		m2 = new JComboBox(meat);
		m2.setBounds(20, 110, 80, 20);
		panel.add(m2);
		
		v1 = new JCheckBox("Vegetables");
		v1.setBounds(220, 80, 80, 20);
		panel.add(v1);
		
		String veg[] = {"1V", "2V", "3V"};
		v2 = new JComboBox(veg);
		v2.setBounds(220, 110, 80, 20);
		panel.add(m2);
		
		e1 = new JCheckBox("Egg");
		e1.setBounds(320, 80, 80, 20);
		panel.add(e1);
		
		String egg[] = {"1E", "2E", "3E"};
		e2 = new JComboBox(egg);
		e2.setBounds(320, 110, 80, 20);
		panel.add(e2);
		
		C = new JButton("Confirm");
		C.setBounds(260,265,80,30);
		panel.add(C);
		
		b = new JButton("Back");
		b.setBounds(360,265,80,30);
		b.addActionListener(this);
		panel.add(b);
		
		this.add(panel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b){
			this.dispose();
			Student s = new Student();
		}
		
	}
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		