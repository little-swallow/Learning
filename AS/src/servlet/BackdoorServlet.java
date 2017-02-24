package servlet;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;
import userentity.Studentinfo;
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
import java.util.ArrayList;

/**
 * Created by zpc on 2016/12/9.
 */
public class BackdoorServlet extends HttpServlet{
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BackdoorServlet() {
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
        String userid = request.getParameter("userid");
        String class_number = request.getParameter("classnum");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String num = request.getParameter("num");
        String telephone = request.getParameter("tele");
        String year=request.getParameter("year");

        Studentinfo info = new Studentinfo();
        info.setUserid(userid);
        info.setsex(sex);
        info.setnum(num);
        info.setname(name);
        info.setclass_num(class_number);
        info.settelephone(telephone);
        info.setYear(year);

        TeacherDao dao = new TeacherDaoimpl();
        ArrayList Info = new ArrayList();
        try {
            dao.addbyrelationship(info);
            dao.addclassbyrelationship(info);
            Info = dao.selectclassinfo(class_number); 
            dao.changeclassid(Info);
            Info = dao.selectinfoseparate2();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("info6", Info);
        response.sendRedirect("PageclassServlet"); 

    }
}
