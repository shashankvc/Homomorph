/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2014-05-06 13:17:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Files.JSP.officer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.database.conn.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import com.paillier.*;
import java.math.BigInteger;

public final class ElectionResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	Connection con=DBConnection.getServerConnection();
	Statement st=null;
	ResultSet rs,rs1=null;
	String dec_data=null;
	int min_vote=0;
	int max_vote=0;
	int same_vote=0;
	int i=0;
	String winner=null;
	String temp_winner=null;	
	int same[]=new int[10];
	String Result="NONE";

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Files/JSP/officer/Common_content.jsp", Long.valueOf(1399381847575L));
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  \twindow.history.forward();\r\n");
      out.write("   \tfunction noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
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
      out.write("\t\t<br>\t\t\t\t\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-1.png\"><br><br>\r\n");
      out.write("\t\t\t<img  src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-2.png\">\r\n");
      out.write("\t\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div align=\"right\">\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Logout\" method=\"post\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Officerhome.jsp\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/home.png\" height=\"30\" width=\"30\"></a>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/line.png\" height=\"30\" width=\"5\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Admin_ChangePassword.jsp\">\r\n");
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
      out.write("\t<div id=\"sidebar\">\r\n");
      out.write("\t\t<center><br><br>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/officer.png\" height=\"100\" width=\"90\"><br>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Electoral_District.jsp\" >\t\r\n");
      out.write("\t\t\t   \t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Candidates.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Booths.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/ElectionResult.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results.png'\"/></a>\t\t\t\t\t\t\t   \t   \t \t\t\t\t\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\t\r\n");
      out.write("   \t   \t \t</table>\r\n");
      out.write("\t\t</center><br>\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Election Result</title>\r\n");
      out.write("<link rel=\"Stylesheet\" type=\"text/css\" href=\"Officer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('	');
      out.write('\r');
      out.write('\n');
 	
	same[0]=0;
	String temp_district=(String)request.getSession().getAttribute("temp_district");
	System.out.println("JSP temp_district"+temp_district);
	st=con.createStatement();
	rs=st.executeQuery("select E_D_district from m_electoral_district group by E_D_district");

      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/ElectionResult\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/result-logo.png\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<table width=\"350\" style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<font style=\"font-family:cambria; font-weight:bold; color:black;\">\r\n");
      out.write("\t\t\tELECTORAL DISTRICT \r\n");
      out.write("\t\t</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td>:</td>\t\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<select name=\"district\" style=\"width:150px;\" required=\"required\">\t\t\t\t\r\n");
		if(temp_district==null)
		{
      out.write("\r\n");
      out.write("\t\t\t<option value=\"Select\" >Select</option>\r\n");
 			while(rs.next())
			{
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1));
      out.write("</option>\r\n");
			}					
		}
		else
		{
      out.write("\r\n");
      out.write("\t\t\t<option value=\"");
      out.print(temp_district);
      out.write('"');
      out.write('>');
      out.print(temp_district);
      out.write("</option>\r\n");
 			rs1=st.executeQuery("select E_D_district from m_electoral_district where E_D_district not in ('"+temp_district+"') group by E_D_district");
			while(rs1.next())
			{
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(rs1.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(1));
      out.write("</option>\r\n");
			}
		}
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table><br>\r\n");
      out.write("<input type=\"image\" src=\"/pollingprocess/Files/Images/index/enter.png\"\r\n");
      out.write("\t\t\t\tonmouseover=\"this.src='/pollingprocess/Files/Images/index/enter-click.png'\"\r\n");
      out.write(" \t\t\t\tonmouseout=\"this.src='/pollingprocess/Files/Images/index/enter.png'\">\r\n");
      out.write("<br><br> \t\t\t\t\r\n");
 
	if(temp_district==null)
	{
      out.write("\r\n");
      out.write("\t\r\n");
	}
	else
	{
      out.write("\r\n");
      out.write("\t<table border=\"1\" width=\"400\" style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t\t<tr style=\"background-color:lightblue;color:black;\">\r\n");
      out.write("\t\t\t<td>CANDIDATE NAME</td>\r\n");
      out.write("\t\t\t<td>NUMBER OF VOTES</td>\r\n");
      out.write("\t\t</tr>\t\t\t\r\n");
		rs=st.executeQuery("select c.c_name,c.c_code,v.No_votes from m_candidate c left join m_votes v on c.c_code=v.c_code where c.c_code in (select c.c_code from m_candidate c inner join (select E_D_code from m_electoral_district where E_D_district='"+temp_district+"') t on c.E_D_code=t.E_D_code)");
		while(rs.next())
		{
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
      out.print(rs.getString(1));
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
				Paillier paillier=new Paillier();
				System.out.println("before Biginteger=");
				String t_no="0";
				int Result=0;
				temp_winner=rs.getString(1);
				if(rs.getString(3)==null)
				{					
				}
				else
				{
					t_no=rs.getString(3);
				}					
				BigInteger n=new BigInteger(t_no);	
				System.out.println("before decrption="+n);
				n=paillier.Decryption(n);
				min_vote=Integer.parseInt(n.toString());
				if(min_vote>max_vote)
				{							
						max_vote=min_vote;
						winner=temp_winner;
						
				}
				else if(min_vote==max_vote)
				{
					max_vote=min_vote;
					winner="NONE";	
				}
			
				
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(min_vote);
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\t\t\r\n");
      out.write("\t\t\t</tr>\t\r\n");
		}
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\t\t\t\t\t\r\n");
	}
      out.write("\t\t \t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
 if(winner==null)
	{
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\talert(\"WINNER:\");\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<font style=\"font-family:cambria; font-weight:bold; color:red;\">\r\n");
      out.write("\t\"WINNER\t:\t\r\n");
      out.write("\t");
      out.print(winner);
      out.write("\" \r\n");
      out.write("\t");
 winner="NONE";
      out.write("\t\r\n");
      out.write("\t");
 min_vote=0;
      out.write('\r');
      out.write('\n');
      out.write('	');
 max_vote=0;
      out.write("\r\n");
      out.write("\t</font>\t\t\t\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write('\r');
      out.write('\n');
	String status=null;
	status=(String)request.getAttribute("Status");	
	if(status==null)
	{
		
	}
	else
	{
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\talert(\"Please select the district\");\r\n");
      out.write("\t\t</script>\r\n");
	}
      out.write("\r\n");
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