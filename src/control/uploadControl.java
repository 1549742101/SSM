package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class uploadControl {
    @RequestMapping("/uploadTest")
    public ModelAndView uploadFile(String filename, @RequestParam("file")MultipartFile file, HttpSession session) throws IOException {
        filename=file.getOriginalFilename();
        String path = session.getServletContext().getRealPath("/")+"upload\\"+filename;
        System.out.println(path);
        File f=new File(path);
        file.transferTo(f);
        ModelAndView modelAndView = new ModelAndView("download");
        modelAndView.addObject("filename", filename);
        return modelAndView;
    }
    @RequestMapping({"upload","upload.jsp"})
    public String upload(){
        return "upload";
    }
    @RequestMapping("/upload1")
    public ModelAndView testFileUpload(String filename, MultipartFile file, HttpSession session) throws IOException {
        System.out.println("备注: " + filename);
        filename=file.getOriginalFilename();
        System.out.println("原文件名: " + filename);
        String path = session.getServletContext().getRealPath("/")+"upload\\"+filename;
        System.out.println(path);
        File f=new File(path);
        file.transferTo(f);
        String urlpath="/SSM/upload/"+filename;
        ModelAndView modelAndView = new ModelAndView("download");
        modelAndView.addObject("filename", filename);
        modelAndView.addObject("urlpath", urlpath);
        return modelAndView;
    }
}
