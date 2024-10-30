
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_class extends JFrame implements ActionListener{

    JButton b1,b2,b3,b4,b5,b6,b7;
    
    String pin;
    
    public Main_class(String pin){
        
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,1300,700);
        add(l);
        
        JLabel label=new JLabel("Please select your transaction");
        label.setBounds(370,260,400,30);
        label.setFont(new Font("Raleway",Font.BOLD,20));
        label.setForeground(Color.white);
        l.add(label);
        
        b1=new JButton("DEPOSIT");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.setBounds(315,348,150,25);
        b1.addActionListener(this);
        l.add(b1);
        
        b2=new JButton("CASH WITHDRAWL");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.setBounds(565,348,150,25);
        b2.addActionListener(this);
        l.add(b2);
        
        b3=new JButton("FAST CASH");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.white);
        b3.setBounds(315,377,150,25);
        b3.addActionListener(this);
        l.add(b3);
        
        b4=new JButton("MINI STATEMENT");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.white);
        b4.setBounds(565,377,150,25);
        b4.addActionListener(this);
        l.add(b4);
        
        b5=new JButton("PIN CHANGE");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.white);
        b5.setBounds(315,406,150,25);
        b5.addActionListener(this);
        l.add(b5);
        
        b6=new JButton("BALANCE ENQUIRY");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.white);
        b6.setBounds(565,406,150,25);
        b6.addActionListener(this);
        l.add(b6);
        
        b7=new JButton("EXIT");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.white);
        b7.setBounds(565,435,150,25);
        b7.addActionListener(this);
        l.add(b7);
        
        setSize(1560,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==b1){
                new Deposit(pin);
                  setVisible(false);
            }
        } 
        catch (Exception E) {
        }
    }
    
    public static void main(String[] args) {
        new Main_class("");
    }
}
