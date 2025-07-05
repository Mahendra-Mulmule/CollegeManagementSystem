package College_information;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class College_interface_impliment  implements College_interface{
	

	//connecting with database 
	static String url="jdbc:mysql://localhost:3306/college_db";
	String username= "root";
	String password= "root";

	Connection con;
	
	College_interface_impliment() throws SQLException{
		
		con=DriverManager.getConnection(url,username,password);
		
		System.out.println("connection establish successfully");
	}
	
	@Override
	public void addCollege(College college) {
			

		String query="insert into college (id, collegename, location, collegetype,avg_fee) values (?,?,?,?,?)";
		
		PreparedStatement stmt=null;
		
		try {
			stmt=con.prepareStatement(query);
			stmt.setInt(1, college.College_id);
			stmt.setString(2,college.College_name );
			stmt.setString(3,college.College_location);
			stmt.setString(4,college.College_type);
			stmt.setInt(5, college.College_avg_fee);
			stmt.executeUpdate();
			System.out.println("college added successfully");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean D_CollgeBy_id(int Collegeid) {
		
		String query="delete from college where id =?";
		
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Collegeid);
			int rowaffected = pstmt.executeUpdate();
			return rowaffected > 0;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<College> getcollege() {
		// TODO Auto-generated method stub
		 List<College> list = new ArrayList<>();
	        try {
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM college");
	            
	            while (rs.next()) {
	                College c = new College(
	                    rs.getInt("id"),
	                    rs.getString("collegename"),
	                    rs.getString("location"),
	                    rs.getString("collegetype"),
	                    rs.getInt("avg_fee")
	                );
	                list.add(c);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return list;
	    }

	@Override
	public boolean infoby_id(int collegeid) {
		
		
	    try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM college WHERE id=?");
            ps.setInt(1, collegeid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Location: " + rs.getString("location"));
                System.out.println("Type: " + rs.getString("type"));
                System.out.println("Avg Fee: " + rs.getInt("avg_fee"));
                return true;
            } else {
                System.out.println("❌ College not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


	@Override
	public void closeconnection() throws SQLException {
		
		if(con !=null) {
			con.close();
			System.out.println("connection closed successfully!!");
		}
		
	}
	

}
