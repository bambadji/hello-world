package sn.iam.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Implementation.IResponsableImp;
import sn.iam.interfaces.IResponsable;

public class SingletonConnection {
	
	private static Connection connection;
	static String url = "jdbc:mysql://localhost:3306/ges_salle";
	static String user = "root";
	static String password = "";
	static String driverName = "com.mysql.jdbc.Driver";
	static {
		try {
			Class.forName(driverName);
			System.out.println("driver charger ...");
		} catch (ClassNotFoundException e) {
			System.out.println("erreur du driver : "+e.getMessage());
		}
		try {
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("ouverture de la connexion ...");
		} catch (SQLException e) {
			System.out.println("erreur de connexion : "+e.getMessage());
		}
		
		if (connection != null) {
			System.out.println("vous avez le controle du database!");
		} else {
			System.out.println("connexion fermer!");
		}
	}
	
	public static Connection getConnexion() {
		return connection;
	}
	
	public static IResponsable getIResponsableImp(){
		return new IResponsableImp();
	}
	
//	public static void main(String[] args) {
//		getConnexion();
//	}
}
