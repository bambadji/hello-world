package sn.iam.model;

import java.util.Date;

public class PlanningSalle {
	private int code;
	private Date jour;
	private Date heurDebut;
	private Date heureFin;
	private Object salle;
	public PlanningSalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlanningSalle(int code, Date jour, Date heurDebut, Date heureFin, Object salle) {
		super();
		this.code = code;
		this.jour = jour;
		this.heurDebut = heurDebut;
		this.heureFin = heureFin;
		this.salle = salle;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public Date getHeurDebut() {
		return heurDebut;
	}
	public void setHeurDebut(Date heurDebut) {
		this.heurDebut = heurDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}
	public Object getSalle() {
		return salle;
	}
	public void setSalle(Object salle) {
		this.salle = salle;
	}
	
	
}
