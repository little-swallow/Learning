package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;
import userentity.Studentinfo;

public class RoomServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RoomServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*		   ArrayList Info6 = new ArrayList();
	       TeacherDao dao = new TeacherDaoimpl();
	      try {
	    	  Info6 = dao.selectroominfo();
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    HttpSession session = request.getSession();
	    session.setAttribute("info5", Info6);*/
		    ArrayList Info = new ArrayList();		    
		    TeacherDao dao = new TeacherDaoimpl();
		    HttpSession session = request.getSession();
		    int countPerPage=15;
	        String pageIndex = request.getParameter("pageIndex");
	        if(pageIndex==null){
	        	pageIndex ="1";
	        }
	        try {
				Info = dao.selectroominfo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//	        session.setAttribute("info5", Info);
	        	int pageCount;
	        	if(Info.size()%countPerPage==0){
	        		pageCount =Info.size()/countPerPage;
	        	}else{
	        		pageCount = Info.size()/countPerPage+1;
	        	}	        
	        int currentPageIndex = Integer.parseInt(pageIndex);
	        ArrayList pageInfo = new ArrayList();
	        for(int i = 0;i<Info.size();i++){
	        	if(i>=(currentPageIndex-1)*countPerPage&&i<(currentPageIndex)*countPerPage){
	        		Studentinfo pinfo=(Studentinfo)Info.get(i);
	        		pinfo.setNo(i+1);
	        		pageInfo.add(pinfo);
	        	}
	        }
	        session.setAttribute("pageInfo",pageInfo);
	        session.setAttribute("currentPageIndex", currentPageIndex);
	    response.sendRedirect("../teacher/Stu_inschool_info.jsp");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
