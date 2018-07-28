package sn.iam.model;

import java.util.ArrayList;

public class Filiere {
	private int code;
	private String nom;
	private ArrayList<Classe> classes ;
	private Object domaine;
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiere(int code, String nom, ArrayList<Classe> classes, Object domaine) {
		super();
		this.code = code;
		this.nom = nom;
		this.classes = classes;
		this.domaine = domaine;
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
	public ArrayList<Classe> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<Classe> classes) {
		this.classes = classes;
	}
	public Object getDomaine() {
		return domaine;
	}
	public void setDomaine(Object domaine) {
		this.domaine = domaine;
	}
	
	
}
