package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import Controller.pcontroller;

public class DAO {

static Connection con;
	
	static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","sql5155");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
public int product(DTO p1) {
		
		PreparedStatement pstmt=null;
		int count=0;
		String query="insert into start_up values(?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, p1.getName());
			pstmt.setString(3, p1.getProfession());
			pstmt.setString(4, p1.getEmail());
			pstmt.setString(5, p1.getCity());
			pstmt.setString(6, p1.getState());
			pstmt.setString(7, p1.getContact());
			pstmt.setString(8, p1.getFile());
			
		    count=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count+1;
	}
	
	public ArrayList<DTO> display(DTO dt) {
		
		
		PreparedStatement pstmt=null;
				
		ArrayList<DTO> clientList=new ArrayList<>();
		ResultSet rs=null;
		String query="select * from client_info where profession=? and city=? and state=?";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, dt.getProfession());
			pstmt.setString(2, dt.getCity());
			pstmt.setString(3, dt.getState());
			rs=pstmt.executeQuery();
			while (rs.next()) {
								
				DTO p1=new DTO();
				p1.setId(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setProfession(rs.getString(3));
				p1.setEmail(rs.getString(4));
				p1.setCity(rs.getString(5));
				p1.setState(rs.getString(6));
				p1.setContact(rs.getString(7));
				p1.setFile(rs.getString(8));			
				clientList.add(p1);
								
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientList;
	}
}
