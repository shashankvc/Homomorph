/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2014-05-07 12:20:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Files.JSP.officer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.database.conn.DBConnection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class AddCandidate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


			Connection con=DBConnection.getServerConnection();
			Statement st=null;
		
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
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   \r\n");
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
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>ADD CANDIDATE</title>\r\n");
      out.write("\t<link rel=\"Stylesheet\" type=\"text/css\" href=\"Officer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/JS/checkbox.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"content\"><center>\r\n");
      out.write("\t<div style=\"height:80px;width:790px;\">\r\n");
      out.write("\t\t<center><br><br>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/addcandidates.png\">\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\t\r\n");
      out.write("\t\t");
	
			String name="";
  			String address="";
  			String age="";
	  		int district_code=0;
  			String remarks="";
  			String party="";
 			String symbol="";
 			
 			//RETRIVING VALUES FORM SESSION
 			
 			HttpSession ses=request.getSession(true);
 			String temp_name=(String)ses.getAttribute("temp_name");
  			String temp_address=(String)ses.getAttribute("temp_address");
  			String temp_age=(String)ses.getAttribute("temp_age");
  			String temp_district_code=(String)ses.getAttribute("temp_district_code");
  			String temp_remarks=(String)ses.getAttribute("temp_remarks");
  			String temp_party=(String)ses.getAttribute("temp_party");
  			String temp_symbol=request.getParameter("temp_symbol");
  			System.out.println("symbol="+temp_symbol);
  			
  			//IF CONDITION FOR VIEWING VALUES FROM THE SESSION
  			
  			if(temp_name==null)
  			{}else {name=temp_name;}
 			if(temp_address==null)
  			{}else {address=temp_address;}
  			if(temp_age==null)
  			{}else {age=temp_age;}
	  		if(temp_district_code==null)
  			{}else {district_code=Integer.parseInt(temp_district_code);}
  			if(temp_remarks==null)
  			{}else {remarks=temp_remarks;}
  			if(temp_party==null)
  			{}else {party=temp_party;}
  			if(temp_symbol==null)
  			{}else {symbol=temp_symbol;}
  			
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"height:280px;width:20px;float:right;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"height:280px;width:400px;float:right;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
if(temp_symbol==null)
	  	  {
      out.write("\r\n");
      out.write("\t  \t\t<center>\r\n");
      out.write("\t  \t\t<br><br><br><br><br><br>\r\n");
      out.write("\t\t\t<b>Select the Symbol <br>to Preview</b>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t  \t");
}
		  else 
	  	  {
	  	  		HttpSession sesn=request.getSession(true);
				sesn.setAttribute("temp_symbol",temp_symbol);
		
      out.write("\r\n");
      out.write("\t  \t\t\t<center>\r\n");
      out.write("\t  \t\t\t\t<br><br><br><br>\t\r\n");
      out.write("\t\t  \t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Candidates/Symbol/");
      out.print(temp_symbol);
      out.write("\" height=\"100\" width=\"100\">\r\n");
      out.write("\t  \t\t\t\t<br><br>\r\n");
      out.write("\t  \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/AddSymbol.jsp\">Change Symbol\r\n");
      out.write("\t  \t\t\t\t</a>\r\n");
      out.write("\t  \t\t\t</center>\r\n");
      out.write("  \t  \t");
}
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/AddCandidate\" method=\"post\">\r\n");
      out.write("\t\t<div style=\"height:280px;width:360px;float:left;\">\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<table style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t<tr height=\"30\"></tr>\t\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td>&emsp;&emsp;NAME</td>\r\n");
      out.write("\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"c_name\" required=\"requried\" value=\"");
      out.print(name);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td>&emsp;&emsp;ADDRESS</td>\r\n");
      out.write("\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"c_address\" required=\"requried\" value=\"");
      out.print(address);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t\t<td>&emsp;&emsp;AGE</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"c_age\" required=\"requried\" value=\"");
      out.print(age);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td>&emsp;&emsp;DISTRICT</td>\r\n");
      out.write("\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<select style=\"width:155px\" name=\"c_district\" required=\"requried\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						ResultSet rs,rs1=null;						
						st=con.createStatement();
						rs=st.executeQuery("select E_D_code,E_D_name from m_electoral_district");
						if(district_code==0)
						{
							System.out.println("district code first="+district_code);
							while(rs.next())
							{
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");
}System.out.println("this is first..."); 
						}
						else
						{
							System.out.println("district code second="+district_code);
							st=con.createStatement();
							rs1=st.executeQuery("select E_D_code,E_D_name from m_electoral_district where E_D_code="+district_code+"");
							while(rs1.next())
							{
      out.write("\r\n");
      out.write("\t  \t\t\t\t\t\t\t<option value=\"");
      out.print(rs1.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
							System.out.println("this is single..."); 
							ResultSet rs2=null;
							st=con.createStatement();
							rs2=st.executeQuery("select E_D_code,E_D_name from m_electoral_district where E_D_code not in ("+district_code+")");
							while(rs2.next())
								{
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs2.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs2.getString(2));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}System.out.println("this is multiple..."); 
						}
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td>&emsp;&emsp;REMARKS</td>\r\n");
      out.write("\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"c_remarks\" required=\"requried\" value=\"");
      out.print(remarks);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td>&emsp;&emsp;PARTY</td>\r\n");
      out.write("\t\t\t\t\t<td width=10%>:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"c_party\" required=\"requried\" value=\"");
      out.print(party);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

			if(temp_symbol==null)
			{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"image\" value=\"Submit\"src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/selectimage.png\" \r\n");
      out.write("  \t\t\t   onmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/selectimage-click.png'\"\r\n");
      out.write("   \t   \t\t   onmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/selectimage.png'\">\r\n");
      out.write("\t\t\t");
}
			else
			{
      out.write("\r\n");
      out.write("\t\t\t<input type=\"image\" value=\"Submit\"src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add.png\" \r\n");
      out.write("  \t\t\t   onmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add-click.png'\"\r\n");
      out.write("   \t   \t\t   onmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add.png'\">\r\n");
      out.write("\t\t");
	}
      out.write("\t\r\n");
      out.write("\t</form>\t\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Can_add_cancel\" method=\"post\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<input type=\"image\" value=\"Submit\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/cancel.png\"\r\n");
      out.write("\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/cancel-click.png'\"\r\n");
      out.write(" \t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/cancel.png'\">\r\n");
      out.write(" \t</form>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
	String status=null;
	status=(String)request.getAttribute("Status");
	if(status==null)
	{
		
	}
	else
	{
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Sorry, Candidate Name or party already exists\");\r\n");
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