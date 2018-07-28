package sn.iam.model;

import java.util.ArrayList;

public class Domaine {
	private int code;
	private String nom;
	private ArrayList<Filiere> filieres ;
	
	public Domaine() {
		
	}

	public Domaine(int code, String nom, ArrayList<Filiere> filieres) {
		super();
		this.code = code;
		this.nom = nom;
		this.filieres = filieres;
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

	public ArrayList<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(ArrayList<Filiere> filieres) {
		this.filieres = filieres;
	}
	
	
}
