package Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sn.iam.interfaces.IResponsable;
import sn.iam.model.Responsable;
import sn.iam.model.SingletonConnection;

public class IResponsableImp implements IResponsable {
	
	private Connection connection;
	public IResponsableImp() {
		connection = SingletonConnection.getConnexion();
	}

	@Override
	public void AddResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		String sql = "insert into responsable(prenom,nom,login,password) value(?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, responsable.getPrenom());
			ps.setString(2, responsable.getNom());
			ps.setString(3, responsable.getLogin());
			ps.setString(4, responsable.getPassword());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur insertion : "+e.getMessage());
		}
	}
	
	@Override
	public ArrayList<Responsable> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Responsable> listResponsable = new ArrayList<Responsable>();
		String sql = "select * from responsable";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Responsable responsable = new Responsable();
				responsable.setCode(rs.getInt("code"));
				responsable.setPrenom(rs.getString("prenom"));
				responsable.setNom(rs.getString("nom"));
				responsable.setLogin(rs.getString("login"));
				responsable.setPassword(rs.getString("password"));
				listResponsable.add(responsable);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur LISTE : "+e.getMessage());
		}
		return listResponsable;
	}
	
	@Override
	public Responsable getByCode(int code) {
		Responsable responsable = null;
		String sql = "select * from responsable where code=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				responsable = new Responsable();
				responsable.setCode(rs.getInt("code"));
				responsable.setPrenom(rs.getString("prenom"));
				responsable.setNom(rs.getString("nom"));
				responsable.setLogin(rs.getString("login"));
				responsable.setPassword(rs.getString("password"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur getBycode : "+e.getMessage());
		}
		if (responsable==null) throw new RuntimeException("Responsable "+code+" introvable");
		return responsable;
	}

	
	@Override
	public ArrayList<Responsable> getByName(String nom) {
		// TODO Auto-generated method stub
		ArrayList<Responsable> listResponsable = new ArrayList<Responsable>();
		String sql = "select * from responsable where nom like ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			String forSql = "%" + nom.toLowerCase() + "%";
			ps.setString(1, forSql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Responsable responsable = new Responsable();
				responsable.setCode(rs.getInt("code"));
				responsable.setPrenom(rs.getString("prenom"));
				responsable.setNom(rs.getString("nom"));
				responsable.setLogin(rs.getString("login"));
				responsable.setPassword(rs.getString("password"));
				listResponsable.add(responsable);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur getByNom : "+e.getMessage());
		}
		return listResponsable;
	}

	@Override
	public void UpdateResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		String sql = "update responsable set prenom=?,nom=?,login=?,password=? where code=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, responsable.getPrenom());
			ps.setString(2, responsable.getNom());
			ps.setString(3, responsable.getLogin());
			ps.setString(4, responsable.getPassword());
			ps.setInt(5, responsable.getCode());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur update : "+e.getMessage());
		}
	}

	@Override
	public void DeleteResponsable(int code) {
		// TODO Auto-generated method stub
		String sql = "delete from responsable where code=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, code);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("erreur delete : "+e.getMessage());
		}
	}

	
	

}
