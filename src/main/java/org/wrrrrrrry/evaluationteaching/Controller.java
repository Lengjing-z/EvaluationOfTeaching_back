package org.wrrrrrrry.evaluationteaching;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("test")
    public String test(){
        System.out.println("success");
        return "success";
    }
}
