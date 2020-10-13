package dao;

import static db.jdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.ArtDTO;
import dto.MemberDTO;
import dto.ShowDTO;

public class MemberDAO {
	private static MemberDAO dao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public static MemberDAO getInstance() {
		if(dao==null) {
			dao=new MemberDAO();
		}
		return dao;
	}

	public void setConnection(Connection con) {
		this.con=con;
	}
	
	///////////////////ȸ������
	public int memberJoin(MemberDTO member) {
		String sql="INSERT INTO MEMBERS VALUES(?,?,?,?)";
		int joinResult=0;
		
		try {
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());		
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getfArtist());
			joinResult=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return joinResult;
	}
	
	////////////�α���
	public MemberDTO memberLogin(String id, String pw) {
		String sql="SELECT * FROM MEMBERS WHERE ID=? AND PW=?";
		
		MemberDTO member=null;
		
		try {
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO();
				member.setfArtist(rs.getString("FARTIST"));
				member.setId(rs.getString("ID"));
				member.setName(rs.getString("NAMES"));
				member.setPw(rs.getString("PW"));
			} else {
				member = null;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return member;
	}

	public List<ArtDTO> ArtList(String name) {
		System.out.println("name : " + name);
		String sql = "SELECT * FROM ARTT WHERE ANAME=?";
		
		List<ArtDTO> art = new ArrayList<ArtDTO>();
		ArtDTO aList = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				aList = new ArtDTO();
				aList.setName(rs.getString("ANAME"));
				aList.setTitle(rs.getString("ATITLE"));
				aList.setYear(rs.getString("AYEAR"));
				aList.setFile(rs.getString("AFILE"));
				aList.setInfo(rs.getString("AINFO"));
				
				art.add(aList);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		System.out.println(aList);
		System.out.println(art);
		
		return art;
	}

	




	
}


