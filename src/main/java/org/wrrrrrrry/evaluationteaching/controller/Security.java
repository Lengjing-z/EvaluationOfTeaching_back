package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.entity.UserPower;
import org.wrrrrrrry.evaluationteaching.service.SecurityService;

import java.util.List;

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
    @RequestMapping("/admin/userPower/all")
    public List<UserPower> getUserPowerAll(){
        return securityService.queryUserPowerAll();
    }
    @RequestMapping("/admin/power/add")
    public int powerAdd(@RequestBody List<UserPower> userPowers){
        return securityService.powerAdd(userPowers);
    }
    @RequestMapping("/admin/power/del")
    public int powerDel(@RequestBody List<UserPower> userPowers){
        return securityService.powerDel(userPowers);
    }
    @RequestMapping("admin/power/query")
    public List<UserPower> powerQuery(@RequestBody UserPower userPower){
        return securityService.queryUSerPowerById(userPower);
    }

    public UserDetails getUserInfo(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
