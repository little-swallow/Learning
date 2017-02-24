<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../css/font_style.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <style type="text/css">
       
        .content00{
    margin: 40px auto;
    width: 600px;
    height: 400px;
    padding: 10px;
    position:center;        
    background:#f5d791;
    
    

}
    </style>
</head>
<body>
<% String str = (String)application.getAttribute("uid");
   int sno = Integer.parseInt(str)-1;%>
<div class="header00" style="padding-top:80px;text-align:center;background-color:transparent">      
    </div>   
    <div class="content00">      
       <p style="font-size:60px;color:#db4e11;font-family:Calibri; text-align:center;"> &nbsp;&nbsp;&nbsp; 您的报名号为： &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;</p>
       <p style="font-size:60px;color:#db4e11;font-family:Calibri; text-align:center;"><%= sno %></p>
       <p style="font-size:30px;color:#000000;font-family:Calibri;text-align:center;"><a href="../login/loginform.jsp"> 请返回登录界面</a> </p>    
    </div>

</body>
</html>