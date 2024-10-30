
package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class signUp extends JFrame implements ActionListener
{
    Random ran=new Random();
    
    Long first4=(ran.nextLong()%9000L)+1000L;
    
    String first=" "+Math.abs(first4);
    
    JTextField textName,textFname,textMs,textEmail,textAdd,textCity,textPin,textState;
    
    JRadioButton r1,r2,m1,m2,m3,m4;
    
    JDateChooser date;
    
    JButton next;

    public signUp(){
        super("APPLICATION FORM");
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2=i.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(25,0,100,100);
        add(label);
        
        JLabel label2=new JLabel("APPLICATION FORM NO. "+first);
        label2.setBounds(150,10,600,40);
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        add(label2);
        
        JLabel label3=new JLabel("Page 1");
        label3.setBounds(380,50,600,40);
        label3.setFont(new Font("Raleway",Font.BOLD,15));
        add(label3);
        
        JLabel label4=new JLabel("Personal details");
        label4.setBounds(340,80,600,40);
        label4.setFont(new Font("Raleway",Font.BOLD,15));
        add(label4);
        
        JLabel labelName=new JLabel("Name              :");
        labelName.setBounds(120,128,200,40);
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName);
        
        textName=new JTextField();
        textName.setBounds(280,135,350,30);
        textName.setFont(new Font("Raleway",Font.BOLD,15));
        add(textName);
        
        JLabel labelfname=new JLabel("Father's name :");
        labelfname.setBounds(120,170,200,40);
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelfname);
        
        textFname=new JTextField();
        textFname.setBounds(280,175,350,30);
        textFname.setFont(new Font("Raleway",Font.BOLD,15));
        add(textFname);
        
        JLabel gender=new JLabel("Gender           :");
        gender.setBounds(120,210,200,40);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);
        
        r1=new JRadioButton("Male");
        r1.setBounds(300,215,120,30);
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBounds(450,215,200,30);
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        add(r2);
        
        ButtonGroup group=new ButtonGroup();
        group.add(r1);
        group.add(r2);
        
        JLabel DOB=new JLabel("DOB                :");
        DOB.setBounds(120,250,200,40);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);
        
        date=new JDateChooser();
        date.setForeground(new Color(105,105,105));
        date.setBounds(280,250,350,30);
        date.setFont(new Font("Raleway",Font.BOLD,15));
        add(date);
        
        JLabel ms=new JLabel("Marital status  :");
        ms.setBounds(120,285,200,40);
        ms.setFont(new Font("Raleway",Font.BOLD,20));
        add(ms);
        
        m1=new JRadioButton("Married");
        m1.setBounds(280,300,100,15);
        m1.setFont(new Font("Raleway",Font.BOLD,15));
        m1.setBackground(new Color(222,255,228));
        add(m1);
        
        m2=new JRadioButton("Widow");
        m2.setBounds(380,300,100,15);
        m2.setFont(new Font("Raleway",Font.BOLD,15));
        m2.setBackground(new Color(222,255,228));
        add(m2);
        
        m3=new JRadioButton("Single");
        m3.setBounds(480,300,100,20);
        m3.setFont(new Font("Raleway",Font.BOLD,15));
        m3.setBackground(new Color(222,255,228));
        add(m3);
        
        m4=new JRadioButton("Divorced");
        m4.setBounds(580,300,100,15);
        m4.setFont(new Font("Raleway",Font.BOLD,15));
        m4.setBackground(new Color(222,255,228));
        add(m4);
        
        ButtonGroup group2=new ButtonGroup();
        group2.add(m1);
        group2.add(m2);
        group2.add(m3);
        group2.add(m4);
        
        JLabel email=new JLabel("E-mail             :");
        email.setBounds(120,330,200,40);
        email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        
        textEmail=new JTextField();
        textEmail.setBounds(280,337,350,30);
        textEmail.setFont(new Font("Raleway",Font.BOLD,15));
        add(textEmail);
        
        JLabel address=new JLabel("Address          :");
        address.setBounds(120,370,200,40);
        address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address);
        
        textAdd=new JTextField();
        textAdd.setBounds(280,377,350,30);
        textAdd.setFont(new Font("Raleway",Font.BOLD,15));
        add(textAdd);
        
        JLabel city=new JLabel("City                :");
        city.setBounds(120,410,200,40);
        city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);
        
        textCity=new JTextField();
        textCity.setBounds(280,417,350,30);
        textCity.setFont(new Font("Raleway",Font.BOLD,15));
        add(textCity);
        
        JLabel pin=new JLabel("Pincode          :");
        pin.setBounds(120,450,200,40);
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        add(pin);
        
        textPin=new JTextField();
        textPin.setBounds(280,457,350,30);
        textPin.setFont(new Font("Raleway",Font.BOLD,15));
        add(textPin);
        
        JLabel state=new JLabel("State               :");
        state.setBounds(120,490,200,40);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        
        textState=new JTextField();
        textState.setBounds(280,497,350,30);
        textState.setFont(new Font("Raleway",Font.BOLD,15));
        add(textState);
        
        next =new JButton("Next");
        next.setBounds(550,550,120,30);
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        getContentPane().setBackground(new Color(222,255,228));
        setSize(800,650);
        setLocation(250,40);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String dob=((JTextField) date.getDateEditor().getUiComponent()).getText();
        String maritalStatus=null;
        if(m1.isSelected()){
            maritalStatus="Married";
        }
        else if(m2.isSelected()){
            maritalStatus="Widow";
        }
        else if(m3.isSelected()){
            maritalStatus="Single";
        }
        else if(m4.isSelected()){
            maritalStatus="Divorced";
        }
        String mail=textEmail.getText();
        String address=textAdd.getText();
        String city=textCity.getText();
        String state=textState.getText();
        String pincode=textPin.getText();
        
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required field");
            }
            else{
                Connec con1=new Connec();
                String q="insert into signUp values('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+dob+"','"+maritalStatus+"','"+mail+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                con1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new signUp();
    }
}
