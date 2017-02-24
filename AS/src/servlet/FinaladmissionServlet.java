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
public class FinaladmissionServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinaladmissionServlet() {
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
        //ArrayList Info = null;
        HttpSession session = request.getSession();
        ArrayList Info = (ArrayList)session.getAttribute("info2");
        ArrayList Info2 = (ArrayList)session.getAttribute("info3");
        
        //ArrayList Info = new ArrayList();
        try {
          
        	dao.setstate3(Info);
        	dao.setstate4(Info2);
            dao.addvalue(Info);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       // session.setAttribute("info", Info);
        response.sendRedirect("../teacher/Final_admission_stu.jsp");

    }
}
