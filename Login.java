
package bank.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener
{
    JButton login,signUp,clean;
    JTextField cardTextField;
    JPasswordField passwordField;
   Login(){
       setTitle("AUTOMATIC TELLER MACHINE");
       setLayout(null);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
       Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel label=new JLabel(i3);
       label.setBounds(330, 0, 100, 100);
       add(label);
       
       ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("Icons/card.png"));
       Image iii2=iii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon iii3=new ImageIcon(iii2);
       JLabel label3=new JLabel(iii3);
       label3.setBounds(580,350,100,100);
       add(label3);
       
       JLabel text=new JLabel("Welcome to ATM");
       text.setForeground(Color.black);
       text.setFont(new Font("Arial",Font.BOLD,35));
       text.setBounds(250, 90, 380, 40);
       add(text);
       
       JLabel cardno=new JLabel("Card no :");
       cardno.setFont(new Font("Ralway",Font.BOLD,28));
       cardno.setForeground(Color.black);
       cardno.setBounds(150, 150, 180, 40);
       add(cardno);
       
       cardTextField=new JTextField();
       cardTextField.setBounds(330,155,250,30);
       cardTextField.setFont(new Font("Arial",Font.BOLD,14));
       add(cardTextField);
       
       JLabel pin=new JLabel("PIN        : ");
       pin.setFont(new Font("Ralway",Font.BOLD,28));
       pin.setForeground(Color.black);
       pin.setBounds(155, 220, 180, 40);
       add(pin);
       
       passwordField=new JPasswordField();
       passwordField.setBounds(330, 225, 250, 30);
       passwordField.setFont(new Font("Arial",Font.BOLD,14));
       add(passwordField);
       
       login=new JButton("SIGN IN");
       login.setBounds(250,300,120,30);
       login.setFont(new Font("Arial",Font.BOLD,14));
       login.setBackground(Color.black);
       login.setForeground(Color.white);
       login.addActionListener(this);
       add(login);
       
       clean=new JButton("CLEAN");
       clean.setBounds(380,300,120,30);
       clean.setFont(new Font("Arial",Font.BOLD,14));
       clean.setBackground(Color.black);
       clean.setForeground(Color.white);
       clean.addActionListener(this);
       add(clean);
       
       signUp=new JButton("SIGN UP");
       signUp.setBounds(250,350,250,30);
       signUp.setFont(new Font("Arial",Font.BOLD,14));
       signUp.setBackground(Color.BLACK);
       signUp.setForeground(Color.white);
       signUp.addActionListener(this);
       add(signUp);
       
       ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Icons/backbg.png"));
       Image ii2=ii1.getImage().getScaledInstance(850, 480, WIDTH);
       ImageIcon ii3=new ImageIcon(ii2);
       JLabel label2=new JLabel(ii3);
       label2.setBounds(0,0,850,480);
       add(label2);
       
       setSize(800, 480);
       setVisible(true);
       setLocation(290, 180);
   }

    @Override
    public void actionPerformed(ActionEvent a) {
        try {
            if(a.getSource() == login){
                Connec con=new Connec();
                String cardno=cardTextField.getText();
                String pin=passwordField.getText();
                String q="select * from login where card_num='"+cardno+"' and pin='"+pin+"'";
                ResultSet resultset=con.statement.executeQuery(q);
                if(resultset.next()){
                    setVisible(false);
                    new Main_class(pin);
                }
                        
            }
            else if(a.getSource()==clean){
                 cardTextField.setText("");
                 passwordField.setText("");
            }
            else if (a.getSource()==signUp) {
                new signUp();
                setVisible(false);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) 
    {
       new Login();
    }
    
}
