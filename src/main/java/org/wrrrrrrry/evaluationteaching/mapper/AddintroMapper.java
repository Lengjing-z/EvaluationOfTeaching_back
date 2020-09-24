package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;

@Repository
public interface AddintroMapper {
    int insertClass(@Param("clazzes") List<Clazz> clazzes);

    int insertCourse(@Param("courses") List<Course> courses);

    int insertUser(@Param("users") List<User> users);

    void insertUserPower(@Param("userPower") List list);

    int insertStudentToClass(@Param("classStudents") List<ClassStudent> classStudents);

    int insertTeacherToCourse(@Param("courseClassTeachers") List<CourseClassTeacher> courseClassTeachers);
}
