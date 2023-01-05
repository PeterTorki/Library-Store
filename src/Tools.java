import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Tools {
	
	private static Connection con = null;
	
	public static java.sql.Connection connectionToSql() {
		try {
                        //System.out.println("Tools.connectionToSql()");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6588348", "sql6588348", "LDug3EnvfM");
		} catch(Exception ex) { ex.printStackTrace(); }
		return con;
	}
	
	public static void closeConnection() {
            try {
                    con.close();
            } catch(Exception ex) {

            }
	}
        
        
        
	public static boolean excecuateStatement(String sql) {
		try {
			connectionToSql();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.execute();
			return true;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex, "Excecuate sql method", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static ResultSet selectQuery(String sql) {
		try {
			connectionToSql();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			return rs;
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex, "selectQuery sql method", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
}
