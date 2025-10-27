import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple (hardcoded) validation logic
        if ("admin".equals(username) && "12345".equals(password)) {
            out.println("<html><body style='font-family: Arial; text-align: center;'>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body style='font-family: Arial; text-align: center; color: red;'>");
            out.println("<h3>Invalid username or password!</h3>");
            out.println("<a href='login.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}
