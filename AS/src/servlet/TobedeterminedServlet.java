package servlet;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;

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
public class TobedeterminedServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TobedeterminedServlet() {
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

        TeacherDao dao = new TeacherDaoimpl();
        ArrayList Info = null;
        try {
            Info = dao.selectinfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("info2", Info);
        response.sendRedirect("../teacher/To_be_determined_stu.jsp");

    }
}
