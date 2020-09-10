package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class StudentAnswer {
    private int id;
    private int speid;
    private int sid;
    private int qid;
    private String answer;
}
