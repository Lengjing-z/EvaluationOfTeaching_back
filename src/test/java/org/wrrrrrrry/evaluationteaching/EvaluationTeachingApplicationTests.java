package org.wrrrrrrry.evaluationteaching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.UserMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
class EvaluationTeachingApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() throws SQLException {

        User user=userMapper.queryUserAndAuthoritiesByCode("2020100102");
        System.out.println(user);
    }

}
