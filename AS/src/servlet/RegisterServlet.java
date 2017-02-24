package servlet;

import userentity.Visiter;
import visiterdao.VisiterDao;
import visiterdao.VisiterDaoimpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String num = request.getParameter("num");
		String password = request.getParameter("pass");
		String telephone = request.getParameter("tele");
		String address = request.getParameter("address");
		String father_job = request.getParameter("fjob");
		String mother_job = request.getParameter("mjob");
		String grd_school = request.getParameter("grds");
		String grd_grade = request.getParameter("grdg");
		
		ServletContext application = this.getServletContext();
		String uid = (String)application.getAttribute("uid");
		
		
		//System.out.println(name);
		
		Visiter visiter = new Visiter();
		visiter.setname(name);
		visiter.setsex(sex);
		visiter.setnum(num);
		visiter.setpassword(password);
		visiter.settelephone(telephone);
		visiter.setAddress(address);
		visiter.setfatherjob(father_job);
		visiter.setmotherjob(mother_job);
		visiter.setgrdschool(grd_school);
		visiter.setgrdgrade(grd_grade);
		visiter.setuid(uid);
		
		//System.out.println(visiter.getname());
		
		VisiterDao dao = new VisiterDaoimpl();
		boolean flag = false;
		try {
			Visiter vs = new Visiter();
			vs=dao.getyear();
			visiter.setYear(vs.getYear());
			flag = dao.addemp(visiter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag){
			int x=Integer.parseInt(uid);
			application.setAttribute("uid", Integer.toString(++x));
			
			response.sendRedirect("../register/registersuccess.jsp");
		}else{
			response.sendRedirect("../register/registerfailure.jsp");
		}
		
	}

}
