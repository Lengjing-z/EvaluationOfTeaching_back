package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class StudentAnswer {
    private int id;
    private int sttId;
    private int stId;
    private int qsId;
    private String answer;
}
