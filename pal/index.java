import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PalindromeServlet extends HttpServlet {

 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  int num = Integer.parseInt(request.getParameter("num"));
  int original = num;
  int reverse = 0;

  while(num != 0){
      int remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num = num / 10;
  }

  out.println("<html><body>");

  if(original == reverse){
      out.println("<h2>Palindrome Number</h2>");
  }
  else{
      out.println("<h2>Not a Palindrome Number</h2>");
  }

  out.println("</body></html>");
 }
}