package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: xgl
 * Date: 2019/11/11
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 **/
@Controller
public class TestControl {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello world";
    }
}
