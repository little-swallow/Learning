package servlet;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;
import userentity.Plan;
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
public class DistributionServlet extends HttpServlet{
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistributionServlet() {
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

    	HttpSession session = request.getSession();
        ArrayList Info = (ArrayList)session.getAttribute("info2");
        Plan plan= (Plan)session.getAttribute("Planinfo");
        ArrayList Info4=new ArrayList();
       
        TeacherDao dao = new TeacherDaoimpl();
        try {
        	dao.addintoclasstable(Info);
            dao.distribution(Info,plan);
            Info4 = dao.selectinfoseparate2();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        session.setAttribute("info6", Info4);
        response.sendRedirect("PageclassServlet");        
    }
}
