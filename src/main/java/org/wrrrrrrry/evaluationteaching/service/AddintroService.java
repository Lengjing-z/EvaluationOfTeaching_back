package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;

public interface AddintroService {
    int insertClass(List<Clazz> clazzes);

    int insertCourse(List<Course> courses);

    int insertUser(List<User> users);

    int insertStudentToClass(List<ClassStudent> classStudents);

    int insertTeacherToCourse(List<CourseClassTeacher> courseClassTeachers);
}
