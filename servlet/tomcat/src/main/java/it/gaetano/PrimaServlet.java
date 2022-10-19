package it.gaetano;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	
	
	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
		
		
        Writer w = resp.getWriter();
        
       
    
       
        w.write("<body>");
    	
        w.write("<table border= 3 height=450px width=1900px>");
       
       w.write("<tr height=250px>l");
           
        w.write("<td  align=center colspan= 4>");   
            w.write(" DOCUMENTARIO MUORT I MAMMT");
               
               
        w.write("</td>");   
          
           
      w.write("</tr>" ); 
       w.write("<tr height =  50px>");
       w.write   (" <td  align=center colspan=4>");
               
       w.write     ("   Benvneuti nel menu");
       w.write     (" </td>");
           
       w.write  (" </tr>");
       
       
       w.write   (" <tr height=50px>");
       w.write      ("       <td align=center>");
       w.write     ("  <a href=somma.php>Somma </a>");
       w.write    (" </td>");
       
       
       
       
       
       w.write   ("<td align=center>");
       w.write       ("<a href=moltiplicazione.php> Moltiplicazione</a>");
     
       w.write   ("   </td>");
    
       w.write  (" <td align=center>");
       w.write    ("   <a href=divisione.php> Divisione </a>");
       w.write     (" </td> ");
     
       w.write (" <td align=center>");
       w.write      ("<a href=sottrazione.php> Sottrazione </a>");
       w.write    (" </td>");
        
       w.write    (" </tr>  ");
   	
       w.write  ("<tr height=100px>");
       w.write ("	<td  align=center colspan=4>");
   		
  
       w.write ("</td>");

   	
   	

   	
   	
   	
   	
       w.write (" </tr>	");

   	
   	
       w.write  ("<tr height=100px>");

       w.write   ("<td align=center colspan=4>");
   






   			
   			
       w.write	("</td>	");	
   		
       w.write  	("</tr>");
       w.write		("  <tr height=50px>");
   
       w.write    ("<td align=center colspan=4>");
           
       w.write    ("  <a href=index.html>Schermata principale</a>");
       w.write     (" </td>");
       w.write   (" </tr>");

       w.write 	 ("</table>");

       w.write   ("</body>");
       w.write   ("</html>");
        
        
	
        w.write("<html>");
       w.write("<head><title>Hello World</title></head>");
       w.write("<body><h1>Hello World</h1></body>");
        w.write("</html>");
        w.close();
        
   
    }
	
	
}
