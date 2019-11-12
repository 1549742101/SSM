package login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class Login {
    public boolean execute(HttpServletRequest request, HttpServletResponse response) {
        boolean ret=false;
        try {
            request.setCharacterEncoding("utf-8");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if ("张三".equals(username) && "111".equals(password)) {
                ret=true;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }
    public boolean execute(String username, String password) {
        boolean ret=false;
        if ("123".equals(username) && "456".equals(password)) {
            ret=true;
        }
        return ret;
    }


}
