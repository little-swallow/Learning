 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/font_style.css" rel="stylesheet" />
    <title>上海中学报名界面</title>
	<meta charset="utf-8" />
    <style type="text/css">
        #name {
            height: 30px;
            width: 200px;
        }
        #sex {
            height: 30px;
            width: 200px;
        }
        #identity {
            height: 30px;
            width: 200px;
        }
        #psaaword {
            height: 30px;
            width: 200px;
        }
         #adress {
            height: 30px;
            width: 200px;
        }
        #phone {
            height: 30px;
            width: 200px;
        }
        #father {
            height: 30px;
            width: 200px;
        }
        #mother {
            height: 30px;
            width: 200px;
        }
        #Text6 {
            height: 30px;
            width: 200px;
        }
        #grade {
            height: 30px;
            width: 200px;
        }
        #Button1 {
            height: 50px;
            width: 100px;
            font-size: x-large;
        }
        #Button2 {
            height: 39px;
            width: 68px;
        }
        .auto-style1 {
            width: 70px;
            height: 24px;
        }
        .auto-style2 {
            border-right: 5px solid black;
            padding-bottom: 30px;
            width: 598px;
            height: 1000px;
            background-color: #4e280f;
            margin: 20px;
            position:center;
            left:2%;
            line-height: 26px;
        }
    </style>
</head>
<body >
    <div class="header00" style="text-align:center;margin-bottom:100px">       
    </div>
	 <form action="../servlet/RegisterServlet"  method="post">
<div class="auto-style2" style=" border-color: inherit; border-width: medium; margin-left:700px; background-color:transparent; color:black; font-family:'隶书'; font-size:40px;" >
    姓&nbsp;&nbsp;&nbsp;名：<input name="name" id="name" type="text" /><br />
    <br />

    性&nbsp;&nbsp;&nbsp;别：<select id="sex" name="sex">
        <option value="男">男</option>
		<option value="女">女</option>

    </select>

    <br />
    <br />
    
    身份证号：<input name="num" id="identity" type="text" /><br />
    <br />
   
    登录密码：<input name="pass" id="psaaword" type="text" /><br />
    <br />

    联系方式：<input name="tele" id="phone" type="text"  /><br />
   <br />

    家庭住址：<input name="address" id="adress" type="text"  /><br />
   <br />

    父亲职业：<input name="fjob" id="father" type="text"  /><br />
    <br />

    母亲职业：<input name="mjob" id="mother" type="text" /><br />
    <br />

    毕业学校：<input name="grds" id="Text6" type="text" /><br />
    <br />

    毕业成绩：<input name="grdg" id="grade" type="text" /><br />
      

      <br />
    
      
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="Button1" type="submit" value="报名" style="background-color:#844200;color:#FFF0AC"/></div>
</form>
    
  
    
       

</body>
</html>
