// DoodleController
package com.ljk.bean;

import com.ljk.core.annotation.Controller;
import com.ljk.ioc.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DoodleController {
    @Autowired
    private DoodleService doodleService ;

    public void hello() {
        log.info(doodleService.helloWord());
    }
}