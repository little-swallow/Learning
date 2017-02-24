<%@ page import="dbc.DBConn" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="userentity.User" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="Style.css" rel="stylesheet" />
    <link href="../css/font_style.css" rel="stylesheet" />
    <title class="biaoti">上海XX报名系统</title>
	<meta charset="utf-8" />
    <style type="text/css">
         .auto-style5 {
            font-family: 隶书;
            font-size: 40px;
            width: 350px;
        }
       #Select1 {
            width: 100px;
            height: 50px;
        }
        .auto-style1 {
            width: 150px;
            height: 41px;
        }
         #Select1 {
            width: 118px;
            height: 39px;
        }
       
     
    </style>
</head>
<body>
     <div class="header00"style="padding-top:80px" >
              
            </div>
  <div class="content00" >
           
       
        <div style="font-size:14px;line-height: 26px; border-right-style:solid;
border-right-color:black;border-right-width:5px;height:550px; "class="aside00">
            <table style ="padding-left:10px;" class="auto-style5">
       <tr>
           
           
           <td>
               <a href="userform1.jsp">考生信息查询</a>
           </td>

       </tr>
                <tr>
                    <td>
                      .
                    </td>
                </tr>
                <tr>

                    <td>
<a href="../servlet/StateServlet">报名结果查询</a>

                    </td>
                </tr>

            </table>
              </div>

         <div class="article00">
                <table class="tabletitou"style="font-family:'隶书';font-size:35px">
      <thead class="tablethresd">
                    <tr>
                        <td >报名号<td>姓名<td>报道时间 <td>状态<td>班级
                        
                    </tr>
                    <%
                User us = (User)session.getAttribute("userstate");
                     
                   %>
                <tr>
                    <td><%=us.getUserid()%></td>
                    <td><%=us.getname()%></td>
                    <td><%=us.getSignuptime()%></td>
                    <td><%=us.getState()%></td>
					<td><%=us.getClassname()%></td>
                    
                </tr>
</thead>
                   

                    </table>
             <br />
             <br />
             <br />
             <br />
             <br />
			  <% if(us.getState().equals("预录取"))
    {  %><form action="../servlet/EnsureServlet" method="post">
            <div style="font-family:隶书;font-size:50px;color:#e5ce72">
             您的孩子已被录取 是否确认进入本学校：
              
             <select id="Select1" name="ensure">
             <option value="是">是</option>
             <option value="否">否</option>

             </select>
			  <input id="Button4" type="submit" value="提交"style="background-color:#fff0ac;color:#844200;font-size:25px;width:80px;height:40px" />
                <br />
                <br />
              </div>
                <br />
			  <%} %>
			  
				<%if(us.getState().equals("已录取"))
               {  %>
             <div>
               <a href="userform3.jsp"><input id="Button3" type="button" value="请完善需求" class="auto-style1"style="background-color:#fff0ac;color:#844200;font-size:25px" /></a>
                </div>

          <%} %>
          </form>   
         </div>
        </div>
</body>
</html>