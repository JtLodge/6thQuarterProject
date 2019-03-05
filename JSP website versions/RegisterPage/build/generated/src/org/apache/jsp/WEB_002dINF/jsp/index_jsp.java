package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Registration</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class= \"loginbody\">\r\n");
      out.write("            \r\n");
      out.write("<div class =\"container-fluid\" >\r\n");
      out.write("    <form class=\"form-signin\" action=\"Registration\" method=\"post\">\r\n");
      out.write("      \t<img src=\"images/logo.png\" width=\"290\" height=\"72\">\r\n");
      out.write("\r\n");
      out.write("      \t<h1 class=\"hcolor h3 mb-3 font-weight-normal\">Register</h1>\r\n");
      out.write("          \r\n");
      out.write("      \t<label for=\"inputEmail\" class=\"sr-only\">First Name</label>\r\n");
      out.write("      \t<input type=\"username\" id=\"inputUser\" class=\"form-control\" placeholder=\"First Name\" name=\"FName\" required autofocus>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">Last Name</label>\r\n");
      out.write("      \t<input type=\"username\" id=\"inputUser\" class=\"form-control\" placeholder=\"Last Name\" name=\"LName\" required autofocus>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">Driver Id</label>\r\n");
      out.write("      \t<input type=\"username\" id=\"inputDriverId\" class=\"form-control\" placeholder=\"Driver Id\" name=\"DriverId\" required autofocus>\r\n");
      out.write("          \r\n");
      out.write("      \t<label for=\"inputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("      \t<input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" name=\"password\" required>\r\n");
      out.write("      \t\t<div class=\"checkbox mb-3 cbcolor\">\r\n");
      out.write("        \t\t<label>\r\n");
      out.write("          \t\t\t<input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("        \t\t</label>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Register</button>\r\n");
      out.write("    \t<p class=\"mt-5 mb-3 fcolor\">&copy; 2017-2018</p>\r\n");
      out.write("    </form>\r\n");
      out.write("                \r\n");
      out.write("</div>\r\n");
      out.write("     \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
