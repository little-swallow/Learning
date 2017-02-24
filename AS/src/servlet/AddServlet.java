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
public class AddServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
        String[] state = request.getParameterValues("select");

        Studentinfo info = new Studentinfo();
        info.setuserids(state);

        TeacherDao dao = new TeacherDaoimpl();
      /*  ArrayList Info = null;
        ArrayList Info2 = null;//预录取
        ArrayList Info3 = null;//待定
        ArrayList Info4 = null;//装Info2和Info3
        */
        ArrayList Info =new ArrayList();
        ArrayList Info2 =new ArrayList();
        ArrayList Info3 =new ArrayList();
        ArrayList Info4 =new ArrayList();
        Info4.add(Info2);
        Info4.add(Info3);
        try {
            dao.changegrades(info);
            Info = dao.selectinfoReverseorder();
            Info4 = dao.selectinfoseparate(Info4);
            dao.setstate1((ArrayList)Info4.get(0));
            dao.setstate2((ArrayList)Info4.get(1));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("info", Info);
        session.setAttribute("info2", Info4.get(0));
        session.setAttribute("info3", Info4.get(1));
        response.sendRedirect("PageperstuServlet");

    }
}
