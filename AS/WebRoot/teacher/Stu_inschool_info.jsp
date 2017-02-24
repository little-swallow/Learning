<%@ page import="java.util.ArrayList" %>
<%@ page import="userentity.Studentinfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <link href="../css/font_style.css"rel="stylesheet" />
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
   <title>上海XX报名系统</title>
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

.main {
    width:100%;
    height:520px;
}

.biaoti{
    text-align:center;
    font-family:'Adobe Arabic';
    font-size:50px;  
}

        #Button1 {
            width: 88px;
            height: 38px;
        }
        #Button2 {
            width: 88px;
            height: 38px;
        }
        #Button7 {
            width: 88px;
            height: 38px;
        }
        #Button8 {
            width: 88px;
            height: 38px;
        }
        #Button9 {
            width: 88px;
            height: 38px;
        }
        #Button10 {
            width: 88px;
            height: 38px;
        }
		#Text1 {
            height: 22px;
            width: 136px;
        }
        #Select1 {
            width: 26px;
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
        #Button9 {
            width: 88px;
            height: 38px;
        }
        #Button10 {
            width: 88px;
            height: 38px;
        }
        .auto-style3 {
            height: 41px;
            width: 101px;
        }
        .auto-style6 {
            height: 25px;
            width: 141px;
        }
        .auto-style9 {
            height: 31px;
            width: 365px;
        }
        .auto-style10 {
            height: 32px;
        }
        .auto-style11 {
            width: 93px;
            height: 38px;
        }
        .auto-style14 {
            width: 365px;
        }
        .auto-style15 {
            width: 101px;
            height: 42px;
        }
        .auto-style16 {
            height: 28px;
            width: 141px;
        }
        .auto-style17 {
            height: 26px;
            width: 141px;
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
    <div class="header00"style="margin-top:50px">       
        </div>
    <div class="content00" style="height:650px;">      
        <div class="aside00"style="margin-top:50px">
            <table class="zhengwen" style="padding-left:70px;width:350px;margin-top:30px">
            <tr>
                <td><a href="Plan.jsp">招生计划</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/EnrollstudentServlet">已报名学生列表</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/GradeServlet">录取考试成绩</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/PageperstuServlet">预录取学生</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/PagedeterstuServlet">待定学生</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/FinallstuServlet">最终录取学生</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/PageclassServlet">学生分班信息</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="Stu_info_query.jsp">学生信息查询</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/BusServlet">乘坐校车学生</a> </td>
            </tr>
            <tr>
                <td>. </td>
            </tr>
            <tr>
                <td><a href="../servlet/RoomServlet">住校学生</a> </td>
            </tr>
            </table>
        </div>      
        <div class="article00">
           <h2> 住校学生信息</h2>
               
            <table class="tabletitou ">
                <thead class="tablethresd">
                <tr>
                    <td>序号</td>
                    <td>报名号</td>
                    <td>学号</td>
                    <td>姓名</td>
                    <td>性别</td>
                    <td>身份证号</td>
                    <td>家长联系方式</td>
                    <td>家庭住址</td>
                </tr>
				<c:forEach items="${pageInfo}" var="info">
            <tr>
                <td>${info.no}</td>
                <td>${info.userid}</td>
                <td>${info.class_id}</td>			   
                <td>${info.name}</td>
                <td>${info.sex}</td>
                <td>${info.num}</td>
                <td>${info.telephone}</td>
                <td>${info.location}</td>
            </tr>
            </c:forEach>
                </thead>
            </table>

            <table class="youtablebutton">
                <tr>
                    <td>
                    <c:if test="${currentPageIndex!=1}">
                        <a href="../servlet/RoomServlet?pageIndex=${currentPageIndex-1}">
                        <input id="Button1" type="button" value="上一页" />
                        </a></c:if></td>
                    <td>
                    <c:if test="${currentPageIndex!=pageCount}">
                     <a href="../servlet/RoomServlet?pageIndex=${currentPageIndex+1}">
                        <input id="Button2" type="button" value="下一页" />
                        </a></c:if></td>
                   
                    <td>
                    <a href="Stu_info_query.jsp"><input id="Button10" type="button" value="查询" /></a> </td>
                </tr>
            </table>
   
        </div>        
    </div>
</body>
</html>
