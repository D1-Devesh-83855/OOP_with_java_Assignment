package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Comparator;

import entity.Student;
import util.DbUtill;

public class StudentDao implements Comparator<StudentDao>{
	private Connection connection;
	public StudentDao() throws SQLException {
		connection =  DbUtill.getConnection();
		
	}
	
	
	public void addStudent(Student student) throws SQLException {
		String sql = "insert into student (rollNo ,marks , name , course)values (?,?,?,?)";
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql) ){
			preparedStatement.setInt(1, student.getRollNo());
			preparedStatement.setDouble(2, student.getMarks() );
			preparedStatement.setString(3, student.getName());
			
			
			
		}
		
		
		
		
	}
	
	
	
	

	
	
	

	@Override
	public int compare(StudentDao o1, StudentDao o2) {
		// TODO Auto-generated method stub
		return o1.compare(o1, o2);
	}



	


}
