<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- saved from url=(0049)https://getbootstrap.com/docs/3.3/examples/theme/ -->
<html lang="en"><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
      <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">

      <meta name="description" content="">
      <meta name="author" content="">
      <link rel="icon" href="https://getbootstrap.com/docs/3.3/favicon.ico">

      <title>HappyRecite</title>


      <link href="./css/bootstrap.min.css" rel="stylesheet">



      <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">


      <link href="./css/theme.css" rel="stylesheet">


      <script src="./js/ie-emulation-modes-warning.js.下载"></script>
    <style>
    .btn-circle {
      width: 20px;
      height: 20px;
      text-align: center;
      padding: 6px 0;
      font-size: 12px;
      line-height: 1.428571429;
      border-radius: 15px;
    }
    </style>
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
                        <li class="nav-item">
                            <a class="nav-link" href="./showProcess">Progress<span class="sr-only">(current)</span></a>
                        </li>
                      </ul>
                      <button onclick="window.location.href='./homepage.com'" class="btn btn-outline-success my-2 my-sm-0" type="submit">Exit</button>
                    </div>
                  </nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->



      <div class="page-header">
      <br>
        <h1>MyWordSet</h1>
      </div>
      <br>
      <div class="row">
        <div class="col-md-6">
            <table class="table">

                <thead>
                    <tr>
                        <th>#</th>
                        <th>单词</th>
                        <th>解释</th>
                        <th>删除</th>
                    </tr>

                </thead>
                <tbody id ="tbody1">
                  <c:forEach var="word" items="${requestScope.get('list')}"  varStatus="status">
                      <tr>

                          <th>${status.index+1}</th>
                          <th>${word.word}</th>
                          <th>${word.note}</th>
                          <th>


                          <a href="<%=basePath%>/myBook?deleteId=${status.index}" role="button" class="btn btn-danger btn-circle"></a>

                          </th>

                      </tr>
                  </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


       

    </div> <!-- /container -->


    <script src="./js/jquery.min.js.下载"></script>

          <script src="./js/bootstrap.min.js"></script>

<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg>



   
</body></html>