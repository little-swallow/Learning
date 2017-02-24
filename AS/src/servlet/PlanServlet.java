package servlet;

import teacherdao.TeacherDao;
import teacherdao.TeacherDaoimpl;
import userentity.Plan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Created by zpc on 2016/12/5.
 */
 public class PlanServlet extends HttpServlet {
        /**
         * @see HttpServlet#HttpServlet()
         */
        public PlanServlet() {
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
            String number = request.getParameter("num");
            String sign_up_time = request.getParameter("sign_up_time");
            String ask_time = request.getParameter("ask_time");
            String telephone = request.getParameter("tele");
            String fee = request.getParameter("fee");
            String class_number = request.getParameter("cnum");
            String year = request.getParameter("year");

            Plan plan = new Plan();
            plan.setnumber(number);
            plan.setsign_up_time(sign_up_time);
            plan.setask_time(ask_time);
            plan.settelephone(telephone);
            plan.setfee(fee);
            plan.setclassnumber(class_number);
            plan.setYear(year);
   			
            TeacherDao dao = new TeacherDaoimpl();
            try {
                dao.addplan(plan);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            HttpSession session = request.getSession();
            session.setAttribute("Planinfo", plan);
            response.sendRedirect("../teacher/Plan.jsp");
        }

}
