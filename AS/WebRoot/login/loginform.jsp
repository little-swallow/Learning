<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>上海XXX初中-登录页面</title>
	<meta charset="utf-8" />
    
    <style type="text/css">
        body{background-repeat:repeat}
        .auto-style1 {
            height: 80px;
        }
        .auto-style2 {
            height: 21px;
        }
        .auto-style3 {
            height: 100px;
            width: 133px;
        }
        .auto-style5 {
            width: 200px;
        }
        .auto-style9 {
            height: 50px;
            width: 350px;
            background-color:#efe1c7;
        }
        .auto-style10 {
            width: 201px;
            color:#f2d39c;
        }
        .auto-style11 {
            width: 133px;
        }
         .header00{
            width:1100px;
            height:100px;
            margin:auto;
            margin-top:30px;

        }
         h1{
       font-family:YouYuan; font-size:80px; 
       color:#42240a;
        }
          .article00{
            width:650px;
            height:600px;
        
            margin-bottom:20px;
            margin-left:700px;
            color:black;
            
        }
          .bottom00{
            bottom:50px;
            left:400px;
           
            position:fixed;
            

          }
          .content00{
             width:1500px;
            height:600px;
            margin:auto;
            margin-bottom:100px;
        }

        .box1 {
            width: 610px;
            height: 500px;
            background-color: #000000;
            margin-left: 100px;
            color: black;
            margin-right: 10px;
            margin-top: 50px;
            float:left;
            padding: 10px;
        }
    



        .picture1{
            margin-top: 10px;
            width:300px;
            float:right;
        }

        .auto-style13 {
            width: 500px;
            float: right;
            height: 600px;
            margin: 10px;
        }

        .auto-style17 {
            height: 550px;
            width: 480px;
            margin-left:2px;
        }
        
    </style>
</head>
<body style="background-image:url(../img/bg.jpg);background-attachment:fixed;background-repeat:repeat">
    <%
    String uid = (String)application.getAttribute("uid");
    if(uid==null){
        String userid="20170001";
        application.setAttribute("uid", userid);
    }
%>
     <div class="header00" >
                <h1 style="text-align:center">上海中学招生报名平台</h1>
            </div>
     <div class="content00" style="height:600px;">
            <div class="auto-style13">
                 <img src="../img/lovely11.png" class="auto-style17">
             </div>
               
             <form action="../servlet/LoginServlet" method="post" onsubmit="return validate(this)">
            <div class="box1">
                <table style="border-style: none; border-color: inherit; border-width: 2px; padding-left:10px; width:600px; height: 500px;background-color:#2c380a">
                    <tr>
                        <td colspan="3" class="auto-style1" ></td>
                    </tr>
                    <tr>
                        <td style="font-size:40px;font-family:YouYuan;color:#f2d39c; width: 169px" class="auto-style11"><strong>报名号</strong></td>
                        <td colspan="2" class="auto-style5"><input name="uid" type="text" class="auto-style9"  /></td>
                    </tr>
                    <tr>
                         <td style="height:15px" colspan="3"></td>
                    </tr>
                    <tr>
                        <td style="font-size:40px;font-family:YouYuan;color:#f2d39c" class="auto-style3"><strong>密   码</strong></td>
                        <td colspan="2" class="auto-style5"><input name="upass" type="password" class="auto-style9" /></td>
                    </tr>
                    <tr>
                        <td style="height:30px" colspan="3"></td>
                    </tr>
                    <tr>
                        
                        <td colspan="2" style="padding-left:230px">
                            <input type="submit" value="登 录" style="font-size:30px;width: 150px; background-color:#f2d39c; height: 50px;"/></td>
                    </tr>
                    <tr>
                        <td colspan="3" class="auto-style2"></td>
                    </tr>
                    <tr>
                        <td class="auto-style11"> </td>
                        <td style="padding-right:30px;font-size:20px;padding-left:10px;color:#f2d39c" class="auto-style10" ><a href="#none">忘记密码</a></td>
                        <td style="padding-right:30px;font-size:20px;padding-left:0.1px;width:200px;color:#f2d39c" ><a href="../register/registerform.jsp">注册用户</a></td>
                    </tr>                   
                </table>
            </div>
            </form>
         &nbsp;</div>
          
        
        <div class="bottom00"style="height:150px;width:1200px;font-size:22px;font-family:隶书;color:#950006;border:none">
            <br />
            
               
                    <strong>&nbsp;&nbsp;&nbsp;&nbsp; 招生计划：</strong>  
                <br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                一：今年计划招750人，分16个班。<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 二：报名时间为2017年9月1号，咨询电话为021-63427864。<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 三：应缴学费大约为1200元。<br />
             <strong> &nbsp;&nbsp;&nbsp;&nbsp; 注意事项：</strong>
               <br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                一：请同学们看清楚报名的要求和条件，并准备好报名相关资料。<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 二：已报名的同学请注意随时关注自己的报名状态。

                
                
            </div>
   
</body>
</html>
