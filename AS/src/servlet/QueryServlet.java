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
 * Created by zpc on 2016/12/5.
 */
public class QueryServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
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
        Plan plan = new Plan();
        plan.setask_time("");
        plan.setclassnumber("");
        plan.setfee("");
        plan.setnumber("");
        plan.setsign_up_time("");
        plan.settelephone("");
        plan.setYear("");
       /*ArrayList Info = null;//全部信息
        ArrayList Info2 = null;//预录取
        ArrayList Info3 = null;//待定
        ArrayList Info4 = null;//装Info2和Info3*/
        ArrayList Info = new ArrayList();
        ArrayList Info2 = new ArrayList();
        ArrayList Info3= new ArrayList();
        ArrayList Info4 = new ArrayList();
        Info4.add(Info2);
        Info4.add(Info3);
       
        ArrayList Info7 = new ArrayList();
        
        try {
        	plan = dao.selectplaninfo();
            Info = dao.selectinfo();
            Info4 = dao.selectinfoseparate(Info4);
            Info7 = dao.selectinfoseparate2();
        
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        session.setAttribute("info", Info);
        session.setAttribute("info2", Info4.get(0));
        session.setAttribute("info3", Info4.get(1));
        session.setAttribute("info6", Info7);
        session.setAttribute("Planinfo", plan);       
        response.sendRedirect("../teacher/Plan.jsp");

    }

}
