package Implementation;

import java.util.List;

import sn.iam.model.Responsable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IResponsableImp metier = new IResponsableImp();
//		metier.AddResponsable(new Responsable(0,"moussa","fall","passer","passer"));
//		metier.AddResponsable(new Responsable(0,"moussa","diop","passer2","passer2"));
//		metier.AddResponsable(new Responsable(0,"moussa","DEME","passer3","passer3"));
		
		System.out.println("**************************************************************");
		List<Responsable> responsables = metier.getAll();
		for (Responsable responsable : responsables) {
			System.out.println(responsable.getLogin());
		}
//		System.out.println("**************************************************************");
//		int code = 1;
//		Responsable responsableByCode = metier.getByCode(code);
//		System.out.println(responsableByCode.getPrenom());
		
		System.out.println("**************************************************************");
		try {
			int code = 1;
			Responsable responsableByCode = metier.getByCode(code);
			responsableByCode.setNom("mansour");
			metier.UpdateResponsable(responsableByCode);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("**************************************************************");
		try {
			int code = 1;
			metier.DeleteResponsable(code);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
