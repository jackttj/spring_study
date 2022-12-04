package com.sample;

import com.ljk.core.annotation.Controller;
import com.ljk.mvc.annotation.RequestMapping;
import com.ljk.mvc.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/a")
public class DoodleController {
//    @RequestMapping(value = "/upload" ,method = RequestMethod.GET)
    @ResponseBody
    @RequestMapping(value = "/upload")
    public String hello() {
        return "upload.html";
    }
}



/*
@PostMapping("/upload")
public String upload(@RequestParam("imgFile") MultipartFile file, @RequestParam("imgName") String name) throws Exception {
    // 设置上传至项目文件夹下的uploadFile文件夹中，没有文件夹则创建
    File dir = new File("uploadFile");
    if (!dir.exists()) {
        dir.mkdirs();
    }
    file.transferTo(new File(dir.getAbsolutePath() + File.separator + name + ".png"));
    return "上传完成！文件名：" + name;
}

作者：守望时空33
链接：https://juejin.cn/post/6989115926503227399
来源：稀土掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */