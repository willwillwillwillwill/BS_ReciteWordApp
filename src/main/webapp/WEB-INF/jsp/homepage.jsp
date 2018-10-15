<%@page contentType="text/html" pageEncoding = "utf-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Home Page</title>
  <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
  <link rel="stylesheet" href="<%=basePath%>/css/homePageStyle.css">
</head>
<script>
if(${warning!=null})
    alert("${warning}");
function checkPassWord()
{
 var val = document.getElementById("pas").value;

if(val.length<6)
{
alert("密码小于6位")
return false;
}
else
return true;

}
function checkPassWordRegister()
{
 var val = document.getElementById("pasR").value;

if(val.length<6)
{
alert("密码小于6位")
return false;
}
else
return true;

}
</script>
<body>
  <div class="form">

      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Sign Up</a></li>
        <li class="tab"><a href="#login">Log In</a></li>
      </ul>

      <div class="tab-content">
        <div id="signup">
          <h1>Sign Up for Free</h1>

          <form action="./user" method="post" onsubmit="return checkPassWordRegister()">
          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off" name = "email"/>
          </div>

          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off" name = "password" id="pasR"/>
          </div>

          <button type="submit" class="button button-block"/>Get Started</button>

          </form>

        </div>

        <div id="login">
          <h1>Welcome Back!</h1>

          <form action="./userHomePage" method="post" onsubmit="return checkPassWord()" >

            <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off" name="email"/>
          </div>
          <%
          String name = request.getParameter("email");


          session.setAttribute("email", name);
          %>

          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off"  name="password"  id="pas"/>
          </div>

          <p class="forgot"><a href="#">Forgot Password?</a></p>

          <button  class="button button-block"/>Log In</button>

          </form>

        </div>
      </div><!-- tab-content -->

</div> <!-- /form -->

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="<%=basePath%>/js/homePageIndex.js"></script>
</body>
</html>
