package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.service.SecurityService;

@RestController
public class Security {
    @Autowired
    SecurityService securityService;
    @RequestMapping("/admin/userInfo/reset")
    public int resetPasswordByCode(@RequestBody String code){
        return securityService.resetPasswordByCode(code);
    }
    @RequestMapping("/info/mine/modifyInfo")
    public int modifyMyInfo(@RequestBody User user){
        user.setCode(getUserInfo().getUsername());
        return securityService.modifyMyInfo(user);
    }

    public UserDetails getUserInfo(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
