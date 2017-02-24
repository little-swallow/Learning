<%@ page import="java.util.ArrayList" %>
<%@ page import="userentity.Studentinfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="js/new1.js"></script>
    <script src="js/updatenew.js"></script>
    <link href="css/zhezhao.css" rel="stylesheet" />
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
        #Button7 {
            width: 88px;
            height: 38px;
        }
        #Button8 {
            width: 88px;
            height: 38px;
        }
        .auto-style2 {
            margin-left: 1px;
        }
        #Button9 {
            width: 88px;
            height: 38px;
        }
        #Button10 {
            width: 88px;
            height: 38px;
        }
        .auto-style3 {
            height: 43px;
            width: 75px;
        }
        .auto-style4 {
            height: 21px;
        }
        .auto-style6 {
            width: 135px;
            height: 25px;
        }
        .auto-style7 {
            width: 136px;
            height: 35px;
        }
        .auto-style10 {
            height: 25px;
            width: 136px;
        }
        .auto-style11 {
            height: 23px;
            width: 255px;
        }
        .auto-style12 {
            height: 42px;
            width: 82px;
        }
        .auto-style13 {
            height: 23px;
            width: 252px;
        }
        .auto-style14 {
            width: 136px;
            height: 24px;
        }
        .auto-style15 {
            width: 34px;
            height: 35px;
        }
        .auto-style16 {
            font-family: 隶书;
            font-size: 30px;
            width: 350px;
        }
        .auto-style17 {
            width: 82px;
            height: 43px;
        }
        .auto-style18 {
            width: 135px;
            height: 33px;
        }
        .auto-style19 {
            width: 135px;
            height: 35px;
        }
       .youtablebutton
      {
      width: 600px;
      height: 100px;
      position: absolute;
      color: black;
	  bottom:10px;
     }
    </style>
</head>
<body>
<div class="header00"style="text-align:center;padding-top:50px">
</div>
<div class="content00" style="height:650px;">
    <div class="aside00"style="margin-top:50px">
        <table style ="padding-left:70px;margin-top:30px" class="auto-style16">
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

    <div class="article00" id="div1">
        <h2>最终录取学生</h2>
        <form action="../servlet/DistributionServlet" method="post">
            <table class="tabletitou" >
                <thead class="tablethresd">
                <tr>
                    <td>序号</td>
                    <td><input id="Checkbox1" type="checkbox" />
                     </td>
                    <td>报名号</td>
                    <td>姓名</td>
                    <td>性别</td>
                    <td>身份证号</td>
                    <td>家长联系方式</td>
                    <td>考试成绩</td>
                </tr>
                <c:forEach items="${pageInfo}" var="info">
                <tr>
                   <td>${info.no}</td>
                   <td><input type="checkbox" name="select" value="${info.userid}" /></td>
			       <td>${info.userid}</td>
                   <td>${info.name}</td>
                   <td>${info.sex}</td>
                   <td>${info.num}</td>
                   <td>${info.telephone}</td>
                   <td>${info.grade}</td>
            </tr>
            </c:forEach>                             
                </thead>
            </table>
                <table class="youtablebutton"  >
                    <tr>
                        <td>
                        <c:if test="${currentPageIndex!=1}">
                         <a href="../servlet/FinallstuServlet?pageIndex=${currentPageIndex-1}">
                            <input id="Button1" type="button" value="上一页" /></a></c:if></td>
                        <td>
                        <c:if test="${currentPageIndex!=pageCount}">
                        <a href="../servlet/FinallstuServlet?pageIndex=${currentPageIndex+1}">
                            <input id="Button2" type="button" value="下一页" /></a></c:if></td>
                        <td>
                            <input id="Button9" type="submit" value="分班" /></td>
                        <td>
                            <a href="Stu_info_query.jsp"><input id="Button10" type="button" value="查询" /></a></td>
                    </tr>
                </table>
        </form>
    </div>
</div>
</body>
</html>