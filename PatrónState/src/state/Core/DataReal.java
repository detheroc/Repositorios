package state.Core;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataReal implements DataInterface{//Data con Base de datos
	String driver;
	String connectString;
	String user;
	String password;	
	DataReal(){
		driver = "org.postgresql.Driver";
		connectString = "jdbc:postgresql://localhost:5432/Repositorio";
		user = "postgres";
		password = "usuario";
	}
	public Connection connect(){		
		try{			
			Class.forName(driver);			
			Connection con = DriverManager.getConnection(connectString, user , password);			
			return con;
		}
		catch ( Exception e ){
			e.getMessage();			
			return null;
		}
	}

	@Override
	public String[] buscaDni(String a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean guardarData(String dni, String nombre, String edad,
			String telefono, int f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarData(String dni) {
		// TODO Auto-generated method stub
		return false;
	}

}
