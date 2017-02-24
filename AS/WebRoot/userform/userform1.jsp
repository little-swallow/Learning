<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="userentity.User" %>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/font_style.css" rel="stylesheet" />
    <title>上海XX报名系统</title>
	<meta charset="utf-8" />
    <style type="text/css">
        #Text1 {
            width: 140px;
            height: 30px;
        }
        #Select1 {
            width: 81px;
        }
        #Text2 {
            width: 140px;
            height: 30px;
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
         #Adress {
            width: 140px;
            height: 30px;
        }
        .auto-style3 {
            height: 22px;
        }
        .auto-style5 {
            font-family: 隶书;
            font-size: 40px;
            width: 350px;
        }
        #Text8 {
            width: 140px;
            height: 30px;
        }
        #Text9 {
            width: 140px;
            height: 30px;
        }
        #Text10 {
            width: 140px;
            height: 30px;
        }
        #Text11 {
            width: 140px;
            height: 30px;
        }
        #Text12 {
            width: 140px;
            height: 30px;
        }
        #Text13 {
            width: 140px;
            height: 30px;
        }
        .auto-style17 {
            width: 205px;
        }
        </style>
</head>
<body>
     <div class="header00"style="text-align:center;padding-top:80px;" >
              
            </div>
    <div class="content00" >
           
       
        <div style="font-size:14px;line-height: 26px; border-right-style:solid;
border-right-color:black;border-right-width:5px;height:550px; "class="aside00">
            <table style ="padding-left:10px;" class="auto-style5">
       <tr>
           
           
           <td>
               <a href="userform1.jsp">考生信息查询</a>
           </td>

       </tr>
                <tr>
                    <td>
                      .
                    </td>
                </tr>
                <tr>

                    <td>
<a href="../servlet/StateServlet">报名结果查询</a>

                    </td>
                </tr>

            </table>
              </div>

          <div  class="article00"style="font-family:'隶书';font-size:35px">
		  <form action="../servlet/UpdateServlet" method="post" ">
           <%
                User userinfo =(User)session.getAttribute("Userinfo");
            %>
                <table style=" border:none; font-size:30px; " >
                      <tr>
                          <td class="auto-style17"  >
                              姓名：
                          </td>
                          <td >
                              <input name="name" type="text" id="Text5" value=<%= userinfo.getname() %> class="textbox" />
                          </td>
                      </tr>            

                    <tr>
                          <td class="auto-style17" >
                              性别：
                          </td>
                          <td >
                              <input name="sex" type="text" id="Text5" class="textbox" value=<%= userinfo.getsex()%> ></input>
                          </td>
                      </tr>   
                    
                    <tr>
                          <td class="auto-style17" >
                              身份证号：
                          </td>
                          <td >
                              <input name="num" id="Text2" type="text"   value=<%=userinfo.getnum() %> class="textbox" />
                          </td>
                      </tr> 
                     <tr>
                          <td class="auto-style17" >
                              
                              联系方式：
                          </td>
                          <td >
                              <input  name="tele" id="Text8" type="text" value=<%=userinfo.gettelephone() %> class="textbox"/>
                          </td>
                      </tr> 
                    <tr>
                          <td class="auto-style17" >
                              
                              家庭住址：
                          </td>
                          <td >
                              <input name="address" id="Adress" type="text"  value=<%=userinfo.getAddress() %> class="textbox"/>
                          </td>
                      </tr> 
           <tr>
                          <td class="auto-style17" >
                              
                              登录密码：
                          </td>
                          <td >
                              <input name="password" id="Adress" type="text"  value=<%=userinfo.getUpass() %> class="textbox"/>
                          </td>
                      </tr> 
                     <tr>
                          <td class="auto-style17"  >
                              父亲职业：
                          </td>
                          <td >
                              <input name="fjob" id="Text9" type="text" value=<%=userinfo.getfatherjob() %> class="textbox"/>
                          </td>
                      </tr> 
                    <tr>
                          <td class="auto-style17"  >
                              母亲职业：
                          </td>
                          <td >
                              <input name="mjob" id="Text10" type="text"  value=<%=userinfo.getmotherjob() %> class="textbox"/>
                          </td>
                      </tr> 
                     <tr>
                          <td class="auto-style17" >
                              毕业学校：
                          </td>
                          <td >
                              <input name="grds" id="Text11" type="text"  value=<%=userinfo.getgrdschool() %> class="textbox"/>
                          </td>
                      </tr>  
                     <tr>
                          <td class="auto-style17"  >
                              毕业成绩：
                          </td>
                          <td >
                              <input  name="grdg" id="Text12" type="text" value=<%=userinfo.getgrdgrade() %> class="textbox"/>
                          </td>
                      </tr> 
                    <tr>
                        <td>

                        </td>
                    </tr>
                     <tr>
                        <td>

                        </td>
                    </tr>
                    
                     <tr>
                          <td style="text-align:justify" colspan="2">
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             
                              <input id="Button1" type="submit" value="提交"style="background-color:#FFF0AC;color:#844200;font-size:25px" />
                          </td>
                          
                      </tr> 
				  
                </table>
				</form>	
            </div>
        </div>
</body>
</html>