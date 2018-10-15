<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<!-- saved from url=(0049)https://getbootstrap.com/docs/3.3/examples/theme/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://getbootstrap.com/docs/3.3/favicon.ico">

    <title>HappyRecite</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="./css/theme.css" rel="stylesheet">



    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./js/ie-emulation-modes-warning.js.下载"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


  </head>

  <body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
              <a class="navbar-brand" href="#">HappyRecite</a>
              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>

              <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                  <li class="nav-item">
                    <a class="nav-link" href="./userHomePage">Home <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="nav-item active">
                      <a class="nav-link" href="./selectSet">Setting<span class="sr-only">(current)</span></a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" href="./showProcess">Progress<span class="sr-only">(current)</span></a>
                  </li>
                </ul>
                <button onclick="window.location.href='./homepage.com'" class="btn btn-outline-success my-2 my-sm-0" type="submit">Exit</button>
              </div>
            </nav>


    <div class= "container">

      <%!
      public void show(JspWriter out,boolean[] x,int num)throws Exception{
         int wordSetOrder=num+1;
         if(x[num]==false)
         {

            out.println("<a  role='button' class='btn btn-lg btn-info' href='http://localhost:9999/ReciteWebApp/selectSet?selectOrdelete=1&wordSetOrder="+wordSetOrder+"'>选择</a>");
         }
         else
         {
         out.println("<a  role='button' class='btn btn-lg btn-danger' href='http://localhost:9999/ReciteWebApp/selectSet?selectOrdelete=0&wordSetOrder="+wordSetOrder+"'>删除</a>");
         }
      }
      %>
      <p>
        <h2><span style="color:grey">四级</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <%
                boolean[] x = (boolean[])session.getAttribute("SetExist");
                show(out,x,0);
            %>
        </h2>
      </p>
      <p>
          <h2><span style="color:grey">六级</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
          <%
             show(out,x,1);
          %>
          </h2>
      </p>
      <p>
        <h2><span style="color:grey">考研</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <%
                show(out,x,2);
            %>
        </h2>
      </p>




    </div>
    <script src="./js/jquery.min.js.下载"></script>

          <script src="./js/bootstrap.min.js"></script>
  

<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg></body></html>