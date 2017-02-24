package servlet;

import userdao.UserDao;
import userdao.UserDaoimpl;
import userentity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("upass");
		User login = new User();
		login.setUserid(uid);
		login.setUpass(pwd);
		
		UserDao user = new UserDaoimpl();
		boolean flag = false;
		try {
			flag = user.logincheck(login);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag){
			User userinfo= new User();
			try {
				userinfo=user.selectuserinfo(login);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.setAttribute("Userinfo", userinfo);
			session.setAttribute("Userid",login.getUserid());
			response.sendRedirect("../userform/userform1.jsp");
		}else{
			response.sendRedirect("../login/loginfailure.jsp");
		}
		
		
	}

}
