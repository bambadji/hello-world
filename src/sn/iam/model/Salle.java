package sn.iam.model;

import java.util.ArrayList;

public class Salle {
	private int code;
	private String nom;
	private String capacite;
	private String etage;
	private ArrayList<Equipement> equipement;
	private ArrayList<PlanningSalle> planningSalles ;
	private Object site;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(int code, String nom, String capacite, String etage, ArrayList<Equipement> equipement,
			ArrayList<PlanningSalle> planningSalles, Object site) {
		super();
		this.code = code;
		this.nom = nom;
		this.capacite = capacite;
		this.etage = etage;
		this.equipement = equipement;
		this.planningSalles = planningSalles;
		this.site = site;
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
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public ArrayList<Equipement> getEquipement() {
		return equipement;
	}
	public void setEquipement(ArrayList<Equipement> equipement) {
		this.equipement = equipement;
	}
	public ArrayList<PlanningSalle> getPlanningSalles() {
		return planningSalles;
	}
	public void setPlanningSalles(ArrayList<PlanningSalle> planningSalles) {
		this.planningSalles = planningSalles;
	}
	public Object getSite() {
		return site;
	}
	public void setSite(Object site) {
		this.site = site;
	}
	
	
}
