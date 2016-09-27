package com.officer;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* CLASS FOR ADDING CANDIDATE SYMBOL TO THE DATABASE */

public class AddSymbol extends HttpServlet
{

    ServletInputStream sis=null;
    
	/* METHOD FOR ADDING CANDIDATE SYMBOL TO THE DATABASE */
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		
		String path="";
		String fileName = "";
		String fName = "";
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        response.setHeader("Cache-control", "no-cache");    
        String err = "";
        String contentType = request.getContentType();
        String boundary = "";       
        int BOUNDARY_WORD_SIZE = "boundary=".length();
        if ((contentType == null) || (!contentType.startsWith("multipart/form-data")))
        {
	         err = "Ilegal ENCTYPE : must be multipart/form-data\n";
	         err = err + "ENCTYPE set = " + contentType;
        }
        else
        {
        	boundary = contentType.substring(contentType.indexOf("boundary=") + BOUNDARY_WORD_SIZE);
        	boundary = "--" + boundary;            
        	try
        	{
        		/* Enhancements(Starts) */
        		DataInputStream in = new DataInputStream(request.getInputStream());
        		int dataLength = request.getContentLength();
        		/* Enhancements(Ends) */
        		sis = request.getInputStream();            
        		byte[] b = new byte[dataLength];
        		int x = 0;
        		int state = 0;
        		String name = null; String contentType2 = null;
        		FileOutputStream buffer = null;            
        		while ((x = sis.readLine(b, 0,dataLength)) > -1)
        		{
        			String s = new String(b, 0, x);
        			if (s.startsWith(boundary))
        			{
        				state = 0;
        				name = null;
        				contentType2 = null;
        				fileName = null;
        			}
        			else if ((s.startsWith("Content-Disposition")) && (state == 0))
        			{
	            	 	state = 1;
		                if (s.indexOf("filename=") == -1)
		                {
		                	name = s.substring(s.indexOf("name=") + "name=".length(), s.length() - 2);
		                }
		                else
		                {
		                	name = s.substring(s.indexOf("name=") + "name=".length(), s.lastIndexOf(";"));
		                	fileName = s.substring(s.indexOf("filename=") + "filename=".length(), s.length() - 2);
		                	if (fileName.equals("\"\""))
		                    {
		                		fileName = null;
		                    }
		                    else
		                    {
		                    	String userAgent = request.getHeader("User-Agent");
		                    	String userSeparator = "/";
		                    	if (userAgent.indexOf("Windows") != -1)
		                    	{
		                    		userSeparator = "\\";
		                    	}
		                    	if (userAgent.indexOf("Linux") != -1)
			                    {
		                    		userSeparator = "/";
			                    }		                   
		                    	fileName = fileName.substring(fileName.lastIndexOf(userSeparator) + 1, fileName.length() - 1);
		                    	if (fileName.startsWith("\""))
			                    {
		                    		fileName = fileName.substring(1);
			                    }
		                    }				                 
		                	name = name.substring(1, name.length() - 1);
				            if (!name.equals("file"))
				            	continue;
				            if (buffer != null)
				            {
				                buffer.close();
				            }
			                fName=fileName;
							int dotPos = fName.lastIndexOf(".");
							System.out.println("File Name : " + fileName);
							path = request.getRealPath("") +"/Files/images/Candidates/Symbol/"+ fileName;			               
							buffer = new FileOutputStream(path);
		              }
	             }
	             else if ((s.startsWith("Content-Type")) && (state == 1))
	             {
	            	 state = 2;
	            	 contentType2 = s.substring(s.indexOf(":") + 2, s.length() - 2);
	             }
	             else if ((s.equals("\r\n")) && (state != 3))
	             {
	            	 state = 3;
	             }
	             else
	             {
	            	 if (!name.equals("file"))
	            		continue;
		            	buffer.write(b, 0, x);
	             }
        	}      
        	sis.close();
        	buffer.close();
        }
        catch (IOException e)
        {
        	err = e.toString();
        } 
        catch (Exception e) 
        {		
        	e.printStackTrace();
		}
    }    
    boolean ok = err.equals("");
    if (!ok)
    {
    	out.println(err);
    }     
    out.println("File Uploaded sussessfully");
    System.out.println("****** Done......."+fName);     
    response.sendRedirect(request.getContextPath()+"/Files/JSP/officer/AddCandidate.jsp?temp_symbol="+fName);
	}					
}
