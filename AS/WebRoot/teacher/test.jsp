<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>上海XXX初中-登录页面</title>
	<meta charset="utf-8" />
    <link href="../css/font_style.css"" rel="stylesheet" />
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
            margin-left: 400px;
            color: black;
            margin-right: 10px;
            margin-top: 250px;
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
<body style="background-image:url(../img/blackboard3.jpg);background-attachment:fixed;background-repeat:repeat">
     
     <div class="content00" style="height:600px;">
            
               
             <form action="../servlet/QueryServlet" method="post" >
            <div class="box1">
                <table style="border-style: none; border-color: inherit; border-width: 2px; padding-left:10px; width:600px; height: 500px;background-color:#2c380a">
                    <tr>
                        <td colspan="3" class="auto-style1" ></td>
                    </tr>
                    <tr>
                        <td style="font-size:40px;font-family:YouYuan;color:#f2d39c; width: 169px" class="auto-style11"><strong>用户名</strong></td>
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
                   
                </table>
            </div>
            </form>
         &nbsp;</div>
          
        
       
   
</body>
</html>
