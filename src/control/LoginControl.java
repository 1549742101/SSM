package control;

import login.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

@RequestMapping("/")
@Controller
public class LoginControl {
    @RequestMapping("/login1")
    public String checkUser(String username,String password) {
        Login login=new Login();
        if (login.execute(username,password)) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("username",username);
            modelAndView.addObject("password",password);
            return "login_su";
        } else {
            return "login_er";
        }
    }
    @RequestMapping(value = "/login2",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String jsonUser(String username,String password) {
        Login login=new Login();
        if (login.execute(username,password)) {
            return "登录成功"+username;
        } else {
            return "登录失败";
        }
    }
}
