<%@ page import="java.util.ArrayList" %>
<%@ page import="userentity.Studentinfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>   
    <link href="../css/font_style.css" rel="stylesheet" />
    <script src="js/new1.js"></script>
    <title>上海XX报名系统</title>
	<meta charset="utf-8" />
    <style type="text/css">
	    h2{
           font-family:隶书; font-size:50px; 
           color:black;
           background-color:chocolate;
           text-align:center
        }
	    .zhengwen{
     
           font-family:隶书;
           font-size:30px;
        }
        #Text1 {
            height: 30px;
            width: 150px;
        }
        #Select1 {
            width: 81px;
        }
        #Text2 {
            height: 30px;
            width: 150px;
        }
        #Button1 {
            width: 88px;
            height: 38px;
        }
        #Button2 {
            width: 88px;
            height: 38px;
        }
        #Text5 {
            width: 140px;
            height: 33px;
        }
        .auto-style2 {
            width: 81px;
            height: 35px;
        }
        .auto-style3 {
            width: 219px;
            height: 68px;
        }
        .auto-style4 {
            height: 68px;
        }
        .auto-style5 {
            width: 219px;
            height: 69px;
        }
        .auto-style6 {
            height: 69px;
        }
        .auto-style7 {
            width: 90px;
            height: 43px;
        }
        .auto-style8 {
            width: 80px;
        }
    </style>
</head>
<body> 
    <div class="header00"style="text-align:center;padding-top:50px">
        
        </div>
    <div class="content00" style="height:650px;">
            
        <div class="aside00"style="margin-top:50px">
            <table style ="padding-left:70px;width:350px;margin-top:30px" class="zhengwen">
       <tr>
                <td>
                    <a href="Plan.jsp">招生计划</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/EnrollstudentServlet">已报名学生列表</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/GradeServlet">录取考试成绩</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/PageperstuServlet">预录取学生</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/PagedeterstuServlet">待定学生</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/FinallstuServlet">最终录取学生</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/PageclassServlet">学生分班信息</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="Stu_info_query.jsp">学生信息查询</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/BusServlet">乘坐校车学生</a>
                </td>
            </tr>
            <tr>
                <td>
                    .
                </td>
            </tr>
            <tr>
                <td>
                    <a href="../servlet/RoomServlet">住校学生</a>
                </td>
            </tr>

            </table>
              </div>
      
         <div class="article00">
               <h2>学生信息查询</h2>
			<form action="../servlet/SingalinformationqueryServlet" method="post">
             <table class="tabletitou" style="font-family:隶书;font-size:30px;border:none" >
                     <tr style="width：80px;">
                          <td class="auto-style3">
                              学生姓名：
                          </td>
                          <td class="auto-style4">
                              <input id="Text1" type="text" name="name"/>
                          </td>
                      </tr>  
                      

                    <tr style="width：80px;">
                          <td class="auto-style5">
                             报名号或学号：
                          </td>
                          <td class="auto-style6">
                              <input id="Text2" type="text" name="id"/>
                          </td>
                      </tr> 
                 
                  <tr style="width：80px;">
                          <td class="auto-style3">
                            
                          </td>

                          <td class="auto-style4">
                              <input id="Button7" type="submit" value="查询" class="auto-style2" />
                          </td>
                      </tr> 
         
                 </table>

             <div class="article00" >
             <% 						
                   if(session.getAttribute("singalinfo")!=null)
                   { Studentinfo info = (Studentinfo) session.getAttribute("singalinfo");
                %>               

                 <table style="align-content:center;border:none">
        <tr>
            <td>报名号：</td>
            <td><input  type="text" value="<%=info.getUserid()%>"/></td>
            <td class="auto-style8">&nbsp;</td>
            <td>学号：</td>
            <td><input  type="text"  value="<%=info.getclass_id()%>"/></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input  type="text" value="<%=info.getname()%>"/></td>
            <td class="auto-style8">&nbsp;</td>
            <td>性别：</td>
            <td><input  type="text" value="<%=info.getsex()%>"/></td>
        </tr>
        <tr>
            <td>身份证号：</td>
            <td><input  type="text" value="<%=info.getnum()%>"/></td>
            <td class="auto-style8">&nbsp;</td>
            <td>家长联系方式：</td>
            <td><input  type="text" value="<%=info.gettelephone()%>"/></td>
        </tr>
        <tr>
            <td>家庭住址：</td>
            <td><input  type="text" value="<%=info.getlocation()%>"/></td>
            <td class="auto-style8">&nbsp;</td>
            <td>毕业学校：</td>
            <td><input  type="text" value="<%=info.getGschool()%>"/></td>
        </tr>
         <tr>
            <td>毕业成绩：</td>
            <td><input  type="text" value="<%=info.getGgrade()%>"/></td>
             <td class="auto-style8">&nbsp;</td>
            <td>考试成绩：</td>
            <td><input  type="text" value="<%=info.getgrade()%>"/></td>
        </tr>
         <tr>
            <td>父亲职业：</td>
            <td><input  type="text" value="<%=info.getFatherjob()%>"/></td>
             <td class="auto-style8">&nbsp;</td>
            <td>母亲职业：</td>
            <td><input  type="text" value="<%=info.getMotherjob()%>"/></td>
        </tr>
         <tr>
            <td>班级：</td>
            <td><input  type="text" value="<%=info.getClassroom()%>"/></td>
             <td class="auto-style8">&nbsp;</td>
            <td>学生状态：</td>
            <td><input  type="text" value="<%=info.getStateid() %>"/></td>
        </tr>
         <tr>
            <td>校车：</td>
            <td><input  type="text" value="<%=info.getcar()%>"/></td>
             <td class="auto-style8">&nbsp;</td>
            <td>住宿：</td>
            <td><input  type="text" value="<%=info.getroom()%>"/></td>
            </tr>
          </table>
           <%} %>
        </div> 
        </form>
    </div>  
    </div>    
</body>
</html>