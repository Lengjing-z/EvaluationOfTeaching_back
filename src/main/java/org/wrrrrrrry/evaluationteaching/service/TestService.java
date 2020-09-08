package org.wrrrrrrry.evaluationteaching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.TestMapper;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public User queryUserById(int id){
        return testMapper.sel(id);
    }
}
