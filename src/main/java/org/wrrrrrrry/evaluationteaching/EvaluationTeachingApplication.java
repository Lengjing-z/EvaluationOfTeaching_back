package org.wrrrrrrry.evaluationteaching;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "org.wrrrrrrry.evaluationteaching.mapper")
@EnableTransactionManagement
public class EvaluationTeachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvaluationTeachingApplication.class, args);
    }

}
