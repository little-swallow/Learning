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
    <link href="../css/font_style.css" rel="stylesheet" />
    <title>XX报名系统</title>
	<meta charset="utf-8" />
    <style type="text/css">
        #Select1 {
            width: 118px;
            height: 39px;
        }
        .auto-style1 {
            width: 73px;
            height: 41px;
        }
        .auto-style2 {
            width: 118px;
            height: 39px;
        }
        .auto-style3 {
            border-right: 5px solid black;
            padding-bottom: 30px;
            width: 70%;
            height: 60%;
            background-color: #4e280f;
            margin: 20px;
            position:center;
            line-height: 26px;
        }
    </style>
</head>
<body >
  
    <div class="header00" style="padding-top:80px;text-align:center;background-color:transparent">
       
    </div>
    <br />
    <br />
    <div class="content00">
    <div class="auto-style3" style="border-style: none; border-color: inherit; border-width: medium; margin-left:200px; padding-top:10px; text-align:center; font-family:'隶书'; font-size:50px;">
       <p style="font-size:80px"> 需求完善</p>
        <br />
		<form action="../servlet/CompletedemandServlet" method="post">
       是否乘坐校车：<select id="Select1" name="bus">
             <option  value="是">是</option>
             <option  value="否">否</option>

        </select>
        <br />
        <br />
        是否住校：<select id="Select2" class="auto-style2" name="room">
            <option  value="是">是</option>
            <option  value="否">否</option>
        </select>
         
            <br />
        &nbsp;&nbsp;<br />
        <br />

<input id="Button1" type="submit" value="提交" class="auto-style1"style="background-color:#FFF0AC;color:#844200;font-size:25px" />
 </form>
    </div>
        </div>
</body>
</html>
