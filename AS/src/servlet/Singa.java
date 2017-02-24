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
import java.util.ArrayList;

/**
 * Created by zpc on 2016/12/9.
 */
public class Singa {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Singa() {
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
        String uid = request.getParameter("id");
        String name = request.getParameter("name");
        Studentinfo info = new Studentinfo();
        info.setUserid(uid);
        info.setname(name);

        TeacherDao dao = new TeacherDaoimpl();
        try {
            info = dao.selectsingleinfo(info);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("singalinfo", info);
        response.sendRedirect("../teacher/Stu_info_query.jsp");

    }
}
