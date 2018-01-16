
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navi
 */
public class DataMain {

    /**
     * @param args the command line arguments
     */
    private static Connection conn;
    public static Connection connectSql()
    {
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog((Component)new Object(), "Couldn't connect to Database! Exiting...");
            System.exit(0);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login l=new Login();
        l.setVisible(true);
    }
 
}
