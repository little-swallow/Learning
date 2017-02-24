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
 * Created by zpc on 2016/12/8.
 */
public class EntertestgradeServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntertestgradeServlet() {
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
        String[] userids = request.getParameterValues("id");
        String[] grades = request.getParameterValues("grade");
        HttpSession session = request.getSession();
        ArrayList Info2 = (ArrayList)session.getAttribute("info");

        Studentinfo info = new Studentinfo();
        info.setuserids(userids);
        info.setgrades(grades);

        TeacherDao dao = new TeacherDaoimpl();
        //ArrayList Info = null;
        ArrayList Info = new ArrayList();
        try {
        	dao.changestate(Info2);
            dao.addgrades(info);
            //Info = dao.selectinfo();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       // HttpSession session = request.getSession();
       // session.setAttribute("info", Info);
        response.sendRedirect("../servlet/GradeServlet");

    }

}
