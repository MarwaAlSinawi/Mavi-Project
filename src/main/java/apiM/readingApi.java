package apiM;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class readingApi {

	public static void ReadRows() throws IOException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=API;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Scanner sa = new Scanner(System.in);

		System.out.println("Enter id that you to show ?");
		 int insert = sa.nextInt();

		int count = 0;
		String sql = "SELECT * FROM SoloProject Where id="+insert;

		Connection con = null;

		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			ResultSet result = st.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String webpage  = result.getString("web_pages");
				String name  = result.getString("name");
				String domian = result.getString("domains");
				String state_province = result.getString("state_province");
				String alpha_two_code = result.getString("alpha_two_code");
				String country = result.getString("country");

				System.out.println(id + " " +webpage+ "  " + name + " " + domian + " " + state_province+""+alpha_two_code+""+country);
				count++;

			}
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

}

