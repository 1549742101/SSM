package login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Login login=new Login();
        if (login.execute(request,response)) {
            response.sendRedirect("login_su.jsp");
        } else {
            response.sendRedirect("login_er.jsp");
        }
    }
}
