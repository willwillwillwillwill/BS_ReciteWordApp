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

   <title>Theme Template for Bootstrap</title>

   <!-- Bootstrap core CSS -->
   <link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
   <!-- Bootstrap theme -->
   <link href="<%=basePath%>/css/bootstrap-theme.min.css" rel="stylesheet">
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

    <script type="text/javascript">

      alert("${message}")

    </script>
  </head>

  <body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" >Bootstrap theme</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">

          <ul class="nav navbar-nav">
            <li ><a href="http://localhost:9999/ReciteWebApp/userHomePage">Home</a></li>
            <li class="active"><a href="http://localhost:9999/ReciteWebApp/reciteBegin">Word</a></li>


          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container theme-showcase" role="main">

      <nav class="navbar navbar-default">
        <div class="container">
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="https://getbootstrap.com/docs/3.3/examples/theme/#">背诵</a></li>
                <li><a href="https://getbootstrap.com/docs/3.3/examples/theme/#about">测试</a></li>
                <li><a href="https://getbootstrap.com/docs/3.3/examples/theme/#contact">单词集</a></li>
                <li><a href="https://getbootstrap.com/docs/3.3/examples/theme/#contact">进度集</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>


      <div class="page-header">
        <h1>WordSet</h1>
      </div>
      <p>

        <a  class="btn btn-lg btn-primary" href="http://localhost:9999/ReciteWebApp/test?order=1&num=-1" role="button" >四级</a>
      </p>
      <p>
            <a class="btn btn-lg btn-success"  href="http://localhost:9999/ReciteWebApp/test?order=2&num=-1" role="button">六级</a>
      </p>
      <p>
            <a class="btn btn-lg btn-info" href="http://localhost:9999/ReciteWebApp/test?order=3&num=-1" role="button">考研</a>
       
      </p>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./js/ie10-viewport-bug-workaround.js.下载"></script>
  

<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg></body></html>