
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class SignUp3 extends JFrame implements ActionListener
{
    
    JRadioButton r1,r2,r3,r4;
    
    JCheckBox c1,c2,c3,c4,c5,c6;
    
    JButton sub,can;
    
    String formno;
    
    public SignUp3(String formno){
        super("APPLICATION FORM");
        
        this.formno=formno;
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(150,5,100,100);
        add(label);
        
        JLabel l1=new JLabel("Page 3 :");
        l1.setBounds(280,30,200,30);
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);
        
        JLabel l2=new JLabel("Account details");
        l2.setBounds(280,70,200,30);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);
        
        JLabel l3=new JLabel("Account type     : ");
        l3.setBounds(120,110,200,30);
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        add(l3);
        
        r1=new JRadioButton("Saving account");
        r1.setBounds(120,150,200,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(215,252,252));
        add(r1);
        
        r2=new JRadioButton("Fixed deposit");
        r2.setBounds(350,150,200,30);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(215,252,252));
        add(r2);
        
        r3=new JRadioButton("Current account");
        r3.setBounds(120,190,200,30);
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(215,252,252));
        add(r3);
        
        r4=new JRadioButton("Recurring deposit");
        r4.setBounds(350,190,200,30);
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(215,252,252));
        add(r4);
        
        ButtonGroup group=new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        
        JLabel l4=new JLabel("Card number                    :");
        l4.setBounds(120,260,200,30);
        l4.setFont(new Font("Raleway",Font.BOLD,14));
        add(l4);
        
        JLabel l5=new JLabel("(Your 16-digit card number)");
        l5.setBounds(120,285,200,20);
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        add(l5);
        
        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4890");
        l6.setBounds(330,260,300,30);
        l6.setFont(new Font("Raleway",Font.BOLD,14));
        add(l6);
        
        JLabel l7=new JLabel("(It would appear on atm card/cheque book and statements)");
        l7.setBounds(330,280,400,30);
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        add(l7);
        
        JLabel l8=new JLabel("PIN                                      :");
        l8.setBounds(120,320,200,30);
        l8.setFont(new Font("Raleway",Font.BOLD,14));
        add(l8);
        
        JLabel l9=new JLabel("XXXX");
        l9.setBounds(330,320,300,30);
        l9.setFont(new Font("Raleway",Font.BOLD,14));
        add(l9);

        JLabel l10=new JLabel("(4-digit password)");
        l10.setBounds(120,335,200,30);
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        add(l10);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(120,380,200,30);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        add(c1);
        
        c2=new JCheckBox("Internet banking");
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,380,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        add(c2);
        
        c3=new JCheckBox("Mobile banking");
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(120,420,200,30);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        add(c3);
        
        c4=new JCheckBox("Email alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,420,200,30);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        add(c4);
        
        c5=new JCheckBox("Cheque book");
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(120,460,200,30);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,460,200,30);
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        add(c6);
        
        Checkbox c7=new Checkbox("I here by declare that the above entered details are correct to the best of my knowledge",true);
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(110,510,600,20);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        add(c7);
        
        JLabel l11=new JLabel("Form no :"+formno);
        l11.setBounds(600,10,300,30);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        add(l11);
        
        sub=new JButton("Submit");
        sub.setBounds(200,550,100,30);
        sub.setFont(new Font("Raleway",Font.BOLD,16));
        sub.setBackground(Color.black);
        sub.setForeground(Color.white);
        sub.addActionListener(this);
        add(sub);
        
        can=new JButton("Cancel");
        can.setBounds(400,550,100,30);
        can.setFont(new Font("Raleway",Font.BOLD,16));
        can.setBackground(Color.black);
        can.setForeground(Color.white);
        can.addActionListener(this);
        add(can);
        
     
        
        setSize(800,650);
        getContentPane().setBackground(new Color(215,252,252));
        setLocation(250,40);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acctype=null;
        if(r1.isSelected()){
            acctype="Saving account";
        }
        else if(r2.isSelected()){
            acctype="Current account";
        }
        else if(r3.isSelected()){
            acctype="Fixed deposit";
        }
        else if(r4.isSelected()){
            acctype="Reccuring deposit";
        }
        
        Random ran=new Random();
        
        Long first7=(ran.nextLong()%90000000L)+48905670000000L;
        String cardno=""+Math.abs(first7);
        
        Long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);
        
        String fac="";
        if(c1.isSelected()){
            fac=fac+"ATM CARD";
        }
        else if(c2.isSelected()){
            fac=fac+"Internet Banking";
        }
        else if(c3.isSelected()){
            fac=fac+"Mobile banking";
        }
        else if(c4.isSelected()){
            fac=fac+"Email alerts";
        }
        else if(c5.isSelected()){
            fac=fac+"Cheque book";
        }
        else if(c6.isSelected()){
            fac=fac+"E-Statement";
        }
        
        try{
            if(e.getSource()==sub){
                if(acctype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required field");
                }
                else{
                    Connec con=new Connec();
                    String q1="insert into signUpThree values('"+formno+"','"+acctype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    con.statement.executeUpdate(q1);
                    con.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
        
        else if(e.getSource()==can){
                System.exit(0);
                }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SignUp3("");
    }
    
}
