package apiM;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class deletingApi {

	public static void Delete()throws IOException, InterruptedException {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=API;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String pass = "root";
        Connection con = null;
        try {
            Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            Scanner sa=new Scanner(System.in);
        	System.out.println("Enter id that you want to delete: ");
            int idinput =sa.nextInt();
            int count=0;
            String sql ="DELETE FROM SoloProject WHERE id = '"+idinput+"'";
            System.out.println("updeted successfully");
            ResultSet rs=st.executeQuery(sql);
            }
        catch (Exception ex) {
            System.err.println(ex);
        }

	}

}
