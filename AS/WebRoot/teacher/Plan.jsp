<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="userentity.Plan" %>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/font_style.css" rel="stylesheet" />
    <title>上海XX报名系统</title>
    <meta charset="utf-8" />
    <style type="text/css">
    h2{
    font-family:隶书; font-size:50px; 
    color:black;
    background-color:chocolate;
    text-align:center
}
        #Text1 {
            height: 22px;
            width: 136px;
        }
        #Select1 {
            width: 81px;
        }
        #Text2 {
            width: 136px;
            height: 25px;
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
        #Text6 {
            width: 140px;
            height: 33px;
        }
        #Text7 {
            width: 140px;
            height: 33px;
        }
        #Text8 {
            width: 140px;
            height: 33px;
        }
        #Text9 {
            width: 140px;
            height: 33px;
        }
        #Text10 {
            width: 140px;
            height: 33px;
        }
        .auto-style4 {
            height: 66px;
        }
        .auto-style5 {
            height: 46px;
        }
        .zhengwen{
    
    font-family:隶书;
    font-size:30px;
}
    </style>
</head>
<body>
<div class="header00"style="text-align:center;padding-top:60px;" >
</div>
<div class="content00" style="height:650px;">
    <div class="aside00"style="margin-top:40px">
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
    <div class="article00"style="margin-top:2px">
        <h2>招生计划</h2>
        <form action="../servlet/PlanServlet" method="post">
            <table class="divdabiaoti " style="font-family:隶书; font-size:30px;">
                <%
                    Plan plan =(Plan)session.getAttribute("Planinfo");
                %>
                <tr>
                    <td class="auto-style4" >
                        招生年份：
                    </td>
                    <td class="auto-style4">
                        <input id="Text9" type="text"class="textbox" name="year" value="<%=plan.getYear()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4" >
                        招生人数：
                    </td>
                    <td class="auto-style4">
                        <input id="Text9" type="text"class="textbox" name="num" value="<%=plan.getnumber()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4" >
                        招生班数：
                    </td>
                    <td class="auto-style4">
                        <input id="Text10" type="text"class="textbox" name="cnum" value="<%=plan.getclassnumber()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4" >
                        报名时间：
                    </td>
                    <td class="auto-style4">
                        <input id="Text8" type="text"class="textbox" name="sign_up_time" value="<%=plan.getsign_up_time()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">
                        咨询时间：
                    </td>
                    <td class="auto-style4">
                        <input id="Text7" type="text"class="textbox" name="ask_time" value="<%=plan.getask_time()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4"  >
                        咨询电话：
                    </td>
                    <td class="auto-style4">
                        <input id="Text6" type="text"class="textbox" name="tele" value="<%=plan.gettelephone()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4" >
                        需缴费用：
                    </td>
                    <td class="auto-style4">
                        <input id="Text5" type="text"class="textbox" name="fee" value="<%=plan.getfee()%>" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style5" >
                        <input id="Button1" type="submit" value="提交" style="background-color:#FFF0AC;color:#844200;font-size:25px" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>