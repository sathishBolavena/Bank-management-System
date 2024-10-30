
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{

    String pin;
    
    JTextField textfield;
    
    JButton button1,button2;
    
    public Deposit(String pin) {
         setLayout(null);
        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,1300,700);
        add(l);
        
        JLabel label1=new JLabel("Enter your deposit amount ");
        label1.setBounds(400,260,400,30);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        label1.setForeground(Color.white);
        l.add(label1);
        
        textfield =new JTextField();
        textfield.setBounds(410,295,240,30);
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.white);
        textfield.setFont(new Font("Raleway",Font.BOLD,18));
        l.add(textfield);
        
        button1=new JButton("DEPOSIT");
        button1.setBackground(new Color(65,125,128));
        button1.setForeground(Color.white);
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.setBounds(600,407,110,25);
        button1.addActionListener(this);
        l.add(button1);
        
        button2=new JButton("BACK");
        button2.setBackground(new Color(65,125,128));
        button2.setForeground(Color.white);
        button2.setFont(new Font("Raleway",Font.BOLD,14));
        button2.setBounds(600,437,110,23);
        button2.addActionListener(this);
        l.add(button2);
                
        setSize(1560,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
           String amount=textfield.getText();
           Date date=new Date();
           if(e.getSource()==button1){
               if(textfield.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "Enter valid deposit amount");
               }
               else{
                   Connec con=new Connec();
                   con.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                   JOptionPane.showMessageDialog(null,"Rs."+amount+"deposited successfully");
                   setVisible(false);
                   
               }
           }
           else if(e.getSource()==button2){
               setVisible(false);
           }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Deposit("");
    }
    
}
