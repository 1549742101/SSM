package control;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: xgl
 * Date: 2019/11/11
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 **/
@Controller
public class downloadControl {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFlie (String filename, HttpSession session) throws IOException{
//得到要下载文件字节流
        ServletContext servletContext = session.getServletContext();
        InputStream in = servletContext.getResourceAsStream("/upload/"+filename);
        System.out.println(servletContext.getResourceAsStream("/upload/"+filename));
//将字节流文件转换为字节数组body：设置下载页面的内容
        byte [] body = new byte[in.available()];
        in.read(body);
//设置下载页面头
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename="+filename);
//设置下载页面的状态
        HttpStatus statusCode = HttpStatus.OK;
//根据页面内容、页面头、页面状态创建并跳转到该页面(实际返回的是下载文件数据)
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;
    }


}
