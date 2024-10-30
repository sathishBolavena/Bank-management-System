
package bank.management.system;

import java.sql.*;


public class Connec {
    
    Connection connection;
    Statement statement;
    
    public Connec(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","12345");
            statement=connection.createStatement();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
