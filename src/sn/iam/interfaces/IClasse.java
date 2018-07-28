package sn.iam.interfaces;

import java.util.ArrayList;

import sn.iam.model.Classe;

public interface IClasse {
	public void AddClasse();
	public void UpdateClasse();
	public void DeleteClasse();
	public ArrayList<Classe> getAll();
	public Classe getById();
	ArrayList<Classe> getAllClasse();
}
