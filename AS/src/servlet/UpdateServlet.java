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

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
        request.setCharacterEncoding("utf-8");
    /*    String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String num = request.getParameter("num");
        String telephone = request.getParameter("tele");
        String father_job = request.getParameter("fjob");
        String mother_job = request.getParameter("mjob");
        String grd_school = request.getParameter("grds");
        String grd_grade = request.getParameter("grdg");
        HttpSession session = request.getSession();
        String uid = (String) session.getAttribute("uid");
        

        User user = new User();
        user.setname(name);
        user.setsex(sex);
        user.setnum(num);
        user.settelephone(telephone);
        user.setfatherjob(father_job);
        user.setmotherjob(mother_job);
        user.setgrdschool(grd_school);
        user.setgrdgrade(grd_grade);
        user.setUserid(uid);*/
        
        HttpSession session = request.getSession();
        User userinfo =(User)session.getAttribute("Userinfo");
        userinfo.setname(request.getParameter("name"));
        userinfo.setsex(request.getParameter("sex"));
        userinfo.setnum(request.getParameter("num"));
        userinfo.settelephone(request.getParameter("tele"));
        userinfo.setAddress(request.getParameter("address"));
		userinfo.setfatherjob(request.getParameter("fjob"));
		userinfo.setmotherjob(request.getParameter("mjob"));
		userinfo.setgrdschool(request.getParameter("grds"));
		userinfo.setgrdgrade(request.getParameter("grdg"));
		userinfo.setUpass(request.getParameter("password"));
		session.setAttribute("Userinfo", userinfo);
		
        UserDao dao = new UserDaoimpl();
        boolean flag = false;
        try {
            flag = dao.updatebyid(userinfo);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (flag) {
            response.sendRedirect("../userform/userform1.jsp");
        } else {
            response.sendRedirect("../login/loginfailure.jsp");
        }

    }
}
