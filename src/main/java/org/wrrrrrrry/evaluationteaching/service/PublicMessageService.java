package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;
import java.util.Map;

public interface PublicMessageService {
    List<Clazz> queryStudentClass(String username);

    List<Clazz> queryTeacherClass(String username);

    List<Course> queryStudentCourse(String username);

    List<Course> queryTeacherCourse(String username);

    List<Power> queryPowerAll();

    List<Clazz> queryClassByName(String name);

    List<User> queryStudentByCode(String code);

    List<Course> queryCourseByName(String name);

    List<User> queryUserByCode(String code);

    List<Institute> queryInstitute(String name);

    List<Map> queryCCT(String name);
}
