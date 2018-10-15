<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>

<html lang="en">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta name="description" content="">
   <meta name="author" content="">
   <link rel="icon" href="https://getbootstrap.com/docs/3.3/favicon.ico">

   <title>HappyRecite</title>


   <link href="./css/bootstrap.min.css" rel="stylesheet">

   <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

   <link href="./css/jumbotron.css" rel="stylesheet">

   <script src="<%=basePath%>/js/ie-emulation-modes-warning.js.下载"></script>


   <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
   <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>


    <script type="text/javascript">
       if(${warning!=null})
        alert("${warning}");



    </script>
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
              <li class="nav-item active">
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
      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Hello, English!</h1>
          <p>英语是国际指定的官方语言（作为母语），也是世界上最广泛的第一语言，英语包含约49万词，外加技术名词约30万个，是词汇最多的语言，也是欧盟以及许多国际组织以及英联邦国家的官方语言</p>
          <p><a class="btn btn-primary btn-lg" href="./myBook" role="button">Your WordBook »</a></p>
        </div>
      </div>

      <div class="container">
        <!-- Example row of columns -->
        <div class="row">
          <div class="col-md-4">
            <h2>Cet4</h2>
            <p>大学英语四级考试，即CET-4，是由国家教育部高等教育司主持的全国性教学考试。英语四级考试目的是推动大学英语教学大纲的贯彻执行，对大学生的英语能力进行客观、准确的测量，为提高我国大学英语课程的教学质量服务。</p>
            <p><a class="btn btn-danger" href="http://localhost:9999/ReciteWebApp/recite?order=1&num=-1" role="button">go to recite »</a> &nbsp&nbsp&nbsp&nbsp
            <a class="btn btn-success" href="http://localhost:9999/ReciteWebApp/test?order=1&num=-1" role="button">go to test »</a></p>
          </div>
          <div class="col-md-4">
            <h2>Cet6</h2>
            <p>CET6：全称“College English Test-6”，即“大学英语六级考试”。 大学英语六级考试是国家统一出题的，统一收费的，统一组织考试，用来评定中专以上学历人员的英语能力。主要考核学生运用语言的能力，同时也考核学生对词语用法和语法结构的掌握程度。</p>
            <p><a class="btn btn-danger" href="http://localhost:9999/ReciteWebApp/recite?order=2&num=-1" role="button">go to recite »</a> &nbsp&nbsp&nbsp&nbsp
            <a class="btn btn-success" href="http://localhost:9999/ReciteWebApp/test?order=2&num=-1" role="button">go to test »</a></p>
          </div>
          <div class="col-md-4">
            <h2>GRE</h2>
            <p>全称Graduate Record Examination，中文名称为美国研究生入学考试，适用于除法律与商业外的各专业，由美国教育考试服务处（Educational Testing Service，简称ETS)主办。GRE是世界各地的大学各类研究生院（除管理类学院，法学院）要求申请者所必须具备的一个考试成绩，也是教授对申请者是否授予奖学金所依据的最重要的标准。</p>
            <p><a class="btn btn-danger" href="http://localhost:9999/ReciteWebApp/recite?order=3&num=-1" role="button">go to recite »</a> &nbsp&nbsp&nbsp&nbsp
            <a class="btn btn-success" href="http://localhost:9999/ReciteWebApp/test?order=3&num=-1" role="button">go to test »</a></p>
          </div>
        </div>

        <hr>

      </div> <!-- /container -->

    </div>


  <script src="./js/jquery.min.js.下载"></script>

        <script src="./js/bootstrap.min.js"></script>


<svg xmlns="http://www.w3.org/2000/svg" width="1140" height="500" viewBox="0 0 1140 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="57" style="font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thirdslide</text></svg></body></html>