import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnector(){
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcruddb", "root", "root");
			
			return con;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return null;
	}
}
