package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.service.IndexService;

import java.util.Collection;

@RestController
public class Index {

    @Autowired
    IndexService indexService;

    // 权限列表all/mine、 个人信息(学院信息等)、通知
    @RequestMapping("/power/mine")
    @PreAuthorize("not anonymous")
    public Collection<? extends GrantedAuthority> getMyPowers(){
        return getUserInfo().getAuthorities();
    }

    @RequestMapping("/info/mine")
    @PreAuthorize("not anonymous")
    public User getMyInfo(){
        return indexService.queryMyInfo(getUserInfo().getUsername());
    }

    public UserDetails getUserInfo(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
