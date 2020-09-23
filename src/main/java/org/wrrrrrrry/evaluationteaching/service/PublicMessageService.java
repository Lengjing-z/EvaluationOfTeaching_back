package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.Power;
import org.wrrrrrrry.evaluationteaching.entity.User;

import java.util.List;

public interface PublicMessageService {
    List<Clazz> queryStudentClass(String username);

    List<Clazz> queryTeacherClass(String username);

    List<Course> queryStudentCourse(String username);

    List<Course> queryTeacherCourse(String username);

    List<Power> queryPowerAll();

    List<Clazz> queryClassByName(String name);

    List<User> queryStudentByCode(String code);

    List<Course> queryCourseByName(String name);
}
