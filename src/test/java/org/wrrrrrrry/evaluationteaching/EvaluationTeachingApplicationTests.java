package org.wrrrrrrry.evaluationteaching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wrrrrrrry.evaluationteaching.controller.Index;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.AddintroMapper;
import org.wrrrrrrry.evaluationteaching.mapper.IndexMapper;
import org.wrrrrrrry.evaluationteaching.mapper.PublicMessageMapper;
import org.wrrrrrrry.evaluationteaching.mapper.UserMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@SpringBootTest
class EvaluationTeachingApplicationTests {


    @Autowired
    AddintroMapper addintroMapper;
    @Test
    void contextLoads() throws SQLException {


    }

}
