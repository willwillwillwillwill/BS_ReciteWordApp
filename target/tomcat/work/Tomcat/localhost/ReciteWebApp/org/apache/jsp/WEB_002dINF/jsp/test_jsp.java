/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-30 12:48:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("    ");

    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0049)https://getbootstrap.com/docs/3.3/examples/theme/ -->\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"https://getbootstrap.com/docs/3.3/favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>HappyRecite</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap theme -->\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("/css/theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/js/ie-emulation-modes-warning.js.下载\"></script>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script>\n");
      out.write("    function show(i)\n");
      out.write("    {\n");
      out.write("        var x=new Array();\n");
      out.write("         x[0]=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(0).getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("         x[1]=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(1).getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("         x[2]=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ word.getRandomWord().get(2).getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("         x[3]=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ word.getRandomWord().get(3).getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("\n");
      out.write("        if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getWs().getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==x[i])\n");
      out.write("        {alert(\"you are right\");}\n");
      out.write("        else\n");
      out.write("        {alert(\"you are wrong.The meaning is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getWs().getNote()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #bar\n");
      out.write("        {\n");
      out.write("        width:calc( 10% + 10% * ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getNum()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" )\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("     <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">HappyRecite</a>\n");
      out.write("              <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("              </button>\n");
      out.write("\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"./userHomePage\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"./selectSet\">Setting<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"./showProcess\">Progress<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("                <button onclick=\"window.location.href='./homepage.com'\" class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Exit</button>\n");
      out.write("              </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container theme-showcase\" role=\"main\">\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getWs().getWord()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <p>\n");
      out.write("        <button class=\"alert alert-success\" role=\"alert\" onclick = \"show(0);window.location.href='http://localhost:9999/ReciteWebApp/test?order=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getOrder()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getNum()+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\">\n");
      out.write("          <strong>A</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(0).getNote()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("        <button class=\"alert alert-info\" role=\"alert\" onclick = \"show(1);window.location.href='http://localhost:9999/ReciteWebApp/test?order=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getOrder()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getNum()+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\">\n");
      out.write("          <strong>B</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(1).getNote()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("      <button class=\"alert alert-warning\" role=\"alert\" onclick = \"show(2);window.location.href='http://localhost:9999/ReciteWebApp/test?order=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getOrder()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getNum()+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\">\n");
      out.write("        <strong>C</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(2).getNote()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("      </button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("      <button class=\"alert alert-danger\" role=\"alert\" onclick = \"show(3);window.location.href='http://localhost:9999/ReciteWebApp/test?order=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getOrder()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getNum()+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\">\n");
      out.write("        <strong>D</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${word.getRandomWord().get(3).getNote()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("      </button>\n");
      out.write("      </p>\n");
      out.write("\n");
      out.write("      <div class=\"progress\">\n");
      out.write("                  <div id= \"bar\"class=\"progress-bar progress-bar-striped\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" ><span class=\"sr-only\">60% Complete</span></div>\n");
      out.write("                </div>\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("   <script src=\"./js/jquery.min.js.下载\"></script>\n");
      out.write("\n");
      out.write("         <script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"1140\" height=\"500\" viewBox=\"0 0 1140 500\" preserveAspectRatio=\"none\" style=\"display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;\"><defs><style type=\"text/css\"></style></defs><text x=\"0\" y=\"57\" style=\"font-weight:bold;font-size:57pt;font-family:Arial, Helvetica, Open Sans, sans-serif\">Thirdslide</text></svg></body></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
