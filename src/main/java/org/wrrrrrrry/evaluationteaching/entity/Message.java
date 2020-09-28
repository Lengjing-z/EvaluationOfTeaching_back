package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Message {
    private int id;
    private int uId;
    private int sttId;
    private int tttId;
    private String context;
    private String startedTime;
    private boolean isRead;
    private boolean isFinished;
}
