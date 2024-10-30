
package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SignUp2 extends JFrame implements ActionListener
{
    
    String formno;
    
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    
    JTextField textPAN,textAadhar;
    
    JRadioButton r1,r2,e1,e2;
    
    JButton next;
    
    SignUp2(String formno){
        super("APPLICATION FORM");
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i1=img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel label1=new JLabel(i2);
        label1.setBounds(150,5,100,100);
        add(label1);
        
        this.formno=formno;
        
        JLabel label2=new JLabel("Page 2 :");
        label2.setBounds(300,40,200,40);
        label2.setFont(new Font("Raleway",Font.BOLD,20));
        add(label2);
        
        JLabel label3=new JLabel("Additional Details ");
        label3.setBounds(300,70,200,40);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        add(label3);
        
        JLabel religion=new JLabel("Religion                 :");
        religion.setBounds(100,115,200,40);
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        add(religion);
        
        String[] textRel={"         --------------Select---------------        ","Hindu","Muslim","Sikh","Christian","Other"};
        comboBox =new JComboBox(textRel);
        comboBox.setBounds(300,125,300,25);
        comboBox.setBackground(new Color(252,208,76));  
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox);
        
        JLabel category=new JLabel("Category               :");
        category.setBounds(100,165,300,30);
        category.setFont(new Font("Raleway",Font.BOLD,18));
        add(category);
        
        String[] textCat={"         --------------Select---------------        ","General","OBC","ST","SC","Other"};
        comboBox2=new JComboBox(textCat);
        comboBox2.setBounds(300,170,300,25);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBackground(new Color(252,208,76));  
        add(comboBox2);
        
        JLabel income=new JLabel("Income                  :");
        income.setBounds(100,210,300,30);
        income.setFont(new Font("Raleway",Font.BOLD,18));
        add(income);
        
        String[] textIncome={"         --------------Select---------------        ","Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(textIncome);
        comboBox3.setBounds(300,215,300,25);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));  
        add(comboBox3);
        
        JLabel study=new JLabel("Education              :");
        study.setBounds(100,255,300,30);
        study.setFont(new Font("Raleway",Font.BOLD,18));
        add(study);
        
        String[] textEducation={"         --------------Select---------------        ","Non-Graduation","Undergraduate","Post graduation","Doctrate","Others"};
        comboBox4=new JComboBox(textEducation);
        comboBox4.setBounds(300,260,300,25);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));  
        add(comboBox4);
        
        JLabel occupation=new JLabel("Occupation           :");
        occupation.setBounds(100,300,300,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,18));
        add(occupation);
        
        String[] textOccupation={"         --------------Select---------------        ","Salaried","Self-Employed","Bussiness","Student","Retired","Others"};   
        comboBox5 =new JComboBox(textOccupation);
        comboBox5.setBounds(300,305,300,25);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBackground(new Color(252,208,76));
        add(comboBox5);
        
        JLabel PAN=new JLabel("PAN Number        :");
        PAN.setBounds(100,345,300,30);
        PAN.setFont(new Font("Raleway",Font.BOLD,18));
        add(PAN);
        
        textPAN=new JTextField();
        textPAN.setBounds(300,348,300,25);
        textPAN.setFont(new Font("Raleway",Font.BOLD,14));
        add(textPAN);
        
        JLabel aadhar=new JLabel("Aadhar                  :");
        aadhar.setBounds(100,395,300,30);
        aadhar.setFont(new Font("Raleway",Font.BOLD,18));
        add(aadhar);
        
        textAadhar=new JTextField();
        textAadhar.setBounds(300,398,300,25);
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAadhar);
        
        JLabel citizen=new JLabel("Senior citizen       :");
        citizen.setBounds(100,445,300,30);
        citizen.setFont(new Font("Raleway",Font.BOLD,18));
        add(citizen);
        
        r1=new JRadioButton("Yes");
        r1.setBounds(300,448,100,25);
        r1.setBackground(new Color(252,208,76));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);
        
        r2=new JRadioButton("No");
        r2.setBounds(400,448,100,25);
        r2.setBackground(new Color(252,208,76));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);
        
        ButtonGroup group1=new ButtonGroup();
        group1.add(r1);
        group1.add(r2);
        
        JLabel existingAcc=new JLabel("Existing account  :");
        existingAcc.setBounds(100,495,300,30);
        existingAcc.setFont(new Font("Raleway",Font.BOLD,18));
        add(existingAcc);
        
        e1=new JRadioButton("Yes");
        e1.setBounds(300,498,100,25);
        e1.setBackground(new Color(252,208,76));
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        add(e1);
        
        e2=new JRadioButton("No");
        e2.setBounds(400,498,100,25);
        e2.setBackground(new Color(252,208,76));
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        add(e2);
        
        ButtonGroup group2=new ButtonGroup();
        group2.add(e1);
        group2.add(e2);
        
        JLabel formNo=new JLabel("Form no :"+formno);
        formNo.setBounds(600,10,300,30);
        formNo.setFont(new Font("Raleway",Font.BOLD,18));
        add(formNo);
        
        next=new JButton("Next");
        next.setBounds(500,550,100,25);
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
      setLayout(null);
      setSize(800,650);
      setLocation(250,40);
      getContentPane().setBackground(new Color(252,208,76));
      setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox.getSelectedItem();
        String cat=(String) comboBox2.getSelectedItem();
        String income=(String) comboBox3.getSelectedItem();
        String study=(String) comboBox4.getSelectedItem();
        String occupation=(String) comboBox5.getSelectedItem();
        
        String pan=textPAN.getText();
        String aadhar=textAadhar.getText();
        
        String sCitizen="";
        if(r1.isSelected()){
            sCitizen="Yes";
        }
        else if(r2.isSelected()){
            sCitizen="No";
        }
        
        String eAccount="";
        if(e1.isSelected()){
            eAccount="Yes";
        }
        else{
            eAccount="No";
        }
        
        try{
            if(textPAN.getText().equals("")|| textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required field");
            }
            else{
                Connec con=new Connec();
                String q="insert into signUpTwo values('"+formno+"','"+rel+"','"+cat+"','"+income+"','"+study+"','"+occupation+"','"+pan+"','"+aadhar+"','"+sCitizen+"','"+eAccount+"')";
                con.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SignUp2("");
    }
}
