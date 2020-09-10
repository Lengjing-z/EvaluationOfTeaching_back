package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class TeacherAnswer {
    private int id;
    private int tttid;
    private int qid;
    private int valuatorid;
    private int bevaluatorid;
    private String answer;
}
