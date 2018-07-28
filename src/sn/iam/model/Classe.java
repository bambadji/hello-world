package sn.iam.model;

public class Classe {
	private int code;
	private String nom;
	private String anneeScolaire;
	private int nbEtudiant;
	private Object responsable;
	private Object filiere;
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classe(int code, String nom, String anneeScolaire, int nbEtudiant, Object responsable, Object filiere) {
		super();
		this.code = code;
		this.nom = nom;
		this.anneeScolaire = anneeScolaire;
		this.nbEtudiant = nbEtudiant;
		this.responsable = responsable;
		this.filiere = filiere;
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

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	public int getNbEtudiant() {
		return nbEtudiant;
	}

	public void setNbEtudiant(int nbEtudiant) {
		this.nbEtudiant = nbEtudiant;
	}

	public Object getResponsable() {
		return responsable;
	}

	public void setResponsable(Object responsable) {
		this.responsable = responsable;
	}

	public Object getFiliere() {
		return filiere;
	}

	public void setFiliere(Object filiere) {
		this.filiere = filiere;
	}
	
	
	
}
