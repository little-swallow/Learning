<%@ page import="java.util.ArrayList" %>
<%@ page import="userentity.Studentinfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="../js/new1.js"></script>
    <script src="../js/updatenew.js"></script>
    <link href="../css/font_style.css" rel="stylesheet" />
    <link href="../css/zhezhao.css" rel="stylesheet" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>上海中学报名系统</title>
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
        .auto-style2 {
            width: 129px;
            height: 24px;
        }
        .auto-style3 {
            width: 85px;
            height: 36px;
        }
        .auto-style4 {
            width: 136px;
            height: 23px;
        }
        .auto-style7 {
            width: 135px;
            height: 23px;
        }
        .auto-style8 {
            width: 128px;
            height: 24px;
        }
        .auto-style9 {
            width: 271px;
            height: 28px;
        }
        .auto-style10 {
            width: 95px;
            height: 39px;
        }
        .auto-style11 {
            width: 280px;
            height: 28px;
        }
        .auto-style12 {
            width: 280px;
        }
        .auto-style13 {
            width: 271px;
        }
        .auto-style14 {
            width: 136px;
            height: 22px;
        }
        .auto-style15 {
            width: 84px;
            height: 36px;
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
        <h2>学生分班信息</h2>
        <form action="../servlet/ChangeClassServlet" method="post">
            <table class="tabletitou">
                <thead class="tablethresd" >
                <tr>
                    <td>序号</td>
                    <td>
                        <input id="Checkbox1" type="checkbox" /></td>
                    <td>班级</td>
                    <td>学号</td>
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
                   <td><input type="checkbox" name="select" value="${info.userid}+${info.no}" /></td>
                   <td><input name="${info.no}" type="text" value="${info.class_num}" style="width: 28px; "/></td>
                   <td>${info.class_id}</td>
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

                <table class="youtablebutton">
                    <tr>
                        <td>
                        <c:if test="${currentPageIndex!=1}">
                        <a href="../servlet/PageclassServlet?pageIndex=${currentPageIndex-1}">
                            <input id="Button1" type="button" value="上一页" /></a></c:if></td>
                        <td>
                        <c:if test="${currentPageIndex!=pageCount}">
                        <a href="../servlet/PageclassServlet?pageIndex=${currentPageIndex+1}">
                            <input id="Button2" type="button" value="下一页" /></a></c:if></td>
                        <td>
                            <input id="Button7" type="button" value="增加" onclick="showdiv()"/></td>
                        <td>
                            <input id="Button9" type="submit" value="修改"  /></td>
                        <td>
                            <a href="Stu_info_query.jsp"><input id="Button10" type="button" value="查询" /></a></td>
                    </tr>
                </table>

        </form>
    </div>
</div>

<div id="bg"></div>
<div id="show" >
    <div >
        <h2>增加学生</h2>
    </div>
    <div class="divyouabuttondiv1" >
        <form action="../servlet/BackdoorServlet" method="post">
            <table class="youtablebutton" style="font-size:40px">
                <tr>
                    <td class="auto-style9">报名号</td>
                    <td>
                        <input name="userid" id="Text1" type="text" class="textbox"/></td>
                </tr>
                <tr>
                    <td class="auto-style13">班级</td>
                    <td>
                        <input name="classnum" id="Text52" type="text" class="auto-style14"/></td>
                </tr>
                <tr><td class="auto-style9">姓名</td>
                    <td>
                        <input name="name" id="Text2" type="text" class="auto-style8"/></td>
                </tr>
                <tr><td class="auto-style9">性别</td>
                    <td>
                        <input name="sex" id="Text3" type="text" class="auto-style7"/></td>
                </tr>
                <tr><td class="auto-style9">身份证号</td>
                    <td>
                        <input name="num" id="Text4" type="text"class="auto-style14"/></td>
                </tr>
                <tr><td class="auto-style9">入学年份</td>
                    <td>
                        <input name="year" id="Text4" type="text"class="auto-style14"/></td>
                </tr>
                <tr><td class="auto-style9">家长联系方式</td>
                    <td>
                        <input name="tele"  id="Text6" type="text" class="auto-style4"/></td>
                </tr>
                <tr>
                    <td>
                        <input id="Button20" type="submit" value="提交" class="auto-style3"/></td>
                    <td>
                        <input id="Button38" class="auto-style15" onclick="hidediv()" type="button" value="关闭"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
<script src="add.js"></script>
<script src="update.js"></script>
</html>