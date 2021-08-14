package LMS;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {

    Connection conn;

    public static Connection ConnecrDb() {
        try {
//          
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1524:xe","sys1","oracledm1nPwd");  
          
            if (conn != null) {
                System.out.println("Connected");
            }

//            Connection conn = DriverManager.getConnection("jdbc:mysql://xo3.x10hosting.com:2083//", "triciado","triciarelox");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://xo3.x10hosting.com:2083//", "triciado","triciarelox");
            return conn;


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
