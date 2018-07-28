package sn.iam.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Implementation.IResponsableImp;
import sn.iam.interfaces.IResponsable;
import sn.iam.model.Responsable;
import sn.iam.model.SingletonConnection;

/**
 * Servlet implementation class ServletResponsable
 */
@WebServlet("/responsable")
public class ServletResponsable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IResponsable metier = null; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletResponsable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Connection con = SingletonConnection.getConnexion();
		metier = SingletonConnection.getIResponsableImp();
		//metier.
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		Responsable responsable = null;
		String action = request.getParameter("action");
		int ok = 4;
		String mode = "add";
		if (action != null) {
			if (action.equals("add")) {
				responsable = new Responsable();
				responsable.setNom(request.getParameter("nom"));
				responsable.setPrenom(request.getParameter("prenom"));
				responsable.setLogin(request.getParameter("login"));
				responsable.setPassword(request.getParameter("password"));
				try {
					mode = request.getParameter("mode");
					if (mode.equals("add")) {
						metier.AddResponsable(responsable);
						ok = 1;
					} else if (mode.equals("update")) {
						responsable.setCode(Integer.parseInt(request.getParameter("code")));
						metier.UpdateResponsable(responsable);
						mode = "add";
						ok = 2;
					}
				} catch (Exception e) {
					// TODO: handle exception
					ok = 0;
					System.out.println("erreur lors de insert : "+e.getMessage());
				}
			}
			else if (action.equals("update")) {
				try {
					int code = Integer.parseInt(request.getParameter("code"));
					responsable = metier.getByCode(code);
					mode = "update";
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}//end if (action.equals("update"))
			else if (action.equals("delete")) {
				try {
					int code = Integer.parseInt(request.getParameter("code"));
					metier.DeleteResponsable(code);
					ok = 3;
				} catch (Exception e) {
					// TODO: handle exception
					ok = 0;
					System.out.println(e.getMessage());
				}
			}//end if (action.equals("delete"))
		}
		
		List<Responsable> listeResponsables = metier.getAll();
		request.setAttribute("ok", ok);
		request.setAttribute("mode", mode);
		request.setAttribute("responsable", responsable);
		request.setAttribute("listeResponsables", listeResponsables);
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);
	}

}
