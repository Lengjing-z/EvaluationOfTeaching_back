package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class TeacherAnswer {
    private int id;
    private int tttId;
    private int qsId;
    private int valuatorId;
    private int beValuatorId;
    private String answer;
}
