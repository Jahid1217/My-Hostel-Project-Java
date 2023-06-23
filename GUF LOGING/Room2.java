import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room2 extends JFrame implements ActionListener {
     JFrame j;
     JLabel name,id,rnum,rent;
     JTextField tfn,tfid,tfrn,tfrent;
     JButton sbmt,cancel,reset,back;
    
    public Room2(){
        
        j = new JFrame("Room booking");
        j.setSize(500,400);
        j.setLayout(null);

        name = new JLabel("Student Name");
        name.setBounds(120,50,80,20);
        
        id = new JLabel("Student Id");
        id.setBounds(120,80,80,20);
        
        rnum = new JLabel("Room No");
        rnum.setBounds(120,110,80,20);

        rent = new JLabel("Room Rent");
        rent.setBounds(120,140,80,20);

        tfn = new JTextField();
        tfn.setBounds(210,50,100,20);

        tfid = new JTextField();
        tfid.setBounds(210,80,100,20);

        tfrn = new JTextField();
        tfrn.setBounds(210,110,100,20);
        tfrn.setEditable(false);

        tfrent = new JTextField("5000");
        tfrent.setBounds(210,140,100,20);
        tfrent.setEditable(false);

        sbmt = new JButton("Submit");
        sbmt.setBounds(120,180,100,30);
        sbmt.setBackground(Color.LIGHT_GRAY);

        reset = new JButton("Reset");
        reset.setBounds(230,180,100,30);
        reset.setBackground(Color.LIGHT_GRAY);
        reset.addActionListener(this);
        
        back = new JButton("Back");
        back.setBounds(350,300,70,30);
        back.setBackground(Color.LIGHT_GRAY);
        back.addActionListener(this);
        j.add(back);

        

        j.add(name);
        j.add(id);
        j.add(rnum);
        j.add(rent);
        j.add(tfn);
        j.add(tfid);
        j.add(tfrn);
        j.add(tfrent);
        j.add(sbmt);
        j.add(reset);
    
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }

    public void my_update(String str) {
		tfrn.setText(str);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==reset){
            tfn.setText("");
            tfid.setText("");
            //tfrn.setText("");
            //tfrent.setText("");
        }
        else if(e.getSource()==back){
            j.dispose();
            //Room1 r = new Room1();
        }
        
    }   
    
}
