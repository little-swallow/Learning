<%@ page import="userentity.Studentinfo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/font_style.css" rel="stylesheet" />
    <title>上海XX报名系统</title>
    <meta charset="utf-8" />
    <style type="text/css">
        .zhengwen{
     
           font-family:隶书;
           font-size:30px;
        }
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
        .auto-style1 {
            width: 173px;
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
        #Button3 {
            width: 88px;
            height: 38px;
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
<div class="header00"style="text-align:center;padding-top:50px;">
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
        <h2>已报名学生列表</h2>
        <table class="tabletitou">
            <thead class="tablethresd">
            <tr>
                <td>序号</td>
                <td>报名号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>身份证号</td>
                <td>家长联系方式</td>
            </tr>
          <c:forEach items="${pageInfo}" var="info">
            <tr>
                <td>${info.no}</td>
			    <td>${info.userid}</td>
                <td>${info.name}</td>
                <td>${info.sex}</td>
                <td>${info.num}</td>
                <td>${info.telephone}</td>
            </tr>
            </c:forEach>
            </thead>
        </table>
        <table class="youtablebutton">
            <tr>
                <td>
                <c:if test="${currentPageIndex!=1}">
                <a href="../servlet/EnrollstudentServlet?pageIndex=${currentPageIndex-1}">
                    <input id="Button1" type="button" value="上一页" /></a></c:if></td>
                <td>
                <c:if test="${currentPageIndex!=pageCount}">
                <a href="../servlet/EnrollstudentServlet?pageIndex=${currentPageIndex+1}">
                    <input id="Button2" type="button" value="下一页" /></a></c:if></td>
                <td>
                    <a href="Stu_info_query.jsp"> <input id="Button3" type="button" value="查询" /></a></td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>