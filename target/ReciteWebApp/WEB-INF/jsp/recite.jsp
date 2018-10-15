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
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="./css/bootstrap-theme.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/theme.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./js/ie-emulation-modes-warning.js.下载"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    #bar
    {
    width:calc( 10% * ${word.getNum()} )
    }
    </style>
  </head>

  <body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          
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

        <h1>${word.getWs().get(word.getNum()).getWord()}</h1>
      </div>
      <div class="jumbotron">
        <h3>${word.getWs().get(word.getNum()).getNote()}</h3>
       
      </div>
      <p>
       
        <a  role="button" class="btn btn-lg btn-warning" href="http://localhost:9999/ReciteWebApp/recite?order=1&num=${word.getNum()}&know=1">认识</a>
        </p>
        <p>
        <a role="button" class="btn btn-lg btn-danger"href="http://localhost:9999/ReciteWebApp/recite?order=1&num=${word.getNum()}&know=0">不认识</a>
        </p>


      </p>


      <div class="progress">
        <div id= "bar"class="progress-bar progress-bar-striped" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" ><span class="sr-only">60% Complete</span></div>
      </div>



    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./js/ie10-viewport-bug-workaround.js.下载"></script>
  

<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg></body></html>