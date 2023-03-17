
package sanjeevaniapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
     
    
   
     private static Connection conn=null;

    static
    {

        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded successfully");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(0);
        }
        try
        {
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@//HacksRK-PC:1521/xe","HMS","HacksRK");
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@//hacksrk-hms.ca7xe0n4hhik.ap-southeast-2.rds.amazonaws.com:1521/ORCL","admin","HacksRK2003");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@hacksrk-hms.ca7xe0n4hhik.ap-southeast-2.rds.amazonaws.com:1521:ORCL", "admin", "HacksRK2003");
                System.out.println("connection open successfully");
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error in DB Connection!!", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }

    }

    public static Connection getConnection()
    {
        return conn;
    }

    public static void closeConnection()
    {
        if (conn!=null)
        {

            try
            {
                conn.close();
                System.out.println("conn close successfully");
            }
            catch (SQLException e)
            {
                e.printStackTrace();

            }
        }
    }
    
}
