package com.ljk.mvc.bean;




import com.ljk.core.annotation.Controller;
import com.ljk.mvc.annotation.RequestMapping;
import com.ljk.mvc.annotation.ResponseBody;

@Controller
@RequestMapping
public class FileUploadController {
    @RequestMapping
    @ResponseBody
    public void hello(){System.out.println("hi");};
}


/*

@RequestMapping()
public class DoodleController {
    @RequestMapping
    @ResponseBody
    public String hello() {
        return "hello doodle";
    }
}
 */