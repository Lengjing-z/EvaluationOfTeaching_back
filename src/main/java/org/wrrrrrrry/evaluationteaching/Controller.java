package org.wrrrrrrry.evaluationteaching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.service.TestService;

@RestController
public class Controller {
    @Autowired
    TestService testService;

    @PreAuthorize("hasRole('ROLE_teacher')")
    @RequestMapping("login/{status}")
    public String test(@PathVariable String status){
        System.out.println(status);
        if (status.equals("query")){
            return testService.queryUserById(2).toString();
        }
        return status;
    }

    @PreAuthorize("hasAuthority('AUTH_resetpassword')")
    @RequestMapping("test")
    public String test1(){

        return "test";
    }
}
