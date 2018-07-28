package sn.iam.model;

import java.util.ArrayList;

public class Responsable {
	private int code;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsable(int code, String nom, String prenom, String login, String password) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
