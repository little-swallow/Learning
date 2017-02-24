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
public class ChangeClassServlet extends HttpServlet{
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeClassServlet() {
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
         String selectvalue = request.getParameter("select");
         char[] c = selectvalue.toCharArray();
         int j=0;
         String userid = "";
         String id = "";
         for(int i=0;i<selectvalue.length();i++){
             if(c[i]=='+'){
                 j=++i;
                 break;
             }
             userid+=c[i];
         }
         for(;j<selectvalue.length();j++){
             id+=c[j];
         }
         //String no = request.getParameter(id);
         // String num = "classnum"+no;
         String classnum = request.getParameter(id);
         HttpSession session = request.getSession();
         String classnum2 = "";
         ArrayList Info6 = (ArrayList) session.getAttribute("info6");
         for (int i=0;i<Info6.size();i++) {
             Studentinfo info = (Studentinfo)Info6.get(i);
             if(info.getUserid().equals(userid)){
                 classnum2 = info.getclass_num();
             }
         }
         Studentinfo info = new Studentinfo();
         info.setUserid(userid);
         info.setclass_num(classnum);

         TeacherDao dao = new TeacherDaoimpl();
         ArrayList Info = new ArrayList();
         ArrayList Info2 = new ArrayList();

         try {
             dao.changeclass(info);
             Info = dao.selectclassinfo(classnum); 
             Info2 = dao.selectclassinfo(classnum2);
             dao.changeclassid(Info);
             dao.changeclassid(Info2);
             Info = dao.selectinfoseparate2();
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         session.setAttribute("info6", Info);
         response.sendRedirect("PageclassServlet"); 

    }
}