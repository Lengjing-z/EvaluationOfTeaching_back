package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

import java.util.Date;

@Data
public class StudentToTeacher {
    private int id;
    private int midId;
    private int qnId;
    private Date beginTime;
    private Date endTime;
}
