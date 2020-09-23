package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.ClassStudent;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.User;

import java.util.List;

public interface AddintroService {
    int insertClass(List<Clazz> clazzes);

    int insertCourse(List<Course> courses);

    int insertUser(List<User> users);

    int insertStudentToClass(List<ClassStudent> classStudents);
}
