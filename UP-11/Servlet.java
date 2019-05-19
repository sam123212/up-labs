import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/main")
public class Servlet extends HttpServlet 
{
  
	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	 {
		 doPost(req, resp);
	 }
	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
 
    
        String[] array = request.getParameter("array").split(",");
        String s = "";
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < array.length; i++)
{
            integers.add(Integer.parseInt(array[i]));
        }
        Collections.sort(integers);
        for (int i = 0; i < integers.size(); i++)
        {
        	if((i+1)!=integers.size())
            s += integers.get(i) + ", ";
        }

        try 
        {
            writer.println("<p>Sorted array: "+s+"</p>");
        }
        finally 
        {
            writer.close();  
        }
    }
}