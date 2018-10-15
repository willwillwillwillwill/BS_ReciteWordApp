<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
   <link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
   <!-- Bootstrap theme -->

   <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   <link href="<%=basePath%>/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

   <!-- Custom styles for this template -->
   <link href="<%=basePath%>/css/theme.css" rel="stylesheet">

   <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
   <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
   <script src="<%=basePath%>/js/ie-emulation-modes-warning.js.下载"></script>

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
                      <li class="nav-item">
                          <a class="nav-link" href="./selectSet">Setting<span class="sr-only">(current)</span></a>
                      </li>
                      <li class="nav-item active">
                          <a class="nav-link" href="./showProcess">Progress<span class="sr-only">(current)</span></a>
                      </li>
                    </ul>
                    <button onclick="window.location.href='./homepage.com'" class="btn btn-outline-success my-2 my-sm-0" type="submit">Exit</button>
                  </div>
                </nav>

    <div class="container theme-showcase" role="main">



        <br>
      <div class="page-header">
        <h1>进度</h1>
      </div>
      <br>
       <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-sm">
                            <thead>
                                <tr>

                                    <th>wordSetName</th>
                                    <th>learn word</th>
                                    <th>all word</th>
                                </tr>
                            </thead>
                            <tbody>
                              <c:forEach var="info" items="${requestScope.get('list')}"  varStatus="status">
                                  <tr class="success">

                                      <th>${info.name}</th>
                                      <th>${info.learnWord}</th>
                                      <th>${info.allWord}</th>


                                  </tr>
                              </c:forEach>
                            </tbody>
                        </table>


                    </div>
                </div>
            </div>
       </div>


    </div> <!-- /container -->

   <script src="./js/jquery.min.js.下载"></script>

         <script src="./js/bootstrap.min.js"></script>


<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg></body></html>