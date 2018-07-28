package sn.iam.interfaces;

import java.util.ArrayList;

import sn.iam.model.Responsable;

public interface IResponsable {
	public void AddResponsable(Responsable responsable);
	public ArrayList<Responsable> getAll();
	public ArrayList<Responsable> getByName(String nom);
	public Responsable getByCode(int code);
	public void UpdateResponsable(Responsable responsable);
	public void DeleteResponsable(int code);
	
}
