package servlet;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;
import userentity.Studentinfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zpc on 2016/12/5.
 */
public class EnrolledUpdateServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrolledUpdateServlet() {
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
        String no = request.getParameter("no");
        String userid = request.getParameter("id");

        Studentinfo info = new Studentinfo();
   
        info.setUserid(userid);

        TeacherDao dao = new TeacherDaoimpl();
        Studentinfo info2 = null;
        try {
            info2 = dao.selectsingleinfo(info);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("info2", info2);
        response.sendRedirect("teacher/Enrolled_stu_list.jsp");
    }

}
