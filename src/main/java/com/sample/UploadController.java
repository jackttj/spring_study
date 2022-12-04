package com.sample;

import com.ljk.core.annotation.Controller;
import com.ljk.mvc.annotation.RequestMapping;
import com.ljk.mvc.annotation.RequestMethod;
import com.ljk.mvc.annotation.ResponseBody;
import com.ljk.mvc.bean.ModelAndView;

@Controller
@RequestMapping
public class UploadController {
    //    @RequestMapping(value = "/upload" ,method = RequestMethod.GET)
    @RequestMapping(value = "/upload" ,method = RequestMethod.GET)
    @ResponseBody(value = "mv")

    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setView("/static/upload.html");
        return mv;

    }
}
