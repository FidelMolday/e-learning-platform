package databases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabasesMySQL {

    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningspacedb","root","");
            System.out.println(con);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}