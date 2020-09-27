package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.service.ToEService;

import java.util.List;
import java.util.Map;

@RestController
public class ToE {

    @Autowired
    ToEService toEService;
    @RequestMapping("/evaluation/finishedList")
    public List<Questionnaire> getFinishedQuestionnaire(){
        return toEService.queryFinishedQuestionnaire(getUserInfo().getUsername(),getUserInfo().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_student")));
    }
    @RequestMapping("/evaluation/detail")
    public Map<String,String> getFinishedDetailById(int id){
            return toEService.queryFinishedDetailById(id);
    }



    public UserDetails getUserInfo(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
