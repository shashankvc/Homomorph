/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2014-05-06 13:16:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Files.JSP.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.database.conn.*;
import com.database.conn.DBConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class Managerhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


		Connection con=DBConnection.getServerConnection();
		Statement st=null;
		ResultSet rs=null;
		String b_no=null;
		String b_ref_no=null;
		String b_location=null;
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Files/JSP/manager/Manager_content.jsp", Long.valueOf(1399381847497L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  \twindow.history.forward();\r\n");
      out.write("   \tfunction noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"Stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/Officer.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/bg.jpg\">\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<br><br>\t\t\t\t\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-1.png\"><br><br>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-2.png\">\r\n");
      out.write("\t\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("\t<div align=\"right\">\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Logout\" method=\"post\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/manager/Managerhome.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/home.png\" height=\"30\" width=\"30\"></a>\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/line.png\" height=\"30\" width=\"5\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/manager/Manager_ChangePassword.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd.png\"\r\n");
      out.write("\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd-click.png'\"\r\n");
      out.write("   \t   \t \t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd.png'\"></a>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/line.png\" height=\"30\" width=\"5\">\t\t\r\n");
      out.write("\t\t\t<input type=\"image\" value=\"submit\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout.png\"\r\n");
      out.write("\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout-click.png'\"\r\n");
      out.write("   \t   \t \t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout.png'\">\t\r\n");
      out.write("\t\t\t&emsp;&emsp;\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\t\r\n");
      out.write("\t");

		String manager_id=(String)request.getSession().getAttribute("x_manager_id");
		rs=Methods.ManagerBooth(manager_id);
		while(rs.next())
		{
			b_no=rs.getString(1);
			b_ref_no=rs.getString(2);
			b_location=rs.getString(3);
		}		
	
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"sidebar\">\r\n");
      out.write("\t\t<center><br><br>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/manager.png\" height=\"85\" width=\"85\"><br><br>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/manager/VoterDetails.jsp\" >\t\r\n");
      out.write("   \t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/voterdetails.png\" \r\n");
      out.write("   \t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/voterdetails-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/voterdetails.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/VotingProcess\" method=\"post\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<input type=\"image\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/information.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/information-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/information.png'\"/>\r\n");
      out.write("   \t   \t \t\t\t\t</form>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Currentstatus\" method=\"post\">\t\r\n");
      out.write("   \t   \t \t\t\t\t\t<input type=\"hidden\" name=\"booth_no\" value=\"");
      out.print(b_no);
      out.write("\">\r\n");
      out.write("   \t\t\t\t\t\t\t<input type=\"image\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/currentstatus.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/currentstatus-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/currentstatus.png'\"/>\r\n");
      out.write("   \t   \t \t\t\t\t</form>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/pollingprocess/index.jsp?booth_no=");
      out.print(b_no);
      out.write("&b_ref_no=");
      out.print(b_ref_no);
      out.write("&b_location=");
      out.print(b_location);
      out.write("\" >\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/votingprocess.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/votingprocess-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/votingprocess.png'\"/></a>   \t   \t \t\t\t\t\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\t\r\n");
      out.write("   \t   \t \t</table>\r\n");
      out.write("\t\t</center>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>HOME</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"Stylesheet\" type=\"text/css\" href=\"Officer.css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<center>\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/managerhomepage.png\">\r\n");
      out.write("</center>\r\n");
      out.write("<br>\r\n");
      out.write("<p> \r\n");
      out.write("\t<font style=\"font-family:cambria; font-weight:bold;color:black;font-size:20px;\">\t\r\n");
      out.write("\t\t&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tThe main concept of this application is to execute operations on <br> \r\n");
      out.write("\t\t&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tEncrpted data without Decrypting them. Which&nbsp; will&nbsp; provide &nbsp;as &nbsp;the<br> \r\n");
      out.write("\t\t&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tsame Result after Calculations as if we Worked Directly Raw Data.<br><br>\r\n");
      out.write("\t\t&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tBooth &nbsp;Manager &nbsp;can&nbsp; able &nbsp;to &nbsp;know&nbsp; the&nbsp; total&nbsp; Number&nbsp; of&nbsp; votes <br>\r\n");
      out.write("\t\t&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tPolled&nbsp; in&nbsp; his&nbsp; Booth.&nbsp; it&nbsp; is&nbsp; not&nbsp; possible&nbsp; for&nbsp; Booth Manager to know <br> \r\n");
      out.write("\t\t&emsp;&emsp;&emsp;\r\n");
      out.write("\t\twhich Candidate got how many number of Votes.<br><br>\r\n");
      out.write("\t\t&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tThis operation is happend based on&nbsp;Homomorphic &nbsp;Encryption <br>\r\n");
      out.write("\t\t&emsp;&emsp;&emsp;\r\n");
      out.write("\t\tTechnique stated in First Paragraph.\r\n");
      out.write("\t</font>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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